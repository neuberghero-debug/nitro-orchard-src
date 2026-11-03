package dev.virel.obf;

import java.nio.file.Path;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record 1Ill(Path path, String sha256, boolean loadedOrigin) {
}
