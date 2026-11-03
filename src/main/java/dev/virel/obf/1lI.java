package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record 1lI(String value, boolean changed, boolean continueStripping) {
}
