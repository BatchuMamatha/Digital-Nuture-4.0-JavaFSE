# Spring Learn - Spring Web Project using Maven

This project demonstrates how to create a Spring Web application using Maven and Spring Boot 3.

## Project Overview

- **Group ID**: com.cognizant
- **Artifact ID**: spring-learn
- **Version**: 0.0.1-SNAPSHOT
- **Java Version**: 17
- **Spring Boot Version**: 3.2.0

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── cognizant/
│   │           └── springlearn/
│   │               ├── SpringLearnApplication.java  # Main application class
│   │               └── controller/
│   │                   └── HelloController.java     # Sample REST controller
│   └── resources/
│       └── application.properties                   # Application configuration
└── test/
    └── java/
        └── com/
            └── cognizant/
                └── springlearn/
                    └── SpringLearnApplicationTests.java  # Test class
```

## Key Components

### 1. src/main/java
- **Purpose**: Contains the main application code
- **SpringLearnApplication.java**: Entry point of the application with @SpringBootApplication annotation
- **controller/**: Contains REST controllers for handling HTTP requests

### 2. src/main/resources
- **Purpose**: Contains application configuration files
- **application.properties**: Configuration for server port, logging, DevTools, etc.

### 3. src/test/java
- **Purpose**: Contains test classes for the application
- **SpringLearnApplicationTests.java**: Integration tests to verify application startup

### 4. SpringLearnApplication.java
- Contains the main() method that starts the Spring Boot application
- Annotated with @SpringBootApplication
- Includes logging to verify application startup

### 5. @SpringBootApplication Annotation
This is a convenience annotation that combines:
- **@Configuration**: Indicates that this class contains configuration
- **@EnableAutoConfiguration**: Enables Spring Boot's auto-configuration mechanism
- **@ComponentScan**: Enables component scanning in the current package and sub-packages

### 6. pom.xml Configuration
- **Parent**: spring-boot-starter-parent (provides dependency management)
- **Dependencies**:
  - spring-boot-starter-web: For web applications
  - spring-boot-devtools: For development-time features
  - spring-boot-starter-test: For testing support
- **Build Plugin**: spring-boot-maven-plugin for packaging

## Dependencies

### Core Dependencies:
1. **spring-boot-starter-web**: 
   - Provides web MVC support
   - Includes embedded Tomcat server
   - JSON processing capabilities

2. **spring-boot-devtools**:
   - Automatic application restart
   - Live reload capability
   - Enhanced development experience

3. **spring-boot-starter-test**:
   - JUnit 5 support
   - Mockito for mocking
   - Spring Test framework

## How to Build and Run

### Build the Project:
```bash
mvn clean package
```

### Run the Application:
```bash
mvn spring-boot:run
```

Or run the main class directly:
```bash
java -jar target/spring-learn-0.0.1-SNAPSHOT.jar
```

## Available Endpoints

Once the application is running, you can access:

- **Home**: http://localhost:8080/
- **Health Check**: http://localhost:8080/health
- **API Info**: http://localhost:8080/api/info

## Features Demonstrated

1. **Spring Boot Auto-Configuration**: Automatic configuration of web server and components
2. **Embedded Server**: No need for external application server
3. **RESTful Web Services**: Simple REST controllers
4. **Development Tools**: Hot reload and automatic restart
5. **Logging**: Structured logging with SLF4J
6. **Testing**: Unit and integration tests with Spring Boot Test

## Development Notes

- The application uses Spring Boot 3.2.0 with Java 17
- DevTools is enabled for development convenience
- Logging is configured to show DEBUG level for application packages
- The application runs on port 8080 by default

## Next Steps

This basic project can be extended with:
- Database integration (JPA/Hibernate)
- Security (Spring Security)
- Additional REST endpoints
- Service layer architecture
- Exception handling
- API documentation (Swagger/OpenAPI)
