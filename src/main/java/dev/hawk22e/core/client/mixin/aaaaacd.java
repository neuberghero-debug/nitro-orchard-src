package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.ilIl;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_1671;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(EnvType.CLIENT)
@Mixin({class_1671.class})
public abstract class aaaaacd {
   @Redirect(
      method = {"method_5773"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1309;method_5720()Lnet/minecraft/class_243;"
      ),
      require = 0
   )
   private class_243 ilovcats$useServerRotationForFireworkBoost(class_1309 var1) {
      aaaaady var2 = aaaaady.get();
      if (var2 != null && var2.modules() != null) {
         ilIl var3 = var2.modules().volatile iI();
         return var3 == null ? var1.method_5720() : var3.protected Ii(var1);
      } else {
         return var1.method_5720();
      }
   }
}
