package dev.virel.obf;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record I(Object message, ChannelPromise promise, long sequence, Il1Il transaction) {
}
