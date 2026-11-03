package dev.virel.obf;

import java.nio.file.Path;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record I1ii(int deleted, int deferred, List<Path> failures) {
}
