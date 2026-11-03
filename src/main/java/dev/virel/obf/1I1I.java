package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record 1I1I(
   double range,
   float fovRadiusDegrees,
   boolean smart,
   iI1l bodyAimPart,
   boolean priorityHead,
   boolean priorityChest,
   boolean priorityLegs,
   boolean stableUpperBody,
   boolean yieldWhenCrosshairSatisfied,
   boolean centerAim,
   double edgeOffset
) {
}
