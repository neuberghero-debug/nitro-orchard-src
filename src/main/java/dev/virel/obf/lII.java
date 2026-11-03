package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record lII(double x, double y, double z, long timestampMs, double width, double height) {
}
