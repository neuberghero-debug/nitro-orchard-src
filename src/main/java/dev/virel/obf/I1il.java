package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record I1il(double minX, double maxX, double minY, double maxY, int count) {
}
