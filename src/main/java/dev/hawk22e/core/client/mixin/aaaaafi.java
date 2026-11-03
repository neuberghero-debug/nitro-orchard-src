package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.1IlI;
import dev.virel.obf.IIlI1;
import dev.virel.obf.IliIl;
import dev.virel.obf.Iliil;
import dev.virel.obf.i1l;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class aaaaafi {
   @Unique
   private static final int ilovcats$FREELOOK_NONE = 0;
   @Unique
   private static final int ilovcats$FREELOOK_FREECAM = 1;
   @Unique
   private static final int ilovcats$FREELOOK_AIM_ASSIST = 2;
   @Unique
   private static final int ilovcats$FREELOOK_COMBAT = 3;
   @Unique
   private float ilovcats$lookBeforeYaw;
   @Unique
   private float ilovcats$lookBeforePitch;
   @Unique
   private int ilovcats$freelookOwner;
   @Unique
   private IIlI1 ilovcats$combatFreelookOwner = IIlI1.I1lIii;

   @Inject(
      method = {"method_5872"},
      at = {@At("HEAD")}
   )
   private void ilovcats$captureBridgeLookHead(double var1, double var3, CallbackInfo var5) {
      aaaaady var6 = aaaaady.get();
      if (var6 != null) {
         class_1297 var7 = (class_1297)this;
         class_310 var8 = class_310.method_1551();
         if (var7 != var8.field_1724) {
            this.ilovcats$freelookOwner = 0;
         } else {
            Iliil var9 = var6.modules().transient iI();
            if (var9 != null && var9.byte iII1()) {
               this.ilovcats$lookBeforeYaw = var7.method_36454();
               this.ilovcats$lookBeforePitch = var7.method_36455();
               this.ilovcats$freelookOwner = 1;
            } else {
               i1l var10 = var6.modules().float iI();
               if (var10 != null && var10.private l11()) {
                  this.ilovcats$lookBeforeYaw = var7.method_36454();
                  this.ilovcats$lookBeforePitch = var7.method_36455();
                  this.ilovcats$freelookOwner = 2;
               } else {
                  IIlI1 var11 = IliIl.transient Ii();
                  if (var11 != IIlI1.I1lIii) {
                     this.ilovcats$lookBeforeYaw = var7.method_36454();
                     this.ilovcats$lookBeforePitch = var7.method_36455();
                     this.ilovcats$freelookOwner = 3;
                     this.ilovcats$combatFreelookOwner = var11;
                  } else {
                     this.ilovcats$freelookOwner = 0;
                     this.ilovcats$combatFreelookOwner = IIlI1.I1lIii;
                  }
               }
            }
         }
      }
   }

   @Inject(
      method = {"method_5872"},
      at = {@At("TAIL")}
   )
   private void ilovcats$captureBridgeLookTail(double var1, double var3, CallbackInfo var5) {
      if (this.ilovcats$freelookOwner != 0) {
         aaaaady var6 = aaaaady.get();
         class_310 var7 = class_310.method_1551();
         class_1297 var8 = (class_1297)this;
         if (var6 != null && var8 == var7.field_1724) {
            if (this.ilovcats$freelookOwner == 1) {
               Iliil var9 = var6.modules().transient iI();
               if (var9 != null) {
                  var9.short IIiI(this.ilovcats$lookBeforeYaw, this.ilovcats$lookBeforePitch, var8.method_36454(), var8.method_36455());
               }

               1IlI.class IIiI(var7, this.ilovcats$lookBeforeYaw, this.ilovcats$lookBeforePitch);
            } else if (this.ilovcats$freelookOwner == 2) {
               i1l var10 = var6.modules().float iI();
               if (var10 != null) {
                  var10.abstract ll(this.ilovcats$lookBeforeYaw, this.ilovcats$lookBeforePitch, var8.method_36454(), var8.method_36455());
               }

               1IlI.class IIiI(var7, this.ilovcats$lookBeforeYaw, this.ilovcats$lookBeforePitch);
            } else if (this.ilovcats$freelookOwner == 3) {
               IliIl.for Ii(
                  this.ilovcats$combatFreelookOwner, this.ilovcats$lookBeforeYaw, this.ilovcats$lookBeforePitch, var8.method_36454(), var8.method_36455()
               );
               1IlI.class IIiI(var7, this.ilovcats$lookBeforeYaw, this.ilovcats$lookBeforePitch);
            }
         }

         this.ilovcats$freelookOwner = 0;
         this.ilovcats$combatFreelookOwner = IIlI1.I1lIii;
      }
   }
}
