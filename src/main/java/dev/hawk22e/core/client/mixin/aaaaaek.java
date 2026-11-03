package dev.hawk22e.core.client.mixin;

import dev.virel.obf.iIl;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_6396;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oshi.SystemInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_6396.class})
public abstract class aaaaaek {
   @Shadow
   public abstract void method_37122(String var1, String var2);

   @Inject(
      method = {"method_37128"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ilovcats$skipWindowsHardwareProbe(SystemInfo var1, CallbackInfo var2) {
      String var3 = System.getProperty(iIl.interface l11I("l4cakhhaVQ=="), "").toLowerCase();
      if (var3.contains(iIl.interface l11I("j51a"))) {
         this.method_37122(iIl.interface l11I("qIZbnxxEQxOFSKlcAdfRjA=="), iIl.interface l11I("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         this.method_37122(iIl.interface l11I("qIZbnxxEQxOFSLFYAtY="), iIl.interface l11I("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         this.method_37122(iIl.interface l11I("sZBRkg1eVhWSGg=="), iIl.interface l11I("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         this.method_37122(iIl.interface l11I("tZ1XjhZWQh+fAYtcDMfLjJ0="), iIl.interface l11I("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         this.method_37122(iIl.interface l11I("voZRjQxSXh+OSNd+J8mX"), iIl.interface l11I("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         this.method_37122(iIl.interface l11I("toFZnhxFEBORSI9RFsDXnZmYFIwYVFsdkA2M"), iIl.interface l11I("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         this.method_37122(iIl.interface l11I("toFZnhxFEBORSI9RFsDXnZmYFL8pYkM="), iIl.interface l11I("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         this.method_37122(iIl.interface l11I("toFZnhxFEBORSJNWCNrdn5TUd6wsRA=="), iIl.interface l11I("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         var2.cancel();
      }
   }
}
