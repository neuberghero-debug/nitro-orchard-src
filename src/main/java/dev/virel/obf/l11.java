package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record l11(I11 action, I11 followUp, int restoreSlot, boolean followUpStage, int recoveries) {
}
