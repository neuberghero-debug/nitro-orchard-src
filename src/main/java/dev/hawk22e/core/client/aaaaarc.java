package dev.hawk22e.core.client;

import com.google.gson.JsonObject;
import dev.virel.obf.11ll;
import dev.virel.obf.1IlI;
import dev.virel.obf.IIII;
import dev.virel.obf.IIIIl;
import dev.virel.obf.IIi1;
import dev.virel.obf.Ii11i;
import dev.virel.obf.IiiIi;
import dev.virel.obf.Ilii1;
import dev.virel.obf.IllIi;
import dev.virel.obf.iIl;
import dev.virel.obf.l;
import dev.virel.obf.li;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;

@Environment(EnvType.CLIENT)
public final class aaaaarc extends Ii11i {
   private static final int HOTBAR_SIZE = 9;
   private static final double BLOCK_REACH = 4.5;
   private static final double BLOCK_REACH_SQUARED = 20.25;
   private static final double RAIL_TOP_HEIGHT = 0.125;
   private static final long RETRY_DELAY_MS = 50L;
   private static final int SILENT_BLOCK_DISPATCH_TICKS = 1;
   private static final int MAX_RAIL_CHECK_RETRIES = 20;
   private static final String LEGACY_DELAY = iIl.interface l11I("vJFYnQA=");
   private final l switchDelay = this.private iI(new l(iIl.interface l11I("q4NdiBpfEDiSBJ5A"), 0.0, 0.0, 0.0, 300.0, 5.0).float Ii(iIl.interface l11I("lYc=")));
   private final l cartDelay = this.private iI(
      new l(iIl.interface l11I("u5VGiFlnXB2UDd99Ct/fhw=="), 0.0, 0.0, 0.0, 300.0, 5.0).float Ii(iIl.interface l11I("lYc="))
   );
   private final Ilii1 switchBack = this.private iI(new Ilii1(iIl.interface l11I("q4NdiBpfED6WC5Q="), true));
   private int pendingRailPlacementTick = Integer.MIN_VALUE;
   private long pendingRailDispatchSerial = Long.MIN_VALUE;
   private class_3965 pendingRailHit;
   private int originalSlot = -1;
   private class_2338 scheduledRailPos;
   private int scheduledRestoreSlot = -1;
   private int scheduledCartSlot = -1;
   private boolean scheduledCartSlotPrepared;
   private IIIIl scheduledCartSlotAction;
   private long scheduledPlacementAtMs;
   private int scheduledDispatchTick = Integer.MIN_VALUE;
   private int scheduledRestoreTick = Integer.MIN_VALUE;
   private boolean internalPlacement;
   private boolean scheduledInteractionDispatched;
   private int railCheckRetries;

   public aaaaarc() {
      super(iIl.interface l11I("vpVHiDpWQgg="), IllIi.iI1llI, iIl.interface l11I("qJhVnxxEEB3XBZZXCtDfjIzUVZoNUkJcjgeKGR/f352d1FXcC1ZZENk="));
   }

   @Override
   public String switch_iIII/* $VF was: switch iIII*/() {
      String var1 = this.native iiiI();
      return var1 != null && !var1.isBlank() ? this.interface iIii() + iIl.interface l11I("2A==") + var1 : this.interface iIii();
   }

   @Override
   public String native_iiiI/* $VF was: native iiiI*/() {
      return null;
   }

   @Override
   public void enum_ii1/* $VF was: enum ii1*/(JsonObject var1) {
      super.enum ii1(var1);
      this.protected iI(var1, LEGACY_DELAY, new l[]{this.switchDelay, this.cartDelay});
   }

   @Override
   public void break_ilil/* $VF was: break ilil*/() {
      this.restoreOriginalSlot(class_310.method_1551());
      this.resetCapture();
      this.resetScheduledPlacement();
      this.internalPlacement = false;
   }

   @Override
   public void public_ili1/* $VF was: public ili1*/() {
      this.tickScheduledMinecart(class_310.method_1551());
   }

   public boolean isInternalPlacement() {
      return this.internalPlacement;
   }

   public void captureRailPlacementAttempt(class_310 var1, class_1268 var2, class_3965 var3) {
      if (this.canCapture(var1, var2, var3)) {
         this.restoreOriginalSlot(var1);
         this.resetCapture();
         this.resetScheduledPlacement();
         this.pendingRailPlacementTick = var1.field_1724.field_6012;
         this.pendingRailDispatchSerial = 1IlI.while i1Il();
         this.pendingRailHit = var3;
         this.originalSlot = 1IlI.static IIiI(var1.field_1724.method_31548());
      }
   }

