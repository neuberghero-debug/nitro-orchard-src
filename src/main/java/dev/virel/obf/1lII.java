package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record 1lII(double gravity, double drag, double waterDrag, double underwaterGravity, boolean hasWaterCollision, 1il order) {
}
