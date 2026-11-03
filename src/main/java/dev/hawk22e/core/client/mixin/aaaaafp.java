package dev.hawk22e.core.client.mixin;

import dev.virel.obf.l1ii;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_412;
import net.minecraft.class_437;
import net.minecraft.class_639;
import net.minecraft.class_642;
import net.minecraft.class_9112;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_412.class})
public abstract class aaaaafp {
   @Inject(
      method = {"method_36877"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void utility$blockFadedJoin(class_437 var0, class_310 var1, class_639 var2, class_642 var3, boolean var4, class_9112 var5, CallbackInfo var6) {
      if (l1ii.for IIiI(var0, var1, var2, var3)) {
         var6.cancel();
      }
   }
}
