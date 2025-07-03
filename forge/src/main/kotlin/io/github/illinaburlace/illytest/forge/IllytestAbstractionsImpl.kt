@file:JvmName("IllytestAbstractionsImpl")

package io.github.illinaburlace.illytest.forge

import io.github.illinaburlace.illytest.registry.IllytestRegistrar
import net.minecraftforge.registries.RegisterEvent
import thedarkcolour.kotlinforforge.forge.MOD_BUS

fun <T : Any> initRegistry(registrar: IllytestRegistrar<T>) {
    MOD_BUS.addListener { event: RegisterEvent ->
        event.register(registrar.registryKey) { helper ->
            registrar.init(helper::register)
        }
    }
}
