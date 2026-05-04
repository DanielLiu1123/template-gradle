plugins {
    id("deploy")
}

description = "Module 1"

val springBootVersion: String = providers.gradleProperty("springBootVersion").get()

dependencies {
    api("org.jspecify:jspecify:1.0.0")
    api("org.springframework.boot:spring-boot-starter:$springBootVersion")

    optional("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
}
