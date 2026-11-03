package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record iII(double x, double y, double width, double height, double distanceSq, long updatedAtMs) {
}
