package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIlli(boolean moving, boolean closeToEdge, boolean safeToRelease, double directionX, double directionZ, double distance) {
}
