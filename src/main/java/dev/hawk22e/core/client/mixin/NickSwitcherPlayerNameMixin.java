package dev.hawk22e.core.client.mixin;

import dev.virel.obf.I1IlI;
import dev.virel.obf.Ill1;
import dev.virel.obf.llil;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_1657.class})
public abstract class NickSwitcherPlayerNameMixin {
   @Inject(
      method = {"method_5477"},
      at = {@At("RETURN")},
      cancellable = true,
      require = 0
   )
   private void ilovcats$replaceNickSwitcherPlayerName(CallbackInfoReturnable<class_2561> var1) {
      class_1657 var2 = (class_1657)this;
      class_2561 var3 = Ill1.class IIiI(var2.method_7334(), (class_2561)var1.getReturnValue());
      var1.setReturnValue(I1IlI.static iI(var2, llil.native IIiI(var2, var3)));
   }

   @Inject(
      method = {"method_5476"},
      at = {@At("RETURN")},
      cancellable = true,
      require = 0
   )
   private void ilovcats$replaceNickSwitcherPlayerDisplayName(CallbackInfoReturnable<class_2561> var1) {
      class_1657 var2 = (class_1657)this;
      class_2561 var3 = Ill1.class IIiI(var2.method_7334(), (class_2561)var1.getReturnValue());
      var1.setReturnValue(I1IlI.static iI(var2, llil.native IIiI(var2, var3)));
   }
}
