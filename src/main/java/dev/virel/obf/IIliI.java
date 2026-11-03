package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
public record IIliI(class_243 point, float rawYaw, float rawPitch, float rawYawDelta, float rawPitchDelta) {
}
