package dev.hawk22e.core.client;

import dev.virel.obf.Ii11i;
import dev.virel.obf.Ilii1;
import dev.virel.obf.IllIi;
import dev.virel.obf.i1li;
import dev.virel.obf.iIl;
import dev.virel.obf.l;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1747;
import net.minecraft.class_2338;
import net.minecraft.class_310;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class aaaaaap extends Ii11i {
   private final l length = this.private iI(new l(iIl.interface l11I("tJFamw1f"), 1.0, 1.0, 1.0, 4.0, 1.0).float Ii(iIl.interface l11I("jJ1Xlwo=")));
   private final i1li sneakSpeedMultiplier = this.private iI(new i1li(iIl.interface l11I("q5pRnRIXYwySDZsZIsbSipGEWJUcRQ=="), 0.3, 0.2, 1.0, 0.05));
   private final Ilii1 onlyOnGround = this.private iI(new Ilii1(iIl.interface l11I("t5pYhVlYXlywGpBMAdc="), false));
   private final Ilii1 onlyWhenHoldingBlocks = this.private iI(new Ilii1(iIl.interface l11I("t5pYhVlgWBmZSLdWA9fXkJ/UdpAWVFsP"), false));
   private final Ilii1 onlyWhenMovingBackwards = this.private iI(new Ilii1(iIl.interface l11I("t5pYhVlgWBmZSLJWGdrQmdi2VZ8SQFEOkxs="), false));
   private boolean edgeActive;
   private int edgeTicks;
   private int remainingSneakTicks;
   private boolean scaleSneakThisTick;

   public aaaaaap() {
      super(iIl.interface l11I("tJFTlQ0XYx+WDplWA9c="), IllIi.l1l11I, iIl.interface l11I("q5pRnRJEEB2DSItRCpPbmp+RR9wWURAemwecUhw="));
   }

   @Override
   public void break_ilil/* $VF was: break ilil*/() {
      this.resetState();
   }

   public boolean shouldForceSneak(class_310 var1) {
      this.scaleSneakThisTick = false;
      if (this.byte iII1() && var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1690 != null && var1.field_1724.method_5805()) {
         class_746 var2 = var1.field_1724;
         if (this.onlyWhenHoldingBlocks.break Ii() && !this.isHoldingBlock(var2)) {
            this.edgeActive = false;
            this.edgeTicks = 0;
            return false;
         } else {
            class_2338 var3 = class_2338.method_49637(var2.method_23317(), var2.method_23318() - 1.0, var2.method_23321());
            boolean var4 = this.onlyOnGround.break Ii() && !var2.method_24828();
            boolean var5 = this.onlyWhenMovingBackwards.break Ii() && var1.field_1690.field_1894.method_1434();
            this.edgeActive = !var4 && !var5 && var1.field_1687.method_8320(var3).method_26215();
            if (this.edgeActive) {
               this.remainingSneakTicks = this.rollLength();
               this.edgeTicks++;
            } else {
               this.edgeTicks = 0;
            }

            boolean var6 = this.remainingSneakTicks > 0;
            this.remainingSneakTicks--;
            this.scaleSneakThisTick = this.remainingSneakTicks > 0 && this.edgeTicks <= 2;
            return var6;
         }
      } else {
         this.resetState();
         return false;
      }
   }

   public double getSneakSpeedMultiplier(class_310 var1) {
      return this.byte iII1() && this.scaleSneakThisTick ? this.sneakSpeedMultiplier.break Ii() : 1.0;
   }

   public boolean shouldSuppressSprint(class_310 var1) {
      return this.byte iII1() && this.edgeActive;
   }

   public boolean shouldBlockEdgeMovement(class_310 var1) {
      return false;
   }

   private boolean isHoldingBlock(class_746 var1) {
      return var1.method_6047().method_7909() instanceof class_1747 || var1.method_6079().method_7909() instanceof class_1747;
   }

   private int rollLength() {
      int var1 = Math.max(1, (int)Math.round(this.length.break I1l()));
      int var2 = Math.max(var1, (int)Math.round(this.length.return I11()));
      return ThreadLocalRandom.current().nextInt(var1, var2 + 1);
   }

   private void resetState() {
      this.edgeActive = false;
      this.edgeTicks = 0;
      this.remainingSneakTicks = 0;
      this.scaleSneakThisTick = false;
   }
}
