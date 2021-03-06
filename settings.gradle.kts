pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "kotlin-multiplatform") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }
}

include(
    ":redux-kotlin",
    ":redux-kotlin-threadsafe",
    ":examples:counter:common",
    ":examples:counter:android",
    ":examples:todos:common",
    ":examples:todos:android"
)

rootProject.name = "Redux-Kotlin"
