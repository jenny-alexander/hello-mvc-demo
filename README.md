# hello-mvc-demo Application

The 'hello-mvc-demo' Spring Boot application is a simple example demonstrating how to create a basic Spring Boot web application with a controller and Thymeleaf templating.

## Prerequisites

Make sure you have the following installed on your machine:

- Java 17 or later
- Gradle (if using Gradle) or Maven (if using Maven)

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/greet-spring-boot.git

2. Navigate to the project directory:
   ```bash
   cd hello-mvc-demo

3. Build and run the application with Gradle:
   ```bash
   ./gradlew bootRun

4. Open your browser and visit http://localhost:8080/gree?name={yourName}

## Project Structure
- `src/main/java/com/HelloMvcDemoController.java`: Controller class handling the "/greet" endpoint.
- `src/main/resources/templates/greet.html`: Thymeleaf template for rendering the greeting message.

## Customization
You can customize the greeting message by providing a different value for the name query parameter. For example:

http://localhost:8080/greet?name=Alice
http://localhost:8080/greet?name=Bob

## Dependencies
- Spring Boot Starter Web: Handles web-related configurations
- Spring Boot Starter Thymeleaf: Integrates Thymeleaf as the templating engine.