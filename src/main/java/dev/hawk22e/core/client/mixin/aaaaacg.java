package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaaap;
import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.1IlI;
import dev.virel.obf.1ii1;
import dev.virel.obf.I1IIl;
import dev.virel.obf.IIII;
import dev.virel.obf.Ii1Il;
import dev.virel.obf.Ii1l;
import dev.virel.obf.IiiIi;
import dev.virel.obf.Iil1I;
import dev.virel.obf.IilI;
import dev.virel.obf.Iili;
import dev.virel.obf.Il1Ii;
import dev.virel.obf.IlI11;
import dev.virel.obf.Iliil;
import dev.virel.obf.IllI;
import dev.virel.obf.Illl1;
import dev.virel.obf.Illll;
import dev.virel.obf.i1i1;
import dev.virel.obf.il1I;
import dev.virel.obf.ilIl;
import dev.virel.obf.lIii;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10185;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_744;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_746.class})
public abstract class aaaaacg {
   @Shadow
   public class_744 field_3913;
   @Unique
   private boolean ilovcats$savedForward;
   @Unique
   private boolean ilovcats$savedBack;
   @Unique
   private boolean ilovcats$savedLeft;
   @Unique
   private boolean ilovcats$savedRight;
   @Unique
   private boolean q015033d9;
   @Unique
   private boolean ilovcats$savedSneak;
   @Unique
   private boolean ilovcats$savedJump;
   @Unique
   private boolean ilovcats$savedAttack;
   @Unique
   private boolean ilovcats$savedUse;
   @Unique
   private boolean ilovcats$needsRestore;
   @Unique
   private boolean ilovcats$savedInteractionKeys;
   @Unique
   private boolean ilovcats$kbSuppressSprint;
   @Unique
   private boolean ilovcats$kbScaleMovement;
   @Unique
   private float ilovcats$kbCorrectionForward;
   @Unique
   private float ilovcats$kbCorrectionSideways;
   @Unique
   private boolean ilovcats$overrodeForward;
   @Unique
   private boolean ilovcats$overrodeBack;
   @Unique
   private boolean ilovcats$overrodeLeft;
   @Unique
   private boolean ilovcats$overrodeRight;
   @Unique
   private boolean ilovcats$overrodeSprint;
   @Unique
   private boolean ilovcats$overrodeSneak;
   @Unique
   private boolean ilovcats$overrodeJump;
   @Unique
   private boolean ilovcats$wasBlockingScreenMovement;

   @Inject(
      method = {"method_6007"},
      at = {@At("HEAD")},
      require = 0
   )
   private void ilovcats$beforeInputTick(CallbackInfo var1) {
      aaaaady var2 = aaaaady.get();
      if (var2 != null) {
         class_310 var3 = class_310.method_1551();
         if (var3.field_1690 != null) {
            if (IIII.while i(var3)) {
               this.ilovcats$restorePhysicalMovementKeys(var3);
            }

            boolean var10000;
            label173: {
               this.ilovcats$needsRestore = false;
               this.ilovcats$kbSuppressSprint = false;
               this.ilovcats$kbScaleMovement = false;
               this.ilovcats$kbCorrectionForward = 0.0F;
               this.ilovcats$kbCorrectionSideways = 0.0F;
               this.ilovcats$overrodeForward = false;
               this.ilovcats$overrodeBack = false;
               this.ilovcats$overrodeLeft = false;
               this.ilovcats$overrodeRight = false;
               this.ilovcats$overrodeSprint = false;
               this.ilovcats$overrodeSneak = false;
               this.ilovcats$overrodeJump = false;
               if (var3.field_1755 instanceof IllI var5 && var5.shouldAllowMovementInput()) {
                  var10000 = true;
                  break label173;
               }

               var10000 = false;
            }

            boolean var4 = var10000;
            boolean var20 = var3.field_1755 != null && !var4;
            if (this.ilovcats$wasBlockingScreenMovement && !var20) {
               this.ilovcats$syncPhysicalMovementKeys(var3);
            }

            this.ilovcats$wasBlockingScreenMovement = var20;
            if (var20) {
               this.ilovcats$clearMenuMovementInput(var3);
            } else {
               if (var4 && !IIII.class I1l(var3)) {
                  this.ilovcats$syncPhysicalMovementKeys(var3);
               }

               this.ilovcats$savedForward = var3.field_1690.field_1894.method_1434();
               this.ilovcats$savedBack = var3.field_1690.field_1881.method_1434();
               this.ilovcats$savedLeft = var3.field_1690.field_1913.method_1434();
               this.ilovcats$savedRight = var3.field_1690.field_1849.method_1434();
               this.q015033d9 = var3.field_1690.field_1867.method_1434();
               this.ilovcats$savedSneak = var3.field_1690.field_1832.method_1434();
               this.ilovcats$savedJump = var3.field_1690.field_1903.method_1434();
               Iliil var21 = var2.modules().transient iI();
               if (var21 != null && var21.byte iII1()) {
                  var3.field_1690.field_1894.method_23481(false);
                  this.ilovcats$overrodeForward = true;
                  var3.field_1690.field_1881.method_23481(false);
                  this.ilovcats$overrodeBack = true;
                  var3.field_1690.field_1913.method_23481(false);
                  this.ilovcats$overrodeLeft = true;
                  var3.field_1690.field_1849.method_23481(false);
                  this.ilovcats$overrodeRight = true;
                  var3.field_1690.field_1867.method_23481(false);
                  this.ilovcats$overrodeSprint = true;
                  var3.field_1690.field_1832.method_23481(false);
                  this.ilovcats$overrodeSneak = true;
                  var3.field_1690.field_1903.method_23481(false);
                  this.ilovcats$overrodeJump = true;
                  if (this.field_3913 != null) {
                     1IlI.enum IIiI(this.field_3913, 0.0F, 0.0F);
                  }

                  this.ilovcats$needsRestore = true;
               }

               Ii1l var7 = var2.modules().static iI();
               if (var7 != null && var7.private I1iI()) {
                  this.ilovcats$setModuleKey(var2, var3, var3.field_1690.field_1867, true);
                  this.ilovcats$needsRestore = true;
               }

               Iili var8 = var2.modules().for iI();
               if (var8 != null && var8.interface IIiI(var3)) {
                  this.ilovcats$setModuleKey(var2, var3, var3.field_1690.field_1903, true);
                  this.ilovcats$needsRestore = true;
               }

               IilI var9 = var2.modules().enum iI();
               if (var9 != null && var9.interface i1ii(var3)) {
                  this.ilovcats$setModuleKey(var2, var3, var3.field_1690.field_1903, true);
                  this.ilovcats$needsRestore = true;
               }

               if (var9 != null && var9.static iii1(var3)) {
                  this.ilovcats$setModuleKey(var2, var3, var3.field_1690.field_1867, true);
                  this.ilovcats$needsRestore = true;
               }

               Illll var10 = var2.modules().class iI();
               if (var10 != null && var10.return 1I1l(var3)) {
                  this.ilovcats$setModuleKey(var2, var3, var3.field_1690.field_1903, true);
                  this.ilovcats$needsRestore = true;
               }

               I1IIl var11 = var2.modules().long iI();
               if (var11 != null && var11.byte iII1()) {
                  if (var11.final 1il(var3)) {
                     this.ilovcats$setModuleKey(var2, var3, var3.field_1690.field_1867, true);
                     this.ilovcats$needsRestore = true;
                  }

                  if (var11.float 111(var3)) {
                     this.ilovcats$setModuleKey(var2, var3, var3.field_1690.field_1903, true);
                     this.ilovcats$needsRestore = true;
                  }
               }

               aaaaaap var12 = var2.modules().volatile iI();
               boolean var13 = var12 != null && var12.shouldForceSneak(var3);
               if (var13) {
                  this.ilovcats$setModuleKey(var2, var3, var3.field_1690.field_1832, true);
                  this.ilovcats$scaleEdgeAssistSneak(var3, var12.getSneakSpeedMultiplier(var3));
                  this.ilovcats$needsRestore = true;
               }

               if (var12 != null && var12.shouldSuppressSprint(var3)) {
                  this.ilovcats$setModuleKey(var2, var3, var3.field_1690.field_1867, false);
                  this.ilovcats$needsRestore = true;
               }

               Illl1 var14 = var2.modules().float iI();
               if (var14 != null && var14.byte iII1() && var14.interface 1IiI()) {
                  this.ilovcats$setModuleKey(var2, var3, var3.field_1690.field_1894, false);
                  if (var14.static II1lI() == Iil1I.ll1Ii1) {
                     this.ilovcats$setModuleKey(var2, var3, var3.field_1690.field_1881, true);
                  }

                  if (var3.field_1724 != null) {
                     var3.field_1724.method_5728(false);
                  }

                  this.ilovcats$needsRestore = true;
               }

               ilIl var15 = var2.modules().volatile iI();
               boolean var16 = var15 != null && var15.int iIi();
               boolean var17 = IiiIi.break IIIil(var3);
               if (!this.ilovcats$kbScaleMovement && var17) {
                  this.ilovcats$captureEffectiveMovementKeys(var3);
                  this.ilovcats$prepareMovementCorrection(var3, IiiIi.public IIil());
               }

               float var18 = IiiIi.short I1il(var3);
               if (!this.ilovcats$kbScaleMovement && Float.isFinite(var18) && var16) {
                  this.ilovcats$captureEffectiveMovementKeys(var3);
                  this.ilovcats$preparePacketOnlyMovementCorrection(var3, var18);
               }

               if (IIII.strictfp IiiI(var3)) {
                  this.ilovcats$savedForward = this.ilovcats$shouldRestoreKey(var3, var3.field_1690.field_1894);
                  this.ilovcats$savedBack = this.ilovcats$shouldRestoreKey(var3, var3.field_1690.field_1881);
                  this.ilovcats$savedLeft = this.ilovcats$shouldRestoreKey(var3, var3.field_1690.field_1913);
                  this.ilovcats$savedRight = this.ilovcats$shouldRestoreKey(var3, var3.field_1690.field_1849);
                  this.q015033d9 = this.ilovcats$shouldRestoreKey(var3, var3.field_1690.field_1867);
                  this.ilovcats$savedSneak = this.ilovcats$shouldRestoreKey(var3, var3.field_1690.field_1832);
                  this.ilovcats$savedJump = this.ilovcats$shouldRestoreKey(var3, var3.field_1690.field_1903);
                  var3.field_1690.field_1894.method_23481(false);
                  this.ilovcats$overrodeForward = true;
                  var3.field_1690.field_1881.method_23481(false);
                  this.ilovcats$overrodeBack = true;
                  var3.field_1690.field_1913.method_23481(false);
                  this.ilovcats$overrodeLeft = true;
                  var3.field_1690.field_1849.method_23481(false);
                  this.ilovcats$overrodeRight = true;
                  var3.field_1690.field_1867.method_23481(false);
                  this.ilovcats$overrodeSprint = true;
                  var3.field_1690.field_1832.method_23481(false);
                  this.ilovcats$overrodeSneak = true;
                  var3.field_1690.field_1903.method_23481(false);
                  this.ilovcats$overrodeJump = true;
                  if (this.field_3913 != null) {
                     1IlI.enum IIiI(this.field_3913, 0.0F, 0.0F);
                  }

                  this.ilovcats$needsRestore = true;
               }

               IIII.double iiIi(var3);
               Ii1Il var19 = var2.modules().abstract iI();
               if (var19 != null && var19.short Iiil(var3)) {
                  IIII.enum iil1(var3);
               }

               if (IIII.long IIii(var3)) {
                  this.ilovcats$savedAttack = this.ilovcats$shouldRestoreKey(var3, var3.field_1690.field_1886);
                  this.ilovcats$savedUse = this.ilovcats$shouldRestoreKey(var3, var3.field_1690.field_1904);
                  var3.field_1690.field_1886.method_23481(false);
                  var3.field_1690.field_1904.method_23481(false);
                  this.ilovcats$savedInteractionKeys = true;
                  this.ilovcats$needsRestore = true;
               }
            }
         }
      }
   }

