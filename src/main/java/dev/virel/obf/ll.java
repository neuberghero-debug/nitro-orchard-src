package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record ll(boolean centerSupported, double supportRatio, double leadingSupportRatio) {
}
