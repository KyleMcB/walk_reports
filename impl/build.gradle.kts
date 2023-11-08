/*
 * Copyright © 2023 Kyle McBurnett. All rights reserved.
 *
 */

plugins {
    kotlin("jvm")
    jacoco
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
dependencies {
    implementation(project(":contracts"))
}
jacoco {
    toolVersion = "0.8.7"
}

tasks.jacocoTestCoverageVerification {
    violationRules {
        rule {
            limit {
                minimum = 0.99f.toBigDecimal()
            }
        }


    }
}