package dev.hawk22e.core.client.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin({class_310.class})
public interface aaaaafg {
   @Accessor("field_1752")
   int ilovcats$getUseCd();

   @Accessor("field_1752")
   void ilovcats$setUseCd(int var1);

   @Accessor("field_1771")
   int ilovcats$getAttackCooldown();

   @Accessor("field_1771")
   void ilovcats$setAttackCooldown(int var1);

   @Invoker("method_1583")
   void ilovcats$doItemUse();

   @Invoker("method_1536")
   boolean ilovcats$doAttack();
}
