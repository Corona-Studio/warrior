plugins {
    java
    kotlin("jvm") version "1.4.0"
    id("com.github.johnrengelman.shadow") version "6.0.0"
}

group = "fun.craftmine"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    maven {
        url = uri("https://maven.aliyun.com/repository/public")
    }
    maven {
        url = uri("https://hub.spigotmc.org/nexus/content/groups/public/")
    }
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("org.spigotmc", "spigot-api", "1.13.2-R0.1-SNAPSHOT")
    testImplementation("junit", "junit", "4.12")
}
