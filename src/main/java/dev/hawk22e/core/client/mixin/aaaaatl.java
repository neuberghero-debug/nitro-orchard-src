package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.IiI11;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1291;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import net.minecraft.class_6880;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_1309.class})
public abstract class aaaaatl {
   @Inject(
      method = {"method_66279"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$hideVisualStatusFade(class_6880<class_1291> var1, float var2, CallbackInfoReturnable<Float> var3) {
      if (this.shouldHide(var1)) {
         var3.setReturnValue(0.0F);
      }
   }

   private boolean shouldHide(class_6880<class_1291> var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null && var2.field_1724 != null && var2.field_1724 == this) {
         aaaaady var3 = aaaaady.get();
         if (var3 == null) {
            return false;
         } else {
            IiI11 var4 = var3.modules().double iI(IiI11.class);
            return var4 != null && var4.break II1lI(var1);
         }
      } else {
         return false;
      }
   }
}
