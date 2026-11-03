package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record II1il(String labelText, String valueText, double labelWidth, double valueWidth, double totalTextWidth) {
}
