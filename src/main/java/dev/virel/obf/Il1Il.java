package dev.virel.obf;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record Il1Il(Object message, ChannelPromise promise, long queuedAtNanos, int transactionId, long sequence) {
}
