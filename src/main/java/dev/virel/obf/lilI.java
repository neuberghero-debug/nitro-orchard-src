package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record lilI(
   boolean available, String mediaId, String title, String artist, String album, long positionMs, long durationMs, boolean playing, byte[] artworkBytes
) {
}
