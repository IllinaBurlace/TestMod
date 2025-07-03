package io.github.illinaburlace.illytest

import net.minecraft.resources.ResourceLocation
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import io.github.illinaburlace.illytest.config.IllytestConfig
import io.github.illinaburlace.illytest.networking.IllytestNetworking
import io.github.illinaburlace.illytest.registry.IllytestActions

object Illytest {
    const val MODID = "illytest"

    @JvmField
    val LOGGER: Logger = LogManager.getLogger(MODID)

    @JvmStatic
    fun id(path: String) = ResourceLocation(MODID, path)

    fun init() {
        IllytestConfig.init()
        initRegistries(
            IllytestActions,
        )
        IllytestNetworking.init()
    }
}
