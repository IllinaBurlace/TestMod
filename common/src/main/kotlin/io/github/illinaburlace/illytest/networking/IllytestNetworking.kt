package io.github.illinaburlace.illytest.networking

import dev.architectury.networking.NetworkChannel
import io.github.illinaburlace.illytest.Illytest
import io.github.illinaburlace.illytest.networking.msg.IllytestMessageCompanion

object IllytestNetworking {
    val CHANNEL: NetworkChannel = NetworkChannel.create(Illytest.id("networking_channel"))

    fun init() {
        for (subclass in IllytestMessageCompanion::class.sealedSubclasses) {
            subclass.objectInstance?.register(CHANNEL)
        }
    }
}
