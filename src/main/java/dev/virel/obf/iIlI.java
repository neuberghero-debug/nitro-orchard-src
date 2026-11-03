package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record iIlI(String name, String bind, boolean enabled) {
}
