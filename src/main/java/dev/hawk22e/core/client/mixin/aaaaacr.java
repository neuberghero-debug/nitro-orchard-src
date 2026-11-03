package dev.hawk22e.core.client.mixin;

import dev.virel.obf.I1IlI;
import dev.virel.obf.IiiIl;
import dev.virel.obf.Ill1;
import dev.virel.obf.i1ii;
import dev.virel.obf.llil;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class aaaaacr {
   @Inject(
      method = {"method_5477"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void ilovcats$replaceNickSwitcherName(CallbackInfoReturnable<class_2561> var1) {
      class_1297 var2 = (class_1297)this;
      if (var2 instanceof class_1657 var3) {
         class_2561 var4 = Ill1.class IIiI(var3.method_7334(), (class_2561)var1.getReturnValue());
         var1.setReturnValue(I1IlI.static iI(var3, llil.native IIiI(var3, var4)));
      }
   }

   @Inject(
      method = {"method_5476"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void ilovcats$replaceNickSwitcherDisplayName(CallbackInfoReturnable<class_2561> var1) {
      class_1297 var2 = (class_1297)this;
      if (var2 instanceof class_1657 var3) {
         class_2561 var4 = Ill1.class IIiI(var3.method_7334(), (class_2561)var1.getReturnValue());
         var1.setReturnValue(I1IlI.static iI(var3, llil.native IIiI(var3, var4)));
      }
   }

   @Inject(
      method = {"method_5756"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$hideOtherPlayersLocally(class_1657 var1, CallbackInfoReturnable<Boolean> var2) {
      class_1297 var3 = (class_1297)this;
      if (IiiIl.public IiI(var3)) {
         var2.setReturnValue(true);
      }
   }

   @Inject(
      method = {"method_5733"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$shouldHidePlayerNametag(CallbackInfoReturnable<Boolean> var1) {
      class_1297 var2 = (class_1297)this;
      if (IiiIl.return III1(var2) || i1ii.private IIiI(var2)) {
         var1.setReturnValue(false);
      }
   }
}
