package dev.hawk22e.core.client.mixin;

import dev.virel.obf.I1Iii;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_7172;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_765.class})
public abstract class aaaaauc {
   @Inject(
      method = {"method_42596"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void ilovcats$fullBrightNoDarkness(class_1309 var1, float var2, float var3, CallbackInfoReturnable<Float> var4) {
      if (I1Iii.break Iili1()) {
         var4.setReturnValue(0.0F);
      }
   }

   @Redirect(
      method = {"method_3313"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_7172;method_41753()Ljava/lang/Object;",
         ordinal = 2
      ),
      require = 0
   )
   private Object ilovcats$fullBrightGamma(class_7172<?> var1) {
      Object var2 = var1.method_41753();
      return I1Iii.break Iili1() && var2 instanceof Double ? 16.0 : var2;
   }
}
