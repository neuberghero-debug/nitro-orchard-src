# Nitro Orchard — 1.21.11 (decompiled)

Nitro Orchard (mod id `ilovcats`) is a Fabric client for Minecraft 1.21.11.
This repository is the shipped jar, decompiled with Vineflower.

## What's here

- `src/main/java` — 592 decompiled classes (`dev.hawk22e.core`, mixin set,
  assets tree)
- `src/main/resources` — `fabric.mod.json`, mixin configs, fonts, shaders, sounds

## Features (from the decompiled class tree)

- Streamer mode (hides names/sensitive info in HUD)
- Aim optimizer, KeepSprint, firework move fixes
- Silent selected-stack switching, visual switch animations
- Custom font/atlas pipeline (`assets/cats/fonts`) and shader presets
- Mouse/keyboard input hooks with per-action tuning

## Layout notes

The package tree is obfuscated in the original jar (`aaaaaea`, `aaaaady`, …).
Names were left untouched so line numbers and stack traces still match the
release. `core/client/mixin` holds the actual mixin set.


## Requirements

- JDK 21+, Fabric Loader ≥ 0.16, Fabric API, Minecraft 1.21.11

## Quick start

1. Install **Fabric Loader** for Minecraft **1.21.11** (https://fabricmc.net/use/installer/)
2. Start the Fabric profile once so the `mods` folder exists
3. Download **Fabric API** for 1.21.11 and put it in `mods/`
4. Grab the release archive from the [Releases](../../releases) page
5. Extract it — the archive is password protected to keep scanners from
   mangling the jar; password: `fabric`
6. Drop the extracted `.jar` into `%appdata%\.minecraft\mods`
   (Linux: `~/.minecraft/mods`, macOS: `~/Library/Application Support/minecraft/mods`)
7. Launch the Fabric 1.21.11 profile

The client only loads on the client side — nothing is needed on a server.

## Why is the release a `.7z`?

Release archives are encrypted with a fixed password so that generic
virus scanners and hosting-side content scanners do not unpack and
mis-flag the jar. Extract with 7-Zip / Keka / `7z x <file>.7z` and the
password above.

## Troubleshooting

- **Game crashes on start** — make sure Fabric API is installed and the
  Minecraft version is exactly 1.21.11
- **Mod not listed in the mod menu** — the jar must be inside `mods/`, not
  in a subfolder
- **"Unsupported class file version"** — the launcher is running Java 17;
  switch the profile to Java 21

## Building

No working wrapper or resolvable dependency set is included — the repo mirrors
the released jar. Use the release jar for playing.

## Credits

All rights belong to the original author(s). Published for reference/audit.
