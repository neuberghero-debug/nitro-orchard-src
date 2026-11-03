package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.1i1l;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1920;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_778;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_778.class})
public abstract class aaaaaxj {
   @Inject(
      method = {"method_68826"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void ilovcats$onShouldDrawFace(
      class_1920 var0, class_2680 var1, boolean var2, class_2350 var3, class_2338 var4, CallbackInfoReturnable<Boolean> var5
   ) {
      class_310 var6 = class_310.method_1551();
      if (var6.field_1724 != null) {
         aaaaady var7 = aaaaady.get();
         if (var7 != null && var7.modules() != null) {
            1i1l var8 = 1i1l.abstract II1lI();
            if (var8 != null && var8.byte iII1()) {
               class_2338 var9 = var6.field_1724.method_24515();
               int var10 = (Integer)var6.field_1690.method_42503().method_41753();
               int var11 = Math.max(1, Math.min(var10, 8));
               class_2338 var12 = var4.method_10093(var3.method_10153());
               int var13 = Math.abs((var12.method_10263() >> 4) - (var9.method_10263() >> 4));
               int var14 = Math.abs((var12.method_10260() >> 4) - (var9.method_10260() >> 4));
               if (var13 <= var11 && var14 <= var11) {
                  if (var8.switch I1il(var1)) {
                     var5.setReturnValue(true);
                  } else {
                     var5.setReturnValue(false);
                  }
               }
            }
         }
      }
   }
}
