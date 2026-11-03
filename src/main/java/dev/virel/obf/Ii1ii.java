package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;

@Environment(EnvType.CLIENT)
record Ii1ii(
   boolean available,
   String mediaId,
   String title,
   String artist,
   String album,
   long positionMs,
   long durationMs,
   boolean playing,
   long observedAtMs,
   class_2960 artwork,
   lIli lyrics
) {
}