   public void onRailPlacementResult(class_310 var1, class_1268 var2, class_3965 var3, class_1269 var4) {
      if (this.pendingRailPlacementTick != Integer.MIN_VALUE) {
         try {
            if (this.byte iII1()
               && !this.internalPlacement
               && !this.isCartOperationOwnedElsewhere()
               && var4 != null
               && var4.method_23665()
               && var1 != null
               && var1.field_1724 != null
               && var1.field_1687 != null
               && var1.field_1761 != null
               && var2 == class_1268.field_5808
               && var1.field_1724.field_6012 == this.pendingRailPlacementTick
               && 1IlI.while i1Il() > this.pendingRailDispatchSerial) {
               class_3965 var5 = this.pendingRailHit != null ? this.pendingRailHit : var3;
               class_2338 var6 = this.resolvePlacedRailPosition(var1, var5);
               if (var6 != null) {
                  this.scheduleMinecartPlacement(var6, this.originalSlot);
                  this.tickScheduledMinecart(var1);
               }

               return;
            }
         } finally {
            this.resetCapture();
         }
      }
   }

   private void tickScheduledMinecart(class_310 var1) {
      if (this.scheduledRailPos != null) {
         if (this.isCartOperationOwnedElsewhere()) {
            this.yieldCartOperation(var1);
         } else if (!this.hasContext(var1)) {
            this.restoreOriginalSlot(var1);
            this.resetScheduledPlacement();
         } else if (this.scheduledRestoreTick != Integer.MIN_VALUE) {
            if (var1.field_1724.field_6012 >= this.scheduledRestoreTick) {
               this.restoreOriginalSlot(var1);
               this.resetScheduledPlacement();
            }
         } else if (this.scheduledDispatchTick != Integer.MIN_VALUE) {
            if (var1.field_1724.field_6012 > this.scheduledDispatchTick) {
               this.scheduledDispatchTick = Integer.MIN_VALUE;
               this.scheduledPlacementAtMs = System.currentTimeMillis() + 50L;
            }
         } else if (System.currentTimeMillis() >= this.scheduledPlacementAtMs) {
            class_2338 var2 = this.scheduledRailPos;
            if (!this.isRailBlock(var1.field_1687.method_8320(var2))) {
               this.retryScheduledPlacement(var1);
            } else if (!this.canPlaceMinecartAt(var1, var2)) {
               this.finishScheduledPlacement(var1);
            } else {
               if (this.scheduledCartSlot < 0) {
                  this.scheduledCartSlot = this.findCartSlot(var1.field_1724);
               }

               if (!this.scheduledCartSlotPrepared) {
                  if (this.scheduledCartSlot < 0 || !this.prepareCartSlot(var1, this.scheduledCartSlot)) {
                     this.finishScheduledPlacement(var1);
                     return;
                  }

                  if (this.scheduledCartSlotAction == null
                     || !1IlI.double I1II(var1, this.scheduledCartSlotAction)
                     || this.scheduledCartSlotAction.volatile iiI1() != this.scheduledCartSlot) {
                     boolean var3 = 1IlI.public Iii1(var1) != this.scheduledCartSlot;
                     int var4 = var3 ? this.rollDelayTicks(this.switchDelay) : 0;
                     this.scheduledCartSlotAction = 1IlI.switch IIiI(var1, this, this.scheduledCartSlot, var4, true);
                  }

                  if (!this.scheduledCartSlotAction.static i1Il()) {
                     this.scheduledCartSlotAction = null;
                     this.scheduledPlacementAtMs = System.currentTimeMillis() + 50L;
                     return;
                  }

                  if (!1IlI.strictfp IIiI(var1, this.scheduledCartSlotAction)) {
                     return;
                  }

                  this.scheduledCartSlotAction = null;
                  this.scheduledCartSlotPrepared = true;
               }

               if (this.isLookingAtRail(var1, var2)) {
                  this.finishMinecartInteraction(var1, var2);
               } else {
                  float[] var5 = IiiIi.synchronized IIiI(var1, this.cartHitVec(var2));
                  if (var5 == null) {
                     this.retryScheduledPlacement(var1);
                  } else {
                     this.scheduledDispatchTick = var1.field_1724.field_6012 + 1;
                     boolean var6 = IiiIi.int I1il(var1, 200, var5[0], var5[1], () -> this.finishMinecartInteraction(var1, var2));
                     if (!var6) {
                        this.scheduledDispatchTick = Integer.MIN_VALUE;
                        this.scheduledPlacementAtMs = System.currentTimeMillis() + 50L;
                     }
                  }
               }
            }
         }
      }
   }

