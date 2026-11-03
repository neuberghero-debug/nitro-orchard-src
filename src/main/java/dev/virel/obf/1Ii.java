package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record 1Ii(double x, double y, double width, double height, double distanceSq, double healthPercent, double alpha) {
}
