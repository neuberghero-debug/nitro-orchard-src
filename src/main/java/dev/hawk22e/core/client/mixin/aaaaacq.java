package dev.hawk22e.core.client.mixin;

import dev.virel.obf.iIiI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class aaaaacq {
   @Inject(
      method = {"method_5851"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$forceGlow(CallbackInfoReturnable<Boolean> var1) {
      class_1297 var2 = (class_1297)this;
      if (iIiI.protected IIiI(var2.method_5667())) {
         var1.setReturnValue(true);
      }
   }

   @Inject(
      method = {"method_22861"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$overrideGlowColor(CallbackInfoReturnable<Integer> var1) {
      class_1297 var2 = (class_1297)this;
      if (iIiI.protected IIiI(var2.method_5667())) {
         var1.setReturnValue(iIiI.while iI(var2.method_5667()));
      }
   }
}
