package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.1ii;
import dev.virel.obf.IlllI;
import dev.virel.obf.iI1;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1747;
import net.minecraft.class_1750;
import net.minecraft.class_2246;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_1747.class})
public abstract class aaaaawg {
   @Shadow
   protected abstract boolean method_20360();

   @Inject(
      method = {"method_7709"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$onCanPlace(class_1750 var1, class_2680 var2, CallbackInfoReturnable<Boolean> var3) {
      aaaaady var4 = aaaaady.get();
      if (var4 != null && var4.modules() != null) {
         iI1 var5 = var4.modules().short iI();
         boolean var6 = var5 != null && var5.byte iII1();
         if (!var6 && var2.method_27852(class_2246.field_10343)) {
            IlllI var7 = var4.modules().return iI();
            var6 = var7 != null && var7.byte iII1();
            if (!var6) {
               1ii var8 = var4.modules().switch iI();
               var6 = var8 != null && var8.strictfp Illi();
            }
         }

         if (var6) {
            var3.setReturnValue(!this.method_20360() || var2.method_26184(var1.method_8045(), var1.method_8037()));
         }
      }
   }
}
