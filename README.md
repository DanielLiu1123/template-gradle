# gradle-template

A template project built with Gradle.

## Overview

This is a Java application template configured with:
- Java 17
- Gradle 9.1.0 with Groovy DSL
- JUnit Jupiter (JUnit 5) for testing
- Google Guava library

## Project Structure

```
gradle-template/
├── app/                          # Application module
│   ├── src/
│   │   ├── main/java/           # Application source code
│   │   └── test/java/           # Test source code
│   └── build.gradle             # Build configuration
├── gradle/                       # Gradle wrapper files
├── gradlew                       # Gradle wrapper script (Unix)
├── gradlew.bat                   # Gradle wrapper script (Windows)
└── settings.gradle               # Project settings
```

## Getting Started

### Prerequisites

- Java 17 or higher

### Building the Project

```bash
./gradlew build
```

### Running the Application

```bash
./gradlew run
```

### Running Tests

```bash
./gradlew test
```

## Common Gradle Tasks

- `./gradlew build` - Builds the project
- `./gradlew clean` - Cleans the build directory
- `./gradlew test` - Runs tests
- `./gradlew run` - Runs the application
- `./gradlew tasks` - Lists all available tasks

## License

This project is a template and can be used freely.