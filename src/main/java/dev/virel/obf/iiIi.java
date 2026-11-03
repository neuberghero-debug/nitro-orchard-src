package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;

@Environment(EnvType.CLIENT)
public record iiIi(
   String slug,
   String optionLabel,
   class_2960 texture,
   int sourceWidth,
   int sourceHeight,
   float tabWidth,
   float tabHeight,
   float nametagWidth,
   float nametagHeight
) {
}
