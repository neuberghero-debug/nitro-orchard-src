package dev.hawk22e.core.client.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin({class_636.class})
public interface aaaaafh {
   @Accessor("field_3716")
   int ilovcats$getBreakCd();

   @Accessor("field_3716")
   void ilovcats$setBreakCd(int var1);

   @Accessor("field_3721")
   int ilovcats$getLastSelectedSlot();

   @Accessor("field_3721")
   void ilovcats$setLastSelectedSlot(int var1);

   @Invoker("method_2911")
   void ilovcats$invokeSyncSelectedSlot();

   @Accessor("field_3717")
   boolean ilovcats$isBreakingBlock();

   @Accessor("field_3718")
   class_1799 ilovcats$getSelectedStack();

   @Accessor("field_3718")
   void ilovcats$setSelectedStack(class_1799 var1);
}
