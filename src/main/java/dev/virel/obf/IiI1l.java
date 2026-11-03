package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import net.minecraft.class_4604;
import net.minecraft.class_757;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
record IiI1l(class_4184 camera, class_4604 frustum, class_757 gameRenderer, Matrix4f viewMatrix, Matrix4f projectionMatrix) {
}