   private void ilovcats$scaleEdgeAssistSneak(class_310 var1, double var2) {
      if (var1 != null && var1.field_1690 != null && !(var2 >= 0.999)) {
         float var4 = (this.ilovcats$savedForward ? 1.0F : 0.0F) - (this.ilovcats$savedBack ? 1.0F : 0.0F);
         float var5 = (this.ilovcats$savedLeft ? 1.0F : 0.0F) - (this.ilovcats$savedRight ? 1.0F : 0.0F);
         float var6 = class_3532.method_15355(var4 * var4 + var5 * var5);
         if (!(var6 <= 1.0E-4F)) {
            if (var6 > 1.0F) {
               var4 /= var6;
               var5 /= var6;
            }

            float var7 = (float)var2;
            this.ilovcats$kbCorrectionForward = var4 * var7;
            this.ilovcats$kbCorrectionSideways = var5 * var7;
            this.ilovcats$kbScaleMovement = true;
         }
      }
   }

   @Unique
   private void ilovcats$preparePacketOnlyMovementCorrection(class_310 var1, float var2) {
      float var3 = ((class_746)this).method_36454();
      i1i1 var4 = Il1Ii.for 1(this.ilovcats$savedForward, this.ilovcats$savedBack, this.ilovcats$savedLeft, this.ilovcats$savedRight, var3 + var2, var3);
      if (var4.synchronized I() != 0.0F || var4.double i() != 0.0F) {
         this.ilovcats$applyDiscreteMovementCorrection(var1, var4.synchronized I(), var4.double i());
      }
   }

