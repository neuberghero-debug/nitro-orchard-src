package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record IIIll(int entityId, class_243 targetPos, float angleFactor, double score, double distance, double angularDistance, double health) {
}
