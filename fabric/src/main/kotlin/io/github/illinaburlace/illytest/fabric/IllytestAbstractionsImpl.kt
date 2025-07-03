@file:JvmName("IllytestAbstractionsImpl")

package io.github.illinaburlace.illytest.fabric

import io.github.illinaburlace.illytest.registry.IllytestRegistrar
import net.minecraft.core.Registry

fun <T : Any> initRegistry(registrar: IllytestRegistrar<T>) {
    val registry = registrar.registry
    registrar.init { id, value -> Registry.register(registry, id, value) }
}
