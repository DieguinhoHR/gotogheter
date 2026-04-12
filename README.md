# Gotogheter

Spring Boot application written in Kotlin.

## Requirements

- Java 21
- Gradle (or use the wrapper `./gradlew`)

## Running the application

```bash
./gradlew bootRun
```

## Running tests

```bash
./gradlew test
```

## Code coverage with JaCoCo

Generate the coverage report (runs tests automatically):

```bash
./gradlew jacocoTestReport
```

The HTML report will be available at:

```
build/reports/jacoco/test/html/index.html
```

The XML report (used by CI) is at:

```
build/reports/jacoco/test/jacocoTestReport.xml
```

### Enforce minimum coverage (80%)

```bash
./gradlew jacocoTestCoverageVerification
```

The build will fail if overall line coverage drops below **80%**.

### Run tests + verify coverage in one command

```bash
./gradlew test jacocoTestCoverageVerification
```

## Static analysis with Detekt

```bash
./gradlew detekt
```
