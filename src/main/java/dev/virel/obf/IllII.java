package dev.virel.obf;

import java.nio.file.attribute.FileTime;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IllII(Object fileKey, long size, FileTime creationTime, FileTime modifiedTime) {
}