   @Unique
   private void ilovcats$prepareMovementCorrection(class_310 var1, float var2) {
      float var3 = ((class_746)this).method_36454();
      i1i1 var4 = Il1Ii.for 1(this.ilovcats$savedForward, this.ilovcats$savedBack, this.ilovcats$savedLeft, this.ilovcats$savedRight, var3, var2);
      if (var4.synchronized I() != 0.0F || var4.double i() != 0.0F) {
         this.ilovcats$applyDiscreteMovementCorrection(var1, var4.synchronized I(), var4.double i());
      }
   }

   @Unique
   private void ilovcats$applyDiscreteMovementCorrection(class_310 var1, float var2, float var3) {
      if (var1 != null && var1.field_1690 != null) {
         this.ilovcats$kbCorrectionForward = var2;
         this.ilovcats$kbCorrectionSideways = var3;
         this.ilovcats$kbScaleMovement = true;
         var1.field_1690.field_1894.method_23481(var2 > 0.0F);
         this.ilovcats$overrodeForward = true;
         var1.field_1690.field_1881.method_23481(var2 < 0.0F);
         this.ilovcats$overrodeBack = true;
         var1.field_1690.field_1913.method_23481(var3 > 0.0F);
         this.ilovcats$overrodeLeft = true;
         var1.field_1690.field_1849.method_23481(var3 < 0.0F);
         this.ilovcats$overrodeRight = true;
         this.ilovcats$needsRestore = true;
      }
   }

