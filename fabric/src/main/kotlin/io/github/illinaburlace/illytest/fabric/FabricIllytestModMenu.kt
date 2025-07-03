package io.github.illinaburlace.illytest.fabric

import com.terraformersmc.modmenu.api.ConfigScreenFactory
import com.terraformersmc.modmenu.api.ModMenuApi
import io.github.illinaburlace.illytest.IllytestClient

object FabricIllytestModMenu : ModMenuApi {
    override fun getModConfigScreenFactory() = ConfigScreenFactory(IllytestClient::getConfigScreen)
}
