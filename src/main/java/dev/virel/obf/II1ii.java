package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record II1ii(class_2338 pos, class_243 hitPos, class_2338 supportPos, class_2350 clickFace, class_243 raycastPos, double distanceSq) {
}
