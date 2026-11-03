package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record 1I11(String version, int build, int subversion, String mcTarget, String downloadUrl, String notesUrl) {
}
