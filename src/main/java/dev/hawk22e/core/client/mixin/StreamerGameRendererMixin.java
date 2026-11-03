package dev.hawk22e.core.client.mixin;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import dev.virel.obf.ll1;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11228;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_757.class})
public abstract class StreamerGameRendererMixin {
   @Inject(
      method = {"method_3192"},
      at = {@At("HEAD")}
   )
   private void ilovcats$beginStreamerFrame(class_9779 var1, boolean var2, CallbackInfo var3) {
      ll1.synchronized lil();
   }

   @Redirect(
      method = {"method_3192"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11228;method_70890(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V"
      ),
      require = 1
   )
   private void ilovcats$flushStreamerGui(class_11228 var1, GpuBufferSlice var2) {
      var1.method_70890(var2);
      ll1.abstract iI(var1, var2);
   }

   @Inject(
      method = {"method_3192"},
      at = {@At("TAIL")}
   )
   private void ilovcats$presentStreamerFrame(class_9779 var1, boolean var2, CallbackInfo var3) {
      ll1.long li1();
   }
}
