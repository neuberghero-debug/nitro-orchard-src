package dev.hawk22e.core.client.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11228;
import net.minecraft.class_11246;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_11228.class})
public interface StreamerGuiRendererMixin {
   @Accessor("field_59914")
   class_11246 ilovcats$getState();

   @Mutable
   @Accessor("field_59914")
   void ilovcats$setState(class_11246 var1);
}
