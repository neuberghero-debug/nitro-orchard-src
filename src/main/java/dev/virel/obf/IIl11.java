package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIl11(double minX, double minY, double maxX, double maxY) {
}
