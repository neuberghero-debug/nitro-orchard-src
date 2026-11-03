package dev.hawk22e.core.client.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1661;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_1661.class})
public interface aaaaahk {
   @Accessor("field_7545")
   int ilovcats$getSelectedSlot();

   @Accessor("field_7545")
   void ilovcats$setSelectedSlot(int var1);
}
