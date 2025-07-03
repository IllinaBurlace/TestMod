package io.github.illinaburlace.illytest.fabric

import io.github.illinaburlace.illytest.Illytest
import net.fabricmc.api.ModInitializer

object FabricIllytest : ModInitializer {
    override fun onInitialize() {
        Illytest.init()
    }
}
