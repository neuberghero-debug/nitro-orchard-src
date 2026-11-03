package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11244;
import net.minecraft.class_8030;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
record IlIll(
   Matrix3x2fc pose,
   float x,
   float y,
   float width,
   float height,
   float radius,
   float stroke,
   int color,
   boolean outline,
   @Nullable class_8030 scissorArea,
   @Nullable class_8030 bounds
) implements class_11244 {
}