   private boolean canCapture(class_310 var1, class_1268 var2, class_3965 var3) {
      return this.byte iII1()
         && !this.internalPlacement
         && !this.isCartOperationOwnedElsewhere()
         && var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1761 != null
         && var2 == class_1268.field_5808
         && var3 != null
         && var3.method_17783() == class_240.field_1332
         && var3.method_17780() == class_2350.field_11036
         && !IIII.enum i1li(var1)
         && this.isRailItem(var1.field_1724.method_6047());
   }

   private boolean finishMinecartInteraction(class_310 var1, class_2338 var2) {
      this.scheduledDispatchTick = Integer.MIN_VALUE;
      if (this.isCartOperationOwnedElsewhere()) {
         this.yieldCartOperation(var1);
         return false;
      } else if (this.scheduledRailPos != null
         && this.scheduledRailPos.equals(var2)
         && !this.scheduledInteractionDispatched
         && this.canPlaceMinecartAt(var1, var2)
         && this.isLookingAtRail(var1, var2)
         && this.scheduledCartSlot >= 0
         && this.isMinecartItem(var1.field_1724.method_31548().method_5438(this.scheduledCartSlot))) {
         class_3965 var3 = new class_3965(this.cartHitVec(var2), class_2350.field_11036, var2, false);
         if (1IlI.public Iii1(var1) != this.scheduledCartSlot) {
            this.retryScheduledPlacement(var1);
            return false;
         } else {
            long var4 = 1IlI.while i1Il();
            boolean var6 = 1IlI.interface i1ii();
            if (!var6) {
               this.retryScheduledPlacement(var1);
               return false;
            } else {
               class_1269 var7;
               try {
                  this.internalPlacement = true;

                  try {
                     var7 = var1.field_1761.method_2896(var1.field_1724, class_1268.field_5808, var3);
                  } finally {
                     this.internalPlacement = false;
                  }
               } finally {
                  1IlI.strictfp i1ll();
               }

               if (var7 != null && var7.method_23665()) {
                  var1.field_1724.method_6104(class_1268.field_5808);
               }

               this.scheduledInteractionDispatched = 1IlI.while i1Il() != var4;
               if (!this.scheduledInteractionDispatched) {
                  this.retryScheduledPlacement(var1);
                  return false;
               } else {
                  this.finishScheduledPlacement(var1);
                  return true;
               }
            }
         }
      } else {
         this.retryScheduledPlacement(var1);
         return false;
      }
   }

   private boolean isCartOperationOwnedElsewhere() {
      aaaaady var1 = aaaaady.get();
      if (var1 != null && var1.modules() != null) {
         li var2 = var1.modules().synchronized iI();
         if (var2 != null && var2.strictfp II11l()) {
            return true;
         } else {
            11ll var3 = var1.modules().transient iI();
            return var3 != null && var3.for Ii1lI();
         }
      } else {
         return false;
      }
   }

   private void yieldCartOperation(class_310 var1) {
      this.restoreOriginalSlot(var1);
      this.resetCapture();
      this.resetScheduledPlacement();
      this.internalPlacement = false;
   }

   private class_2338 resolvePlacedRailPosition(class_310 var1, class_3965 var2) {
      if (var1 != null && var1.field_1687 != null && var2 != null) {
         class_2338 var3 = var2.method_17777();
         class_2338 var4 = var3.method_10093(var2.method_17780());
         if (this.isRailBlock(var1.field_1687.method_8320(var4))) {
            return var4.method_10062();
         } else {
            return this.isRailBlock(var1.field_1687.method_8320(var3)) ? var3.method_10062() : var4.method_10062();
         }
      } else {
         return null;
      }
   }

   private boolean isRailItem(class_1799 var1) {
      return var1 != null
         && !var1.method_7960()
         && (
            var1.method_31574(class_1802.field_8129)
               || var1.method_31574(class_1802.field_8848)
               || var1.method_31574(class_1802.field_8211)
               || var1.method_31574(class_1802.field_8655)
         );
   }

   private boolean isRailBlock(class_2680 var1) {
      return var1 != null
         && (
            var1.method_27852(class_2246.field_10167)
               || var1.method_27852(class_2246.field_10425)
               || var1.method_27852(class_2246.field_10025)
               || var1.method_27852(class_2246.field_10546)
         );
   }

   private boolean isMinecartItem(class_1799 var1) {
      return var1 != null && !var1.method_7960() && var1.method_31574(class_1802.field_8069);
   }

   private boolean canPlaceMinecartAt(class_310 var1, class_2338 var2) {
      return this.hasContext(var1)
         && var2 != null
         && this.isRailBlock(var1.field_1687.method_8320(var2))
         && var1.field_1724.method_33571().method_1025(this.cartHitVec(var2)) <= 20.25;
   }

