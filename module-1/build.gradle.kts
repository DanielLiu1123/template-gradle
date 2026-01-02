description = "Module 1"

val springBootVersion: String = providers.gradleProperty("springBootVersion").get()

dependencies {
    api("org.springframework.boot:spring-boot-starter:$springBootVersion")

    optional("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
}

apply(from = "${rootDir}/gradle/deploy.gradle.kts")

