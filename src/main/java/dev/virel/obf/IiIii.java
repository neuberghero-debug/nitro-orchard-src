package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;

@Environment(EnvType.CLIENT)
record IiIii(class_1657 player, double screenX, double screenY, double distanceSq, double topY) {
}
