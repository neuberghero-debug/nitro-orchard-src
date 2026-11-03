package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record IIll(class_1297 entity, class_243 pos, double distanceSq) {
}
