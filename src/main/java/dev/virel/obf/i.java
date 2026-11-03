package dev.virel.obf;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record i(Object message, ChannelPromise promise, long queuedAtNanos, long sequence) {
}
