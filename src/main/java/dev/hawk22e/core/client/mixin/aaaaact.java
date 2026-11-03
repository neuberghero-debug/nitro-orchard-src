package dev.hawk22e.core.client.mixin;

import dev.virel.obf.IiiIl;
import dev.virel.obf.i1ii;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_897.class})
public abstract class aaaaact {
   @Inject(
      method = {"method_3921"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void ilovcats$suppressVanillaPlayerNametags(class_1297 var1, double var2, CallbackInfoReturnable<Boolean> var4) {
      if (IiiIl.return III1(var1) || i1ii.private IIiI(var1)) {
         var4.setReturnValue(false);
      }
   }
}
