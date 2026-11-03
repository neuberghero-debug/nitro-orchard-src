package dev.virel.obf;

import java.util.function.Consumer;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;

@Environment(EnvType.CLIENT)
record IIi1I(Predicate<class_2596<?>> shouldHold, Consumer<class_2596<?>> observer) {
}
