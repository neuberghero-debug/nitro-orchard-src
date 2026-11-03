package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11231;
import net.minecraft.class_11244;
import net.minecraft.class_8030;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
record I1I11(
   Matrix3x2fc pose,
   float x,
   float y,
   float width,
   float height,
   float u1,
   float v1,
   float u2,
   float v2,
   int color,
   class_11231 setup,
   @Nullable class_8030 scissorArea,
   @Nullable class_8030 bounds
) implements class_11244 {
}
