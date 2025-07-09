package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot Application Class
 * 
 * This class serves as the entry point for the Spring Boot application.
 * The @SpringBootApplication annotation is a convenience annotation that combines:
 * - @Configuration: Indicates that this class contains configuration
 * - @EnableAutoConfiguration: Enables Spring Boot's auto-configuration mechanism
 * - @ComponentScan: Enables component scanning in the current package and sub-packages
 */
@SpringBootApplication
public class SpringLearnApplication {

	// Logger instance for logging application events
	private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);

	/**
	 * Main method - Entry point of the Spring Boot application
	 * 
	 * @param args command line arguments passed to the application
	 */
	public static void main(String[] args) {
		logger.info("=================================================================");
		logger.info("Starting Spring Learn Application...");
		logger.info("=================================================================");
		
		// Start the Spring Boot application
		SpringApplication.run(SpringLearnApplication.class, args);
		
		logger.info("=================================================================");
		logger.info("Spring Learn Application started successfully!");
		logger.info("Application is running on: http://localhost:8080");
		logger.info("=================================================================");
	}
}
