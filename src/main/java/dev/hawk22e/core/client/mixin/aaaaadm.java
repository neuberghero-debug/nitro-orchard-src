package dev.hawk22e.core.client.mixin;

import com.mojang.blaze3d.platform.GLX;
import dev.virel.obf.iIl;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

@Environment(EnvType.CLIENT)
@Mixin({GLX.class})
public abstract class aaaaadm {
   @Redirect(
      method = {"_getCpuInfo"},
      remap = false,
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Loshi/hardware/HardwareAbstractionLayer;getProcessor()Loshi/hardware/CentralProcessor;",
         remap = false
      )
   )
   private static CentralProcessor ilovcats$skipWindowsProcessorQuery(HardwareAbstractionLayer var0) {
      String var1 = System.getProperty(iIl.interface l11I("l4cakhhaVQ=="), "").toLowerCase();
      if (var1.contains(iIl.interface l11I("j51a"))) {
         throw new IllegalStateException(iIl.interface l11I("q59djAleXhvXP5ZXC9zJjdi7Z7QwF3MsokiOTArBxw=="));
      } else {
         return var0.getProcessor();
      }
   }
}
