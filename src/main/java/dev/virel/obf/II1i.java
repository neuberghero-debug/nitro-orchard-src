package dev.virel.obf;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record II1i(List<class_243> points, boolean hit, class_1297 hitEntity) {
}
