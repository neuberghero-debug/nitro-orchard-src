package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.lli;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_1309.class})
public abstract class aaaaahm {
   @Inject(
      method = {"method_6028"},
      at = {@At("RETURN")},
      cancellable = true,
      require = 0
   )
   private void ilovcats$overrideSwingDuration(CallbackInfoReturnable<Integer> var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null && var2.field_1724 == this) {
         aaaaady var3 = aaaaady.get();
         if (var3 != null) {
            lli var4 = var3.modules().long IIiI();
            if (var4 != null && var4.native iiI()) {
               var1.setReturnValue(var4.transient ll((Integer)var1.getReturnValue()));
            }
         }
      }
   }
}
