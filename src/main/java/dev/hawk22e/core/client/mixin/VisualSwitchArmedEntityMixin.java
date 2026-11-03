package dev.hawk22e.core.client.mixin;

import dev.virel.obf.1IlI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10426;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(EnvType.CLIENT)
@Mixin({class_10426.class})
public abstract class VisualSwitchArmedEntityMixin {
   @Redirect(
      method = {"method_65577"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1309;method_6047()Lnet/minecraft/class_1799;"
      )
   )
   private static class_1799 ilovcats$visualMainHand(class_1309 var0) {
      return var0 instanceof class_746 var1 ? 1IlI.interface IIiI(var1) : var0.method_6047();
   }

   @Redirect(
      method = {"method_65577"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1309;method_61420(Lnet/minecraft/class_1306;)Lnet/minecraft/class_1799;"
      )
   )
   private static class_1799 ilovcats$visualStackInArm(class_1309 var0, class_1306 var1) {
      if (var0 instanceof class_746 var2 && var1 == var0.method_6068()) {
         return 1IlI.interface IIiI(var2);
      }

      return var0.method_61420(var1);
   }
}
