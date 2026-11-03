package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11244;
import net.minecraft.class_8030;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
record IilIl(
   Matrix3x2fc pose,
   float centerX,
   float centerY,
   float quadRadius,
   float circleRadius,
   float stroke,
   int mode,
   int color,
   @Nullable class_8030 scissorArea,
   @Nullable class_8030 bounds
) implements class_11244 {
}
