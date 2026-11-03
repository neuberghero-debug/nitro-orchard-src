package dev.virel.obf;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record l111(
   II1l mode,
   boolean rosterCheck,
   boolean pingCheck,
   boolean identityCheck,
   boolean invisibilityCheck,
   boolean positionCheck,
   boolean airMovementCheck,
   boolean duplicateIdentityCheck,
   boolean entityIdCheck,
   long gracePeriodBits
) {
}
