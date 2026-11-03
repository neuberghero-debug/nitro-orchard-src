package dev.virel.obf;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record Iilli(int deleted, List<1Ill> pending) {
}
