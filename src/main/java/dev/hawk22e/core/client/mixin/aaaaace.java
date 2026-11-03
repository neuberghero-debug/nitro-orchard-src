package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.Ii1Il;
import dev.virel.obf.Iil11;
import dev.virel.obf.iI1I;
import dev.virel.obf.iIIl;
import dev.virel.obf.iIl;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import net.minecraft.class_2598;
import net.minecraft.class_2815;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_2535.class})
public abstract class aaaaace {
   @Unique
   private static final String q6be548e9 = iIl.interface l11I("kZhbihpWRA+oGJZXCOzNjpebUg==");
   @Shadow
   @Final
   private class_2598 field_11643;
   @Shadow
   private Channel field_11651;
   @Unique
   private iIIl qa44a2ea7;

   @Inject(
      method = {"method_10743"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$onSendPacket(class_2596<?> var1, CallbackInfo var2) {
      aaaaady var3 = aaaaady.get();
      if (this.ilovcats$shouldInstallHandlers()) {
         this.ilovcats$ensureHandler(this.field_11651.pipeline());
      }

      if (var3 != null && var3.modules() != null) {
         Ii1Il var4 = var3.modules().abstract iI();
         if (var4 != null && var4.public I1ii(var1)) {
            var2.cancel();
            return;
         }
      }

      if (var3 != null && var1 instanceof class_2815 var6) {
         Iil11 var5 = var3.modules().strictfp iI();
         if (var5 != null && var5.long IIiI(var6)) {
            var2.cancel();
            return;
         }
      }

      if (var3 != null && var3.modules() != null && var3.modules().abstract iI() != null) {
         var3.modules().abstract iI().final Ii1ll(var1);
      }

      if (var3 != null && var3.modules() != null) {
         var3.modules().onPacketSendPre(var1);
      }

      iIIl.markPacketForOrdering(var1);
   }

   @Inject(
      method = {"method_10743"},
      at = {@At("TAIL")}
   )
   private void ilovcats$afterSendPacket(class_2596<?> var1, CallbackInfo var2) {
      aaaaady var3 = aaaaady.get();
      if (var3 != null && var3.modules() != null) {
         var3.modules().onPacketSendQueued(var1);
      }
   }

   @Inject(
      method = {"method_53859"},
      at = {@At("RETURN")}
   )
   private void ilovcats$installHandlers(ChannelPipeline var1, CallbackInfo var2) {
      if (this.ilovcats$shouldInstallHandlers()) {
         this.ilovcats$ensureHandler(var1);
      }
   }

   @Inject(
      method = {"channelActive"},
      at = {@At("TAIL")}
   )
   private void ilovcats$installHandlersOnActive(ChannelHandlerContext var1, CallbackInfo var2) {
      if (this.ilovcats$shouldInstallHandlers()) {
         this.ilovcats$ensureHandler(var1.pipeline());
      }
   }

   @Inject(
      method = {"channelInactive"},
      at = {@At("HEAD")}
   )
   private void ilovcats$clearHandlers(ChannelHandlerContext var1, CallbackInfo var2) {
      iI1I.byte IIiI().native lI1I();
      if (this.qa44a2ea7 != null) {
         this.qa44a2ea7.clearQueues();
         this.qa44a2ea7 = null;
      }
   }

   @Unique
   private boolean ilovcats$shouldInstallHandlers() {
      return this.field_11643 == class_2598.field_11942 && this.field_11651 != null;
   }

   @Unique
   private void ilovcats$ensureHandler(ChannelPipeline var1) {
      iI1I.byte IIiI().synchronized lIl1();
      Channel var2 = var1.channel();
      Runnable var3 = () -> {
         if (this.field_11651 == var2 && var2.isOpen()) {
            ChannelHandler var3x = var1.get(q6be548e9);
            if (var3x instanceof iIIl var6) {
               this.qa44a2ea7 = var6;
            } else if (var3x == null) {
               ChannelHandlerContext var4 = var1.context((ChannelHandler)this);
               iIIl var5x = new iIIl();
               if (var4 != null) {
                  var1.addBefore(var4.name(), q6be548e9, var5x);
               } else {
                  var1.addLast(q6be548e9, var5x);
               }

               this.qa44a2ea7 = var5x;
            }
         }
      };
      if (var2.eventLoop().inEventLoop()) {
         var3.run();
      } else {
         try {
            var2.eventLoop().execute(var3);
         } catch (RuntimeException var5) {
         }
      }
   }
}
