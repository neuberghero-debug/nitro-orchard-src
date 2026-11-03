package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record ll11(long id, IlIil type, String title, String description, long createdAtMs, long durationMs) {
}
