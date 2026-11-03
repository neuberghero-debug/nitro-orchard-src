package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record Iii1i(
   int unicode,
   double advance,
   double planeLeft,
   double planeBottom,
   double planeRight,
   double planeTop,
   double atlasLeft,
   double atlasBottom,
   double atlasRight,
   double atlasTop
) {
}
