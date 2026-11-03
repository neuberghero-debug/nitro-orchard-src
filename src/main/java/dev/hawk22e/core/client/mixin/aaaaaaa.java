package dev.hawk22e.core.client.mixin;

import com.mojang.authlib.GameProfile;
import dev.virel.obf.Ill1;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_742;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_742.class})
public abstract class aaaaaaa {
   @Inject(
      method = {"method_52814"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void ilovcats$overrideSkinTextures(CallbackInfoReturnable<Object> var1) {
      GameProfile var2 = ((class_742)this).method_7334();
      Object var3 = Ill1.abstract IIiI(var2);
      if (var3 != null) {
         var1.setReturnValue(var3);
      }
   }
}
