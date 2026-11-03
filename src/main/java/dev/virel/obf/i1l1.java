package dev.virel.obf;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record i1l1(Object message, ChannelPromise promise, 1III mode, long queuedAtNanos, long sequence) {
}
