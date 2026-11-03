package dev.hawk22e.core.client.mixin;

import dev.hawk22e.core.client.aaaaady;
import dev.virel.obf.I1l;
import dev.virel.obf.IiiIi;
import dev.virel.obf.i1ii;
import dev.virel.obf.iIl;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10055;
import net.minecraft.class_11659;
import net.minecraft.class_11890;
import net.minecraft.class_12075;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(
   targets = {"net/minecraft/class_1007"}
)
public abstract class aaaaadd {
   @Inject(
      method = {"method_62604"},
      at = {@At("TAIL")},
      require = 0
   )
   private void ilovcats$applyLocalServerRotationPose(class_11890 var1, class_10055 var2, float var3, CallbackInfo var4) {
      class_310 var5 = class_310.method_1551();
      aaaaady var6 = aaaaady.get();
      I1l var7 = var6 != null && var6.modules() != null ? var6.modules().transient iI() : null;
      if (var5 != null && var1 == var5.field_1724 && var7 != null && var7.byte iII1()) {
         IiiIi.public IIiI(var5, var2, var3);
      }
   }

   @Inject(
      method = {"method_4213"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void ilovcats$suppressDefaultPlayerLabels(class_10055 var1, class_4587 var2, class_11659 var3, class_12075 var4, CallbackInfo var5) {
      if (i1ii.protected II1i()) {
         class_1297 var6 = ilovcats$resolveEntity(var1);
         if (var6 != null && i1ii.private IIiI(var6)) {
            var5.cancel();
         }
      }
   }

   private static class_1297 ilovcats$resolveEntity(class_10055 var0) {
      if (var0 == null) {
         return null;
      } else {
         class_1297 var1 = ilovcats$extractDirectEntity(var0);
         if (var1 != null) {
            return var1;
         } else {
            Integer var2 = ilovcats$extractEntityId(var0);
            if (var2 == null) {
               return null;
            } else {
               class_310 var3 = class_310.method_1551();
               return var3 != null && var3.field_1687 != null ? var3.field_1687.method_8469(var2) : null;
            }
         }
      }
   }

   private static class_1297 ilovcats$extractDirectEntity(Object var0) {
      for (Field var2 : ilovcats$getAllFields(var0.getClass())) {
         if (class_1297.class.isAssignableFrom(var2.getType())) {
            try {
               var2.setAccessible(true);
               Object var3 = var2.get(var0);
               if (var3 instanceof class_1297) {
                  return (class_1297)var3;
               }
            } catch (ReflectiveOperationException var5) {
            }
         }
      }

      return null;
   }

   private static Integer ilovcats$extractEntityId(Object var0) {
      class_310 var1 = class_310.method_1551();
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         for (Field var4 : ilovcats$getAllFields(var0.getClass())) {
            Class var5 = var4.getType();
            if (var5 == int.class || var5 == Integer.class) {
               try {
                  var4.setAccessible(true);
                  if (var4.get(var0) instanceof Integer var7 && var7 >= 0) {
                     String var8 = var4.getName().toLowerCase();
                     if ((
                           var8.equals(iIl.interface l11I("kZA="))
                              || var8.contains(iIl.interface l11I("nZpAlQ1OWRg="))
                              || var8.contains(iIl.interface l11I("nZpAlQ1ObxWT"))
                        )
                        && (var1.field_1687 == null || var1.field_1687.method_8469(var7) != null)) {
                        return var7;
                     }

                     var2.add(var7);
                  }
               } catch (ReflectiveOperationException var9) {
               }
            }
         }

         if (var1.field_1687 != null) {
            for (Integer var11 : var2) {
               if (var1.field_1687.method_8469(var11) != null) {
                  return var11;
               }
            }
         }

         return !var2.isEmpty() ? (Integer)var2.get(0) : null;
      }
   }

   private static List<Field> ilovcats$getAllFields(Class<?> var0) {
      ArrayList var1 = new ArrayList();

      for (Class var2 = var0; var2 != null && var2 != Object.class; var2 = var2.getSuperclass()) {
         Field[] var3 = var2.getDeclaredFields();

         for (Field var7 : var3) {
            var1.add(var7);
         }
      }

      return var1;
   }
}
