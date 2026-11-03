package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_338;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_338.class})
public abstract class aaaaagk {
   @Inject(
      method = {"method_1812"},
      at = {@At("HEAD")},
      require = 0
   )
   private void ilovcats$onIncomingChatLine(class_2561 var1, CallbackInfo var2) {
      aaaaady var3 = aaaaady.get();
      if (var3 != null && var3.modules() != null && var1 != null) {
         var3.modules().for I1(var1.getString());
      }
   }
}
