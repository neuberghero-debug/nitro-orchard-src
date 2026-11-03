package dev.hawk22e.core.client.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_746.class})
public interface aaaaako {
   @Accessor("field_3941")
   float ilovcats$getLastYawClient();

   @Accessor("field_3941")
   void ilovcats$setLastYawClient(float var1);

   @Accessor("field_3925")
   float ilovcats$getLastPitchClient();

   @Accessor("field_3925")
   void ilovcats$setLastPitchClient(float var1);

   @Accessor("field_3926")
   double ilovcats$getLastXClient();

   @Accessor("field_3926")
   void ilovcats$setLastXClient(double var1);

   @Accessor("field_3940")
   double ilovcats$getLastYClient();

   @Accessor("field_3940")
   void ilovcats$setLastYClient(double var1);

   @Accessor("field_3924")
   double ilovcats$getLastZClient();

   @Accessor("field_3924")
   void ilovcats$setLastZClient(double var1);

   @Accessor("field_3923")
   int ilovcats$getTicksSinceLastPositionPacketSent();

   @Accessor("field_3923")
   void ilovcats$setTicksSinceLastPositionPacketSent(int var1);

   @Accessor("field_3919")
   boolean ilovcats$getLastSprinting();

   @Accessor("field_3919")
   void ilovcats$setLastSprinting(boolean var1);
}
