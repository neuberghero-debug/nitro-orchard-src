package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record II11i(
   int entityId,
   class_243 targetPos,
   float angleFactor,
   double score,
   float fovRadiusDegrees,
   boolean trackedTarget,
   float selfHorizontalSpeed,
   float targetHorizontalSpeed,
   boolean stableUpperBody,
   boolean aimSatisfied
) {
}
