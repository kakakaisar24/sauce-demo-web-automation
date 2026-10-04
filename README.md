# Automation Test Framework - Web UI & API

Automation test framework untuk melakukan pengujian Web UI dan API dalam satu repository.

Project ini dibuat menggunakan Java, Gradle, Selenium WebDriver, Rest Assured, Cucumber, JUnit, dan Page Object Model.

## Tech Stack

- Java 26
- Gradle 9.6
- Selenium WebDriver
- Rest Assured
- Cucumber
- JUnit 5
- WebDriverManager
- GitHub Actions

## Project Structure

```text
sauce-demo-web-automation/
│
├── .github/
│   └── workflows/
│       └── main.yml
│
├── gradle/
│   └── wrapper/
│
├── src/
│   └── test/
│       ├── java/
│       │   │
│       │   ├── base/
│       │   │   └── BaseTest.java
│       │   │
│       │   ├── hooks/
│       │   │   └── CucumberHooks.java
│       │   │
│       │   ├── runner/
│       │   │   └── CucumberTest.java
│       │   │
│       │   ├── web/
│       │   │   ├── pages/
│       │   │   │   ├── LoginPage.java
│       │   │   │   └── HomePage.java
│       │   │   │
│       │   │   └── stepdefinitions/
│       │   │       ├── LoginStepDef.java
│       │   │       └── HomeStepDef.java
│       │   │
│       │   └── api/
│       │       ├── clients/
│       │       │   └── UserApi.java
│       │       │
│       │       └── stepdefinitions/
│       │           └── UserApiStepDef.java
│       │
│       └── resources/
│           └── features/
│               ├── web/
│               │   └── login.feature
│               │
│               └── api/
│                   └── user.feature
│
├── .gitignore
├── build.gradle
├── gradlew
├── gradlew.bat
├── README.md
└── settings.gradle

## CI Validation

This repository uses GitHub Actions to automatically execute the automation test suite for Pull Requests.
