package dev.hawk22e.core.client.mixin;

import dev.virel.obf.1IlI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_329;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(EnvType.CLIENT)
@Mixin({class_329.class})
public abstract class VisualSwitchHudMixin {
   @Redirect(
      method = {"method_1759"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1661;method_67532()I"
      )
   )
   private int ilovcats$visualHotbarSelection(class_1661 var1) {
      return 1IlI.volatile III1(var1);
   }

   @Redirect(
      method = {"method_39191"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1661;method_7391()Lnet/minecraft/class_1799;"
      )
   )
   private class_1799 ilovcats$visualHeldItemTooltip(class_1661 var1) {
      return var1.field_7546 instanceof class_746 var2 ? 1IlI.interface IIiI(var2) : var1.method_7391();
   }
}
