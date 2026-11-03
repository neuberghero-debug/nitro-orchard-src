package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.1IlI;
import dev.virel.obf.IllI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1041;
import net.minecraft.class_11910;
import net.minecraft.class_310;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_312.class})
public abstract class aaaaanb {
   @Shadow
   private class_310 field_1779;

   @Shadow
   public abstract double method_68879(class_1041 var1);

   @Shadow
   public abstract double method_68883(class_1041 var1);

   @Inject(
      method = {"method_1601"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$hudMouseClicked(long var1, class_11910 var3, int var4, CallbackInfo var5) {
      1IlI.long IIiI(var1, var3.comp_4801(), var4);
      if (this.field_1779 != null
         && this.field_1779.field_1755 != null
         && !(this.field_1779.field_1755 instanceof IllI)
         && this.field_1779.method_18506() == null
         && var4 == 1) {
         class_1041 var6 = this.field_1779.method_22683();
         if (var1 == var6.method_4490()) {
            aaaaady var7 = aaaaady.get();
            if (var7 != null && var7.modules() != null) {
               double var8 = this.method_68879(var6);
               double var10 = this.method_68883(var6);
               if (var7.modules().long IIiI(var8, var10, var3.comp_4801())) {
                  var5.cancel();
               }
            }
         }
      }
   }
}
