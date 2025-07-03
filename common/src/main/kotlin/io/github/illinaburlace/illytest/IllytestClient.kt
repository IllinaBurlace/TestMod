package io.github.illinaburlace.illytest

import io.github.illinaburlace.illytest.config.IllytestConfig
import io.github.illinaburlace.illytest.config.IllytestConfig.GlobalConfig
import me.shedaniel.autoconfig.AutoConfig
import net.minecraft.client.gui.screens.Screen

object IllytestClient {
    fun init() {
        IllytestConfig.initClient()
    }

    fun getConfigScreen(parent: Screen): Screen {
        return AutoConfig.getConfigScreen(GlobalConfig::class.java, parent).get()
    }
}
