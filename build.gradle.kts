plugins {
    id("java")
}

allprojects {
    group = "io.github.merrydev"
    version = project.property("version") as String
}

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }
}