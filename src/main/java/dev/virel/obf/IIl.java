package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record IIl(class_243 point, float yaw, float pitch, float yawDelta, float pitchDelta, float rawYawDelta, float rawPitchDelta) {
}
