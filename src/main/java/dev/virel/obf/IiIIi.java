package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import net.minecraft.class_757;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
record IiIIi(class_4184 camera, class_757 gameRenderer, Matrix4f viewMatrix, Matrix4f projectionMatrix) {
}
