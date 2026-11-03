package dev.virel.obf;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record liIi(List<Integer> readySlots, int totalSlots) {
}
