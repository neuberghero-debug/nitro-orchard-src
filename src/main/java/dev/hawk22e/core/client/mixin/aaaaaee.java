package dev.hawk22e.core.client.mixin;

import dev.virel.obf.I1IlI;
import dev.virel.obf.IIIl;
import dev.virel.obf.IilI1;
import dev.virel.obf.Ill1;
import dev.virel.obf.llil;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_355;
import net.minecraft.class_640;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_355.class})
public abstract class aaaaaee {
   @Unique
   private final Map<String, class_640> ilovcats$playerEntriesByRenderedText = new HashMap<>();

   @Shadow
   public abstract class_2561 method_1918(class_640 var1);

   @Inject(
      method = {"method_1919"},
      at = {@At("HEAD")}
   )
   private void ilovcats$clearFakeClientTabEntries(CallbackInfo var1) {
      this.ilovcats$playerEntriesByRenderedText.clear();
      IilI1.class 111l();
   }

   @Inject(
      method = {"method_1919"},
      at = {@At("RETURN")}
   )
   private void ilovcats$finishTabBounds(CallbackInfo var1) {
      IilI1.enum 1111();
   }

   @Inject(
      method = {"method_1918"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void ilovcats$decorateFakeClientTabName(class_640 var1, CallbackInfoReturnable<class_2561> var2) {
      class_2561 var3 = I1IlI.break iI(var1, (class_2561)var2.getReturnValue());
      var3 = Ill1.while IIiI(var1, var3);
      class_2561 var4 = llil.interface I1(var1, var3);
      if (var4 != null) {
         this.ilovcats$playerEntriesByRenderedText.put(var4.getString(), var1);
      }

      var2.setReturnValue(var4);
   }

   @Redirect(
      method = {"method_1919"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_332;drawTextWithShadow(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;III)I"
      )
   )
   private int ilovcats$renderFakeClientBadge(class_332 var1, class_327 var2, class_2561 var3, int var4, int var5, int var6) {
      class_640 var7 = this.ilovcats$playerEntriesByRenderedText.remove(var3.getString());
      int var8 = IIIl.final IIiI(var1, var7, var2, var4, var5);
      IilI1.abstract IIiI(var4 - 10, var5 - 1, var4 + var8 + var2.method_27525(var3) + 110, var5 + 8);
      var1.method_27535(var2, var3, var4 + var8, var5, var6);
      return 0;
   }
}
