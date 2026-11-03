package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.IIII1;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(EnvType.CLIENT)
@Mixin({class_1657.class})
public abstract class KeepSprintPlayerMixin {
   @Redirect(
      method = {"method_75122"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_243;method_18805(DDD)Lnet/minecraft/class_243;"
      )
   )
   private class_243 ilovcats$scalePostAttackVelocity(class_243 var1, double var2, double var4, double var6, class_1297 var8, float var9, class_243 var10) {
      class_1657 var11 = (class_1657)this;
      IIII1 var12 = ilovcats$module();
      if (var12 != null && var12.enum Il(var11)) {
         double var13 = var12.transient iII();
         return var1.method_18805(var13, var4, var13);
      } else {
         return var1.method_18805(var2, var4, var6);
      }
   }

   @Redirect(
      method = {"method_75122"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1657;method_5728(Z)V"
      )
   )
   private void ilovcats$preserveSprintAfterAttack(class_1657 var1, boolean var2, class_1297 var3, float var4, class_243 var5) {
      IIII1 var6 = ilovcats$module();
      if (var6 == null || !var6.static I1I(var1)) {
         var1.method_5728(var2);
      }
   }

   private static IIII1 ilovcats$module() {
      aaaaady var0 = aaaaady.get();
      return var0 != null && var0.modules() != null ? var0.modules().byte iI() : null;
   }
}
