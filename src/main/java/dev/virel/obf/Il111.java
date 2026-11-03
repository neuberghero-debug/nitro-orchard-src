package dev.virel.obf;

import java.awt.image.BufferedImage;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record Il111(BufferedImage image, int scaledWidth, int scaledHeight, long capturedAtMs) {
}
