package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record I11(class_2338 placePos, class_2338 supportPos, class_2350 clickFace, class_243 aimPos, class_243 raycastPos) {
}
