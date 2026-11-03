package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIl1i(String itemSignature, int count, int clickedAtTick) {
}
