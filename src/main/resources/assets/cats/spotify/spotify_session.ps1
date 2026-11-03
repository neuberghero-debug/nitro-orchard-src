$ErrorActionPreference = 'Stop'
[Console]::OutputEncoding = New-Object System.Text.UTF8Encoding($false)
Add-Type -AssemblyName System.Runtime.WindowsRuntime

function Await-WinRt($Operation, [Type]$ResultType) {
    $method = [System.WindowsRuntimeSystemExtensions].GetMethods() |
        Where-Object { $_.Name -eq 'AsTask' -and $_.IsGenericMethod -and $_.GetParameters().Count -eq 1 } |
        Select-Object -First 1
    $task = $method.MakeGenericMethod($ResultType).Invoke($null, @($Operation))
    $task.Wait()
    return $task.Result
}

function Get-MediaId([string]$Title, [string]$Artist, [string]$Album, [long]$DurationMs) {
    $bytes = [Text.Encoding]::UTF8.GetBytes("$Title`n$Artist`n$Album`n$DurationMs")
    $sha = [Security.Cryptography.SHA256]::Create()
    try {
        return ([BitConverter]::ToString($sha.ComputeHash($bytes))).Replace('-', '').ToLowerInvariant()
    } finally {
        $sha.Dispose()
    }
}

function Read-Thumbnail($Thumbnail) {
    if ($null -eq $Thumbnail) {
        return ''
    }
    $streamType = [Windows.Storage.Streams.IRandomAccessStreamWithContentType, Windows.Storage.Streams, ContentType=WindowsRuntime]
    $randomAccess = Await-WinRt ($Thumbnail.OpenReadAsync()) $streamType
    $method = [System.IO.WindowsRuntimeStreamExtensions].GetMethods() |
        Where-Object { $_.Name -eq 'AsStreamForRead' -and $_.GetParameters().Count -eq 1 } |
        Select-Object -First 1
    $stream = $method.Invoke($null, @($randomAccess))
    $memory = New-Object System.IO.MemoryStream
    try {
        $stream.CopyTo($memory)
        if ($memory.Length -le 0 -or $memory.Length -gt 2097152) {
            return ''
        }
        return [Convert]::ToBase64String($memory.ToArray())
    } finally {
        $stream.Dispose()
        $memory.Dispose()
    }
}

$managerType = [Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager, Windows.Media.Control, ContentType=WindowsRuntime]
$propertiesType = [Windows.Media.Control.GlobalSystemMediaTransportControlsSessionMediaProperties, Windows.Media.Control, ContentType=WindowsRuntime]
$manager = Await-WinRt ($managerType::RequestAsync()) $managerType
$lastMediaId = ''
$lastAvailable = $true

while ($true) {
    try {
        $session = $manager.GetSessions() |
            Where-Object { $_.SourceAppUserModelId -match 'spotify' } |
            Select-Object -First 1
        if ($null -eq $session) {
            if ($lastAvailable) {
                [pscustomobject]@{ available = $false } | ConvertTo-Json -Compress
                $lastAvailable = $false
            }
            Start-Sleep -Milliseconds 900
            continue
        }

        $properties = Await-WinRt ($session.TryGetMediaPropertiesAsync()) $propertiesType
        $timeline = $session.GetTimelineProperties()
        $playback = $session.GetPlaybackInfo()
        $durationMs = [Math]::Max(0, [long](($timeline.EndTime - $timeline.StartTime).TotalMilliseconds))
        $positionMs = [Math]::Max(0, [long](($timeline.Position - $timeline.StartTime).TotalMilliseconds))
        $mediaId = Get-MediaId $properties.Title $properties.Artist $properties.AlbumTitle $durationMs
        $artwork = ''
        if ($mediaId -ne $lastMediaId) {
            $artwork = Read-Thumbnail $properties.Thumbnail
        }

        [pscustomobject]@{
            available = $true
            mediaId = $mediaId
            title = $properties.Title
            artist = $properties.Artist
            album = $properties.AlbumTitle
            positionMs = $positionMs
            durationMs = $durationMs
            playing = ($playback.PlaybackStatus.ToString() -eq 'Playing')
            timelineUpdatedAtMs = $timeline.LastUpdatedTime.ToUnixTimeMilliseconds()
            artwork = $artwork
        } | ConvertTo-Json -Compress
        $lastMediaId = $mediaId
        $lastAvailable = $true
    } catch {
    }
    Start-Sleep -Milliseconds 900
}

