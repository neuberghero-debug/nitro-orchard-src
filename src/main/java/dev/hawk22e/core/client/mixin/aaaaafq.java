package dev.hawk22e.core.client.mixin;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import dev.virel.obf.I11I;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_761;
import net.minecraft.class_9779;
import net.minecraft.class_9922;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_761.class})
public abstract class aaaaafq {
   @Inject(
      method = {"method_22710"},
      at = {@At("HEAD")},
      require = 0
   )
   private void ilovcats$captureRenderMatrices(
      class_9922 var1,
      class_9779 var2,
      boolean var3,
      class_4184 var4,
      Matrix4f var5,
      Matrix4f var6,
      Matrix4f var7,
      GpuBufferSlice var8,
      Vector4f var9,
      boolean var10,
      CallbackInfo var11
   ) {
      I11I.synchronized Ii1ll(var4, class_310.method_1551().field_1773, var5, var6);
   }
}
