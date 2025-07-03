package io.github.illinaburlace.illytest.networking.handler

import dev.architectury.networking.NetworkManager.PacketContext
import io.github.illinaburlace.illytest.config.IllytestConfig
import io.github.illinaburlace.illytest.networking.msg.*

fun IllytestMessageS2C.applyOnClient(ctx: PacketContext) = ctx.queue {
    when (this) {
        is MsgSyncConfigS2C -> {
            IllytestConfig.onSyncConfig(serverConfig)
        }

        // add more client-side message handlers here
    }
}
