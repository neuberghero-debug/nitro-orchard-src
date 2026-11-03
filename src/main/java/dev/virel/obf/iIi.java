package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record iIi(String name, String health, double cardLeft, double cardTop, double cardWidth, double nameX, double healthX) {
}
