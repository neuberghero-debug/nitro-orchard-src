package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.IiI11;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1291;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_5636;
import net.minecraft.class_6880;
import net.minecraft.class_7286;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_7286.class})
public abstract class aaaaatm {
   @Shadow
   public abstract class_6880<class_1291> method_42590();

   @Inject(
      method = {"method_42593"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$hideStatusEffectFog(class_5636 var1, class_1297 var2, CallbackInfoReturnable<Boolean> var3) {
      if (this.shouldHideFog(var2)) {
         var3.setReturnValue(false);
      }
   }

   private boolean shouldHideFog(class_1297 var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null && var2.field_1724 != null && var1 == var2.field_1724) {
         class_6880 var3 = this.method_42590();
         if (!class_1294.field_5919.equals(var3) && !class_1294.field_38092.equals(var3)) {
            return false;
         } else {
            aaaaady var4 = aaaaady.get();
            if (var4 == null) {
               return false;
            } else {
               IiI11 var5 = var4.modules().double iI(IiI11.class);
               return var5 != null && var5.break II1lI(var3);
            }
         }
      } else {
         return false;
      }
   }
}
