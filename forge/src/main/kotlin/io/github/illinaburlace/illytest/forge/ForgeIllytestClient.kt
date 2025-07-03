package io.github.illinaburlace.illytest.forge

import io.github.illinaburlace.illytest.IllytestClient
import net.minecraftforge.client.ConfigScreenHandler.ConfigScreenFactory
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import thedarkcolour.kotlinforforge.forge.LOADING_CONTEXT

object ForgeIllytestClient {
    fun init(event: FMLClientSetupEvent) {
        IllytestClient.init()
        LOADING_CONTEXT.registerExtensionPoint(ConfigScreenFactory::class.java) {
            ConfigScreenFactory { _, parent -> IllytestClient.getConfigScreen(parent) }
        }
    }
}
