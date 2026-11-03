package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;

@Environment(EnvType.CLIENT)
record IliiI(class_2338 pos, int tier, double occupancy, double projectedDistanceSquared, double lateralDistance, double progress) {
}
