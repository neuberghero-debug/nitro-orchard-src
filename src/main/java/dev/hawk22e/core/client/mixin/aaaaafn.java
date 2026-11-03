package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.hawk22e.core.client.aaaaarc;
import dev.virel.obf.1IlI;
import dev.virel.obf.1iii;
import dev.virel.obf.1lii;
import dev.virel.obf.1lli;
import dev.virel.obf.Ii1Il;
import dev.virel.obf.iI11;
import dev.virel.obf.iill;
import dev.virel.obf.l1;
import dev.virel.obf.lil;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_636;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_636.class})
public abstract class aaaaafn {
   @Unique
   private int ilovcats$silentInteractionScopes;

   @Inject(
      method = {"method_2911"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$suppressPhysicalSlotResyncDuringSilentAction(CallbackInfo var1) {
      if (1IlI.int i1il()) {
         var1.cancel();
      }
   }

   @Inject(
      method = {"method_2918"},
      at = {@At("HEAD")}
   )
   private void ilovcats$beginSilentAttackInteraction(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      if (1IlI.interface i1ii()) {
         this.ilovcats$silentInteractionScopes++;
      }
   }

   @Inject(
      method = {"method_2918"},
      at = {@At("RETURN")}
   )
   private void ilovcats$finishSilentAttackInteraction(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      this.ilovcats$endOneSilentInteractionScope();
   }

   @Inject(
      method = {"method_2910"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void q13c1c1f2(class_2338 var1, class_2350 var2, CallbackInfoReturnable<Boolean> var3) {
      aaaaady var4 = aaaaady.get();
      if (var4 != null) {
         1lii var5 = var4.modules().double iI(1lii.class);
         if (var5 != null) {
            var5.switch IIiI(class_310.method_1551(), var1, var2);
         }

         Ii1Il var6 = var4.modules().abstract iI();
         if (var6 != null && var6.short Iiil(class_310.method_1551())) {
            var3.setReturnValue(false);
         } else {
            iill var7 = var4.modules().interface iI();
            if (var7 != null) {
               if (var7.return IIiI(var1, var2)) {
                  var3.setReturnValue(true);
               }
            }
         }
      }
   }

   @Inject(
      method = {"method_2896"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void q8e2f2a8a(class_746 var1, class_1268 var2, class_3965 var3, CallbackInfoReturnable<class_1269> var4) {
      if (1IlI.interface i1ii()) {
         this.ilovcats$silentInteractionScopes++;
      }

      aaaaady var5 = aaaaady.get();
      if (var5 != null) {
         Ii1Il var6 = var5.modules().abstract iI();
         if (var6 != null && var6.short Iiil(class_310.method_1551())) {
            this.ilovcats$endOneSilentInteractionScope();
            var4.setReturnValue(class_1269.field_5814);
         } else {
            iI11 var7 = var5.modules().double iI(iI11.class);
            if (var7 != null && var7.strictfp i1Il(class_310.method_1551(), var3)) {
               this.ilovcats$endOneSilentInteractionScope();
               var4.setReturnValue(class_1269.field_5814);
            } else {
               l1 var8 = var5.modules().native iI();
               if (var8 != null) {
                  var8.strictfp II1lI(class_310.method_1551(), var2, var3);
               }

               1iii var9 = var5.modules().double iI();
               if (var9 != null && (var8 == null || !var8.transient i11I())) {
                  var9.int I1ii(class_310.method_1551(), var2, var3);
               }

               1lli var10 = var5.modules().break iI();
               boolean var11 = var8 != null && var8.transient i11I() || var9 != null && var9.while l1II();
               if (!var11 && var10 != null && var10.short IIiI(class_310.method_1551(), var2, var3)) {
                  if (var8 != null) {
                     var8.protected I1II(class_310.method_1551(), var2, var3);
                  }

                  if (var9 != null) {
                     var9.static Iiii1();
                  }

                  this.ilovcats$endOneSilentInteractionScope();
                  var4.setReturnValue(class_1269.field_5814);
               } else {
                  aaaaarc var12 = var5.modules().static iI();
                  if (var12 != null && !var12.isInternalPlacement()) {
                     var12.captureRailPlacementAttempt(class_310.method_1551(), var2, var3);
                  }

                  lil var13 = var5.modules().double iI();
                  if (var13 != null) {
                     var13.short IIiI(class_310.method_1551(), var2, var3);
                  }

                  iill var14 = var5.modules().interface iI();
                  if (var14 != null && var14.byte iII1()) {
                     if (var14.final IiII(class_310.method_1551())) {
                        this.ilovcats$endOneSilentInteractionScope();
                        var4.setReturnValue(class_1269.field_5814);
                     }
                  }
               }
            }
         }
      }
   }

   @Inject(
      method = {"method_2919"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$cancelItemInteractionDuringTotem(class_1657 var1, class_1268 var2, CallbackInfoReturnable<class_1269> var3) {
      if (1IlI.interface i1ii()) {
         this.ilovcats$silentInteractionScopes++;
      }

      aaaaady var4 = aaaaady.get();
      if (var4 != null) {
         Ii1Il var5 = var4.modules().abstract iI();
         if (var5 != null && var5.short Iiil(class_310.method_1551())) {
            this.ilovcats$endOneSilentInteractionScope();
            var3.setReturnValue(class_1269.field_5814);
         }
      }
   }

   @Inject(
      method = {"method_2919"},
      at = {@At("RETURN")}
   )
   private void ilovcats$finishSilentItemInteraction(class_1657 var1, class_1268 var2, CallbackInfoReturnable<class_1269> var3) {
      this.ilovcats$endOneSilentInteractionScope();
   }

   @Unique
   private void ilovcats$endOneSilentInteractionScope() {
      if (this.ilovcats$silentInteractionScopes > 0) {
         this.ilovcats$silentInteractionScopes--;
         1IlI.strictfp i1ll();
      }
   }

   @Inject(
      method = {"method_2896"},
      at = {@At("RETURN")}
   )
   private void q69dc0e30(class_746 var1, class_1268 var2, class_3965 var3, CallbackInfoReturnable<class_1269> var4) {
      this.ilovcats$endOneSilentInteractionScope();
      aaaaady var5 = aaaaady.get();
      if (var5 != null) {
         l1 var6 = var5.modules().native iI();
         if (var6 != null) {
            var6.byte II1lI(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

         1iii var7 = var5.modules().double iI();
         if (var7 != null) {
            var7.break I1II(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

         aaaaarc var8 = var5.modules().static iI();
         if (var8 != null) {
            var8.onRailPlacementResult(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }
      }
   }
}
