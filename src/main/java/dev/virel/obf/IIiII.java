package dev.virel.obf;

import java.nio.file.Path;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record IIiII(boolean started, int jarsDeleted, int jarsDeferredUntilExit, int dataPathsDeleted, List<Path> failures) {
}
