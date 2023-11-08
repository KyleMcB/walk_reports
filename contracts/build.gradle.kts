/*
 * Copyright © 2023 Kyle McBurnett. All rights reserved.
 *
 */

plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
    jvmToolchain(17)

}
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}