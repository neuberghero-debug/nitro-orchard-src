package dev.virel.obf;

import java.nio.file.Path;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record Il1I(int deleted, List<Path> failures) {
}
