package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.IiiI1;
import dev.virel.obf.iIIi;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_312.class})
public abstract class AimOptimizerMouseMixin {
   @Shadow
   private double field_1789;
   @Shadow
   private double field_1787;

   @Inject(
      method = {"method_55793"},
      at = {@At("HEAD")}
   )
   private void ilovcats$scaleMouseDeltaForAimOptimizer(CallbackInfo var1) {
      aaaaady var2 = aaaaady.get();
      if (var2 != null) {
         IiiI1 var3 = var2.modules();
         if (var3 != null) {
            iIIi var4 = var3.static iI();
            if (var4 != null && var4.return I1I()) {
               float var5 = var4.transient ll();
               this.field_1789 *= (double)var5;
               this.field_1787 *= (double)var5;
            }
         }
      }
   }
}
