package io.github.illinaburlace.illytest.fabric

import io.github.illinaburlace.illytest.IllytestClient
import net.fabricmc.api.ClientModInitializer

object FabricIllytestClient : ClientModInitializer {
    override fun onInitializeClient() {
        IllytestClient.init()
    }
}
