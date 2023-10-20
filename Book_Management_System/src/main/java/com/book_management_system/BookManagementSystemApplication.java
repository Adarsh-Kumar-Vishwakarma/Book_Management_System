package com.book_management_system;

// Import statement for the SpringApplication class from the Spring Boot framework
import org.springframework.boot.SpringApplication;

// Annotation indicating that this class is a Spring Boot application
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Main class for the Book Management System application
@SpringBootApplication
public class BookManagementSystemApplication {

	// The main method that starts the Spring Boot application
	public static void main(String[] args) {
		// Run the Spring Boot application using the specified class and command-line arguments
		SpringApplication.run(BookManagementSystemApplication.class, args);
	}
}
