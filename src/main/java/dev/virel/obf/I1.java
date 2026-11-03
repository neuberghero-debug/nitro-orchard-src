package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record I1(
   l1I holdingMode,
   1i swingMode,
   ili1 swingCurve,
   float equipSmoothing,
   float swingStrength,
   float swingRotationX,
   float swingRotationY,
   float swingRotationZ,
   float spinSpeed,
   float scale,
   float xOffset,
   float yOffset,
   float zOffset,
   float tilt,
   float rotationX,
   float rotationY,
   float rotationZ
) {
}
