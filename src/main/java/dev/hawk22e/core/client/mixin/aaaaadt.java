package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.111I;
import dev.virel.obf.1IlI;
import dev.virel.obf.IIII;
import dev.virel.obf.IiIl1;
import dev.virel.obf.IiiIi;
import dev.virel.obf.IllIl;
import dev.virel.obf.iIIl;
import dev.virel.obf.ii;
import dev.virel.obf.ilii;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_239;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_310.class})
public abstract class aaaaadt {
   @Unique
   private class_239 ilovcats$originalAttackTarget;
   @Unique
   private boolean ilovcats$historicalAttackTargetActive;

   @Inject(
      method = {"method_1574"},
      at = {@At("HEAD")}
   )
   private void ilovcats$beginPacketEpochForClientTick(CallbackInfo var1) {
      iIIl.beginInputPacketEpoch();
   }

   @Inject(
      method = {"method_1508"},
      at = {@At("HEAD")}
   )
   private void ilovcats$runModulesBeforeInput(CallbackInfo var1) {
      aaaaady var2 = aaaaady.get();
      if (var2 != null) {
         class_310 var3 = class_310.method_1551();
         if (var2.modules().transient iI() != null && var2.modules().transient iI().byte iII1() && var3 != null && var3.field_1690 != null) {
            class_304 var4 = var3.field_1690.field_1824;
            if (var4 != null) {
               1IlI.int I1II(var4);
               var4.method_23481(false);
            }
         }

         if (var3 != null && var3.field_1690 != null) {
            boolean var6 = var2.modules().transient iI() != null && var2.modules().transient iI().enum IilI1();
            boolean var5 = var2.modules().int IIiI() != null && var2.modules().int IIiI().enum IiIl();
            if (IIII.enum i1li(var3) || 1IlI.switch i1l1() || IiiIi.for IIIl1() || var6 || var5) {
               1IlI.synchronized III1(var3);
            }
         }

         var2.modules().volatile iiI1(var3);
      }
   }

   @Inject(
      method = {"method_1508"},
      at = {@At("TAIL")}
   )
   private void ilovcats$runAutoHitOnInput(CallbackInfo var1) {
      aaaaady var2 = aaaaady.get();
      if (var2 != null) {
         class_310 var3 = class_310.method_1551();

         try {
            var2.modules().protected Illi(var3);
         } finally {
            1IlI.for 1(var3);
         }
      }
   }

   @Inject(
      method = {"method_1536"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$flushLagRangeBeforeManualAttack(CallbackInfoReturnable<Boolean> var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null) {
         this.ilovcats$restoreHistoricalAttackTarget(var2);
         if (1IlI.private iil1() || !IIII.enum i1li(var2) && !1IlI.switch i1l1() && !IiiIi.for IIIl1()) {
            aaaaady var3 = aaaaady.get();
            if (var3 != null && var3.modules() != null) {
               class_3966 var4 = this.ilovcats$selectHistoricalAttackTarget(var2, var3);
               if (var4 != null) {
                  this.ilovcats$originalAttackTarget = var2.field_1765;
                  this.ilovcats$historicalAttackTargetActive = true;
                  var2.field_1765 = var4;
               }

               111I var5 = var3.modules().transient iI();
               if (var5 != null && var5.return I1il(var2)) {
                  this.ilovcats$restoreHistoricalAttackTarget(var2);
                  var1.setReturnValue(false);
               } else {
                  if (var2.field_1765 instanceof class_3966 var6 && var3.modules().transient iI() != null) {
                     var3.modules().transient iI().volatile lI11(var6.method_17782());
                  }

                  if (var2.field_1765 instanceof class_3966 var8 && 1IlI.abstract III1(var2, var8.method_17782())) {
                     1IlI.short I11(var2);
                     var1.setReturnValue(false);
                     return;
                  }

                  if (!1IlI.private iil1()) {
                     IllIl var9 = var3.modules().float iI();
                     if (var9 != null && var9.break l11I(var2)) {
                        var1.setReturnValue(false);
                     }
                  }
               }
            }
         } else {
            var1.setReturnValue(false);
         }
      }
   }

   @Inject(
      method = {"method_1536"},
      at = {@At("RETURN")}
   )
   private void ilovcats$restoreHistoricalTargetOnReturn(CallbackInfoReturnable<Boolean> var1) {
      this.ilovcats$restoreHistoricalAttackTarget(class_310.method_1551());
   }

   @Inject(
      method = {"method_1583"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$cancelDoItemUse(CallbackInfo var1) {
      class_310 var2 = class_310.method_1551();
      if (IIII.enum i1li(var2) || 1IlI.switch i1l1() || IiiIi.for IIIl1()) {
         var1.cancel();
      }
   }

   @Inject(
      method = {"method_1583"},
      at = {@At("RETURN")}
   )
   private void ilovcats$applyFpCd(CallbackInfo var1) {
      aaaaady var2 = aaaaady.get();
      if (var2 != null && var2.modules() != null) {
         ilii var3 = var2.modules().double iI(ilii.class);
         if (var3 != null) {
            var3.volatile IiI(class_310.method_1551());
         }

         IiIl1 var4 = var2.modules().double iI(IiIl1.class);
         if (var4 != null) {
            var4.strictfp IIiIl(class_310.method_1551());
         }
      }
   }

   @Unique
   private void ilovcats$restoreHistoricalAttackTarget(class_310 var1) {
      if (this.ilovcats$historicalAttackTargetActive) {
         if (var1 != null) {
            var1.field_1765 = this.ilovcats$originalAttackTarget;
         }

         this.ilovcats$originalAttackTarget = null;
         this.ilovcats$historicalAttackTargetActive = false;
      }
   }

   @Unique
   private class_3966 ilovcats$selectHistoricalAttackTarget(class_310 var1, aaaaady var2) {
      return var1 != null && var2 != null && var2.modules() != null ? null : null;
   }

   @Inject(
      method = {"method_1490"},
      at = {@At("HEAD")}
   )
   private void ilovcats$saveConfigOnStop(CallbackInfo var1) {
      aaaaady var2 = aaaaady.get();
      if (var2 != null && !ii.class 1I()) {
         var2.saveConfigNow();
      }
   }
}