   @Inject(
      method = {"method_6007"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1156;method_4909(Lnet/minecraft/class_744;)V"
      )},
      require = 0
   )
   private void ilovcats$afterInputTick(CallbackInfo var1) {
      class_310 var2 = class_310.method_1551();
      if (var2.field_1690 != null) {
         boolean var10000;
         label21: {
            if (var2.field_1755 instanceof IllI var4 && var4.shouldAllowMovementInput()) {
               var10000 = true;
               break label21;
            }

            var10000 = false;
         }

         boolean var3 = var10000;
         if (var2.field_1755 != null && !var3) {
            this.ilovcats$clearMenuMovementInput(var2);
         } else {
            this.ilovcats$finishInputOverrides(var2);
         }
      }
   }

   @Unique
   private void ilovcats$clearMenuMovementInput(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         var1.field_1690.field_1894.method_23481(false);
         var1.field_1690.field_1881.method_23481(false);
         var1.field_1690.field_1913.method_23481(false);
         var1.field_1690.field_1849.method_23481(false);
         var1.field_1690.field_1867.method_23481(false);
         var1.field_1690.field_1832.method_23481(false);
         var1.field_1690.field_1903.method_23481(false);
         if (this.field_3913 != null) {
            this.field_3913.field_54155 = new class_10185(false, false, false, false, false, false, false);
            1IlI.enum IIiI(this.field_3913, 0.0F, 0.0F);
         }
      }
   }

   private void ilovcats$captureEffectiveMovementKeys(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         this.ilovcats$savedForward = var1.field_1690.field_1894.method_1434();
         this.ilovcats$savedBack = var1.field_1690.field_1881.method_1434();
         this.ilovcats$savedLeft = var1.field_1690.field_1913.method_1434();
         this.ilovcats$savedRight = var1.field_1690.field_1849.method_1434();
      }
   }

   @Unique
   private boolean ilovcats$shouldRestoreKey(class_310 var1, class_304 var2) {
      return var2 != null && 1IlI.break IIiI(var1, var2);
   }

   @Unique
   private void ilovcats$captureMovementKeys(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         this.ilovcats$savedForward = this.ilovcats$shouldRestoreKey(var1, var1.field_1690.field_1894);
         this.ilovcats$savedBack = this.ilovcats$shouldRestoreKey(var1, var1.field_1690.field_1881);
         this.ilovcats$savedLeft = this.ilovcats$shouldRestoreKey(var1, var1.field_1690.field_1913);
         this.ilovcats$savedRight = this.ilovcats$shouldRestoreKey(var1, var1.field_1690.field_1849);
      }
   }

   @Unique
   private void ilovcats$finishInputOverrides(class_310 var1) {
      if (var1 != null && var1.field_1690 != null && (this.ilovcats$needsRestore || this.ilovcats$kbScaleMovement)) {
         if (this.ilovcats$kbScaleMovement && this.field_3913 != null) {
            1IlI.enum IIiI(this.field_3913, this.ilovcats$kbCorrectionForward, this.ilovcats$kbCorrectionSideways);
         }

         aaaaady var2 = aaaaady.get();
         boolean var3 = this.ilovcats$needsRestore;
         if (var3) {
            if (!IIII.class I1l(var1)) {
               if (this.ilovcats$overrodeForward) {
                  this.ilovcats$restoreModuleKey(var2, var1, var1.field_1690.field_1894);
               }

               if (this.ilovcats$overrodeBack) {
                  this.ilovcats$restoreModuleKey(var2, var1, var1.field_1690.field_1881);
               }

               if (this.ilovcats$overrodeLeft) {
                  this.ilovcats$restoreModuleKey(var2, var1, var1.field_1690.field_1913);
               }

               if (this.ilovcats$overrodeRight) {
                  this.ilovcats$restoreModuleKey(var2, var1, var1.field_1690.field_1849);
               }

               if (this.ilovcats$overrodeSprint) {
                  this.ilovcats$restoreModuleKey(var2, var1, var1.field_1690.field_1867);
               }

               if (this.ilovcats$overrodeSneak) {
                  this.ilovcats$restoreModuleKey(var2, var1, var1.field_1690.field_1832);
               }
            }

            if (this.ilovcats$overrodeJump) {
               this.ilovcats$restoreModuleKey(var2, var1, var1.field_1690.field_1903);
            }
         }

         if (this.ilovcats$savedInteractionKeys) {
            var1.field_1690.field_1886.method_23481(this.ilovcats$savedAttack);
            var1.field_1690.field_1904.method_23481(this.ilovcats$savedUse);
            this.ilovcats$savedInteractionKeys = false;
         }

         if (var2 != null && var3 && !IIII.class I1l(var1)) {
            this.q8ec5b407(var1, var2);
         }

         this.ilovcats$needsRestore = false;
         this.ilovcats$kbScaleMovement = false;
      }
   }

   @Unique
   private void ilovcats$setModuleKey(aaaaady var1, class_310 var2, class_304 var3, boolean var4) {
      if (var2.field_1690 != null) {
         if (var3 == var2.field_1690.field_1894) {
            this.ilovcats$overrodeForward = true;
         } else if (var3 == var2.field_1690.field_1881) {
            this.ilovcats$overrodeBack = true;
         } else if (var3 == var2.field_1690.field_1913) {
            this.ilovcats$overrodeLeft = true;
         } else if (var3 == var2.field_1690.field_1849) {
            this.ilovcats$overrodeRight = true;
         } else if (var3 == var2.field_1690.field_1867) {
            this.ilovcats$overrodeSprint = true;
         } else if (var3 == var2.field_1690.field_1832) {
            this.ilovcats$overrodeSneak = true;
         } else if (var3 == var2.field_1690.field_1903) {
            this.ilovcats$overrodeJump = true;
         }
      }

      lIii var5 = var1.modules().interface iI();
      if (var5 != null) {
         var5.public iI(var2, var3, var4);
      } else {
         var3.method_23481(var4);
      }
   }

   @Unique
   private void ilovcats$restoreModuleKey(aaaaady var1, class_310 var2, class_304 var3) {
      lIii var4 = var1 != null ? var1.modules().interface iI() : null;
      if (var4 != null) {
         var4.enum iI(var2, var3);
      } else {
         var3.method_23481(this.ilovcats$shouldRestoreKey(var2, var3));
      }
   }

   @Unique
   private void ilovcats$restorePhysicalMovementKeys(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         aaaaady var2 = aaaaady.get();
         this.ilovcats$restoreModuleKey(var2, var1, var1.field_1690.field_1894);
         this.ilovcats$restoreModuleKey(var2, var1, var1.field_1690.field_1881);
         this.ilovcats$restoreModuleKey(var2, var1, var1.field_1690.field_1913);
         this.ilovcats$restoreModuleKey(var2, var1, var1.field_1690.field_1849);
         this.ilovcats$restoreModuleKey(var2, var1, var1.field_1690.field_1867);
         this.ilovcats$restoreModuleKey(var2, var1, var1.field_1690.field_1832);
         this.ilovcats$restoreModuleKey(var2, var1, var1.field_1690.field_1903);
      }
   }

   @Unique
   private void ilovcats$syncPhysicalMovementKeys(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         aaaaady var2 = aaaaady.get();
         lIii var3 = var2 != null ? var2.modules().interface iI() : null;
         this.ilovcats$syncPhysicalMovementKey(var3, var1, var1.field_1690.field_1894);
         this.ilovcats$syncPhysicalMovementKey(var3, var1, var1.field_1690.field_1881);
         this.ilovcats$syncPhysicalMovementKey(var3, var1, var1.field_1690.field_1913);
         this.ilovcats$syncPhysicalMovementKey(var3, var1, var1.field_1690.field_1849);
         this.ilovcats$syncPhysicalMovementKey(var3, var1, var1.field_1690.field_1867);
         this.ilovcats$syncPhysicalMovementKey(var3, var1, var1.field_1690.field_1832);
         this.ilovcats$syncPhysicalMovementKey(var3, var1, var1.field_1690.field_1903);
      }
   }

   @Unique
   private void ilovcats$syncPhysicalMovementKey(lIii var1, class_310 var2, class_304 var3) {
      if (var1 != null) {
         var1.interface IIiI(var2, var3);
      } else if (var3 != null) {
         var3.method_23481(this.ilovcats$shouldRestoreKey(var2, var3));
      }
   }

   @Unique
   private void q8ec5b407(class_310 var1, aaaaady var2) {
      if (var1 != null && var1.field_1724 != null && var1.field_1690 != null && var2 != null) {
         if (!var1.field_1724.method_5624() && var1.field_1724.method_5805() && !var1.field_1724.method_5715() && !var1.field_1724.method_6115()) {
            IilI var3 = var2.modules().enum iI();
            boolean var4 = var3 != null && var3.static iii1(var1);
            Ii1l var5 = var2.modules().static iI();
            boolean var6 = var5 != null && var5.private I1iI();
            I1IIl var7 = var2.modules().long iI();
            boolean var8 = var7 != null && var7.final 1il(var1);
            boolean var9 = this.q015033d9 || var1.field_1690.field_1867.method_1434() || 1IlI.break IIiI(var1, var1.field_1690.field_1867);
            if (var4 || var6 || var8 || var9) {
               if (var4 || var1.field_1690.field_1894.method_1434() && !var1.field_1690.field_1881.method_1434()) {
                  var1.field_1724.method_5728(true);
               }
            }
         }
      }
   }

   @Inject(
      method = {"method_6007"},
      at = {@At("TAIL")},
      require = 0
   )
   private void ilovcats$restorePreparedVisualRotationAfterInput(CallbackInfo var1) {
      class_310 var2 = class_310.method_1551();
      IiiIi.synchronized IIIii(var2);
   }

   @Inject(
      method = {"method_6007"},
      at = {@At("TAIL")},
      require = 0
   )
   private void ilovcats$applySpeedVisualYaw(CallbackInfo var1) {
      class_310 var2 = class_310.method_1551();
      this.ilovcats$finishInputOverrides(var2);
      aaaaady var3 = aaaaady.get();
      if (var3 != null) {
         class_746 var4 = (class_746)this;
         if (var2.field_1724 != null) {
            IilI var5 = var3.modules().enum iI();
            if (var5 != null && var5.abstract iill() && !var4.method_24828()) {
               class_243 var6 = var4.method_18798();
               double var7 = Math.sqrt(var6.field_1352 * var6.field_1352 + var6.field_1350 * var6.field_1350);
               if (var7 > 0.001) {
                  float var9 = var5.volatile III1();
                  float var10 = (float)Math.toDegrees(Math.atan2(-var6.field_1352, var6.field_1350));
                  float var11 = class_3532.method_15393(var9 - var10);
                  class_243 var12 = new class_243(var6.field_1352, 0.0, var6.field_1350).method_1024(-((float)Math.toRadians((double)var11)));
                  var4.method_18800(var12.field_1352, var6.field_1351, var12.field_1350);
               }
            }

            1IlI.strictfp IIiI(var2, var4.method_36454());
         }
      }
   }

   @Inject(
      method = {"method_5773"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_3136()V"
      )},
      require = 0
   )
   private void ilovcats$beforeMovementPackets(CallbackInfo var1) {
      class_310 var2 = class_310.method_1551();
      1IlI.switch I1I1(var2);
      aaaaady var3 = aaaaady.get();
      if (var3 != null) {
         IlI11 var4 = var3.modules().transient iI();
         if (var4 != null) {
            var4.public i1lI(var2);
         }

         1ii1 var5 = var3.modules().abstract iI();
         if (var5 != null) {
            var5.short Ii11I(var2);
         }

         Ii1Il var6 = var3.modules().abstract iI();
         if (var6 != null) {
            var6.double IIIl(var2);
         }

         il1I var7 = var3.modules().transient iI();
         if (var7 != null) {
            var7.enum II1Ii(var2);
         }
      }

      IiiIi.abstract IIIil(var2);
   }

   @Inject(
      method = {"method_5773"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_3136()V",
         shift = Shift.AFTER
      )},
      require = 0
   )
   private void ilovcats$afterMovementPackets(CallbackInfo var1) {
      class_310 var2 = class_310.method_1551();
      1IlI.final i11l();
      IiiIi.short IIIii(var2);
      IIII.static iiIl(var2);
      aaaaady var3 = aaaaady.get();
      if (var3 != null) {
         var3.modules().double il(var2);
      }
   }
}
