plugins {
    id("org.jetbrains.kotlin.js") version "1.4.21"
}

group = "com.hunachi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    val ktorVersion = "1.5.2"
    implementation("io.ktor:ktor-client-js:$ktorVersion")
}

kotlin {
    js {
        browser {
            webpackTask {
                cssSupport.enabled = true
            }

            runTask {
                cssSupport.enabled = true
            }

            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
                }
            }
        }
        binaries.executable()
    }
}