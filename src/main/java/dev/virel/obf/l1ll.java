package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
record l1ll(class_746 player, int slot, int expectedSelectedSlot, int restoreTick) {
}
