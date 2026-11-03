package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.Ii1Il;
import dev.virel.obf.Iili;
import dev.virel.obf.lil1;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_2616;
import net.minecraft.class_2663;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_742;
import net.minecraft.class_8143;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_634.class})
public abstract class aaaaaex {
   @Inject(
      method = {"method_45729"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$handleDotCommand(String var1, CallbackInfo var2) {
      aaaaady var3 = aaaaady.get();
      if (var3 != null && var3.modules() != null && var3.modules().return I1II(var1)) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"method_11148"},
      at = {@At("TAIL")}
   )
   private void ilovcats$onEntityStatus(class_2663 var1, CallbackInfo var2) {
      aaaaady var3 = aaaaady.get();
      if (var3 != null) {
         class_310 var4 = class_310.method_1551();
         if (var4.field_1687 != null) {
            class_1297 var5 = var1.method_11469(var4.field_1687);
            if (var5 != null && var3.modules() != null) {
               var3.modules().while IIiI(var5, var1.method_11470());
            }

            if (var1.method_11470() == 35) {
               if (var4.field_1724 != null && var5 != null && var5.method_5628() == var4.field_1724.method_5628()) {
                  Ii1Il var6 = var3.modules().abstract iI();
                  if (var6 != null) {
                     var6.int llil();
                  }
               }

               lil1 var8 = var3.modules().abstract iI();
               if (var8 != null && var8.byte iII1() && var5 instanceof class_742 var7) {
                  var8.final IIiI(var7);
               }
            }
         }
      }
   }

   @Inject(
      method = {"method_49034"},
      at = {@At("TAIL")}
   )
   private void ilovcats$onEntityDamage(class_8143 var1, CallbackInfo var2) {
      aaaaady var3 = aaaaady.get();
      if (var3 != null && var3.modules() != null) {
         class_310 var4 = class_310.method_1551();
         if (var4.field_1724 != null && var4.field_1687 != null && var1.comp_1267() == var4.field_1724.method_5628()) {
            Iili var5 = var3.modules().for iI();
            if (var5 != null && var5.byte iII1()) {
               var5.static iI(var1.method_49071(var4.field_1687));
            }
         }
      }
   }

   @Inject(
      method = {"method_11160"},
      at = {@At("HEAD")}
   )
   private void ilovcats$onEntityAnimation(class_2616 var1, CallbackInfo var2) {
      aaaaady var3 = aaaaady.get();
      if (var3 != null && var3.modules() != null) {
         class_310 var4 = class_310.method_1551();
         if (var4.field_1687 != null) {
            class_1297 var5 = var4.field_1687.method_8469(var1.method_11269());
            if (var5 != null) {
               var3.modules().int IIiI(var5, var1.method_11267());
            }
         }
      }
   }
}