   private boolean isLookingAtRail(class_310 var1, class_2338 var2) {
      if (this.hasContext(var1) && var2 != null) {
         if (var1.field_1724.method_5745(4.5, 1.0F, false) instanceof class_3965 var4
            && var4.method_17783() == class_240.field_1332
            && var4.method_17777().equals(var2)
            && var4.method_17780() == class_2350.field_11036
            && this.isRailBlock(var1.field_1687.method_8320(var2))) {
            return true;
         }

         return false;
      } else {
         return false;
      }
   }

   private class_243 cartHitVec(class_2338 var1) {
      return class_243.method_24955(var1).method_1031(0.0, 0.125, 0.0);
   }

   private int findCartSlot(class_1657 var1) {
      return this.findItemSlot(var1, class_1802.field_8069);
   }

   private int findItemSlot(class_1657 var1, class_1792 var2) {
      for (int var3 = 0; var3 < 9; var3++) {
         class_1799 var4 = var1.method_31548().method_5438(var3);
         if (var4.method_31574(var2)) {
            return var3;
         }
      }

      return -1;
   }

   private boolean prepareCartSlot(class_310 var1, int var2) {
      return var1 != null && var1.field_1724 != null && var2 >= 0 && var2 < 9 && !IIII.enum i1li(var1)
         ? this.isMinecartItem(var1.field_1724.method_31548().method_5438(var2))
         : false;
   }

   private void scheduleMinecartPlacement(class_2338 var1, int var2) {
      this.scheduledRailPos = var1.method_10062();
      this.scheduledRestoreSlot = var2;
      this.scheduledCartSlot = -1;
      this.scheduledCartSlotPrepared = false;
      this.scheduledCartSlotAction = null;
      this.railCheckRetries = 0;
      this.scheduledDispatchTick = Integer.MIN_VALUE;
      this.scheduledRestoreTick = Integer.MIN_VALUE;
      this.scheduledInteractionDispatched = false;
      this.scheduledPlacementAtMs = System.currentTimeMillis() + this.rollDelayMs(this.cartDelay);
   }

   private void retryScheduledPlacement(class_310 var1) {
      this.railCheckRetries++;
      if (this.railCheckRetries > 20) {
         this.finishScheduledPlacement(var1);
      } else {
         this.scheduledPlacementAtMs = System.currentTimeMillis() + 50L;
      }
   }

   private void finishScheduledPlacement(class_310 var1) {
      if (this.switchBack.break Ii() && this.scheduledRestoreSlot >= 0 && this.scheduledRestoreSlot < 9 && this.scheduledRestoreSlot != this.scheduledCartSlot) {
         this.scheduledRestoreTick = var1.field_1724.field_6012 + 1;
      } else {
         this.resetScheduledPlacement();
      }
   }

   private void restoreOriginalSlot(class_310 var1) {
      int var2 = this.scheduledRestoreSlot >= 0 ? this.scheduledRestoreSlot : this.originalSlot;
      if (var1 != null && var1.field_1724 != null) {
         if (this.switchBack.break Ii() && var2 >= 0 && var2 < 9) {
            1IlI.break IIiI(var1, this, var2);
         } else {
            1IlI.synchronized IIiI(var1, this, IIi1.ill1i1);
         }
      }
   }

   private boolean hasContext(class_310 var1) {
      return this.byte iII1() && var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null && var1.field_1724.method_5805();
   }

   private long rollDelayMs(l var1) {
      double var2 = var1.break I1l();
      double var4 = var1.return I11();
      return var2 >= var4 ? Math.max(0L, Math.round(var2)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private int rollDelayTicks(l var1) {
      return Math.max(0, (int)Math.ceil((double)this.rollDelayMs(var1) / 50.0));
   }

   private void resetCapture() {
      this.pendingRailPlacementTick = Integer.MIN_VALUE;
      this.pendingRailDispatchSerial = Long.MIN_VALUE;
      this.pendingRailHit = null;
      this.originalSlot = -1;
   }

   private void resetScheduledPlacement() {
      this.scheduledRailPos = null;
      this.scheduledRestoreSlot = -1;
      this.scheduledCartSlot = -1;
      this.scheduledCartSlotPrepared = false;
      this.scheduledCartSlotAction = null;
      this.scheduledPlacementAtMs = 0L;
      this.scheduledDispatchTick = Integer.MIN_VALUE;
      this.scheduledRestoreTick = Integer.MIN_VALUE;
      this.scheduledInteractionDispatched = false;
      this.railCheckRetries = 0;
   }
}
