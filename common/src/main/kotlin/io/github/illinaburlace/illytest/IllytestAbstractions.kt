@file:JvmName("IllytestAbstractions")

package io.github.illinaburlace.illytest

import dev.architectury.injectables.annotations.ExpectPlatform
import io.github.illinaburlace.illytest.registry.IllytestRegistrar

fun initRegistries(vararg registries: IllytestRegistrar<*>) {
    for (registry in registries) {
        initRegistry(registry)
    }
}

@ExpectPlatform
fun <T : Any> initRegistry(registrar: IllytestRegistrar<T>) {
    throw AssertionError()
}
