package dev.hawk22e.core.client.mixin;

import dev.virel.obf.II1i1;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class aaaaaef {
   @Inject(
      method = {"method_5697"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$cancelEntityPush(class_1297 var1, CallbackInfo var2) {
      class_1297 var3 = (class_1297)this;
      class_746 var4 = class_310.method_1551().field_1724;
      if (var3 == var4 && II1i1.native iI(var3, var1)) {
         var2.cancel();
      }
   }
}
