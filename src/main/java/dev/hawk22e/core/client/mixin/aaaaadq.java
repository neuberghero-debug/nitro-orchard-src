package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.lIii;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_315;
import net.minecraft.class_743;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_743.class})
public abstract class aaaaadq extends class_744 {
   @Shadow
   private class_315 field_3902;

   @Inject(
      method = {"method_3129"},
      at = {@At("TAIL")},
      require = 0
   )
   private void ilovcats$applySimulatedKeys(CallbackInfo var1) {
      aaaaady var2 = aaaaady.get();
      if (var2 != null) {
         lIii var3 = var2.modules().interface iI();
         if (var3 != null) {
            var3.final iI(this.field_3902, this);
         }
      }
   }
}
