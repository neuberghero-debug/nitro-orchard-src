package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record 11I(
   float yawVarianceMin,
   float yawVarianceMax,
   float pitchVarianceMin,
   float pitchVarianceMax,
   float blendVarianceMin,
   float blendVarianceMax,
   float varianceDurationMin,
   float varianceDurationMax,
   float driftAmplitudeBlocks,
   float driftFrequencyScale,
   float stepJitterMultiplier,
   float tremorMultiplier,
   float twitchChanceMultiplier,
   float twitchMagnitudeMultiplier,
   float overshootMultiplier,
   float microPauseChanceMultiplier,
   float microPauseMinScale,
   float microPauseMaxScale,
   float microPauseDurationMultiplier,
   float restTriggerChance,
   float targetBlendMultiplier,
   float smoothTimeScale,
   float lockMultiplier
) {
}
