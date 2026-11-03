package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_745;

@Environment(EnvType.CLIENT)
record Ii1ll(class_745 player, long createdAt, double x, double y, double z, float bodyYaw) {
}
