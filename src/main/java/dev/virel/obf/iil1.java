package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record iil1(String key, String label, String value, double labelWidth, double valueWidth, double totalTextWidth) {
}
