package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record II1lI(
   float smoothness,
   float reactionTimeSeconds,
   float aimDrift,
   float handTremor,
   float pitchRatio,
   float horizontalSpeed,
   float verticalSpeed,
   float deadzoneDegrees
) {
}
