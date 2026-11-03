package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.1IlI;
import dev.virel.obf.Ii1Il;
import dev.virel.obf.liII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_636.class})
public abstract class aaaaach {
   @Inject(
      method = {"method_2918"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$onPreAttackEntity(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      aaaaady var4 = aaaaady.get();
      if (var4 != null) {
         Ii1Il var5 = var4.modules().abstract iI();
         if (var5 != null && var5.short Iiil(class_310.method_1551())) {
            var3.cancel();
            return;
         }

         liII var6 = var4.modules().interface iI();
         if (var6 != null && var6.byte iII1() && !1IlI.for i1li() && var2 instanceof class_1309 var7) {
            var6.for 1liI(class_310.method_1551(), var7);
         }

         var4.modules().public I1(var2);
      }
   }

   @Inject(
      method = {"method_2918"},
      at = {@At("TAIL")}
   )
   private void ilovcats$onAttackEntity(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      1IlI.abstract i111();
      aaaaady var4 = aaaaady.get();
      if (var4 != null) {
         var4.modules().protected IiI(var2);
      }
   }
}
