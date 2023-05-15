package lt.viko.eif.gmauza.librarymanagementrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**

 The LibraryManagementRestApplication class is the entry point of the whole application.
 The @SpringBootApplication annotation combines three other annotations:
 Spring's @Configuration, @ComponentScan, and @EnableAutoConfiguration.
 The @EntityScan annotation declares the base packages to scan for Entity classes.
 The @ComponentScan annotation declares the base packages to scan for annotated Spring components.
 It mainly scans for @Controller, @Service, and @Repository annotations. */

@SpringBootApplication
@EntityScan(basePackages = {
        "lt.viko.eif.gmauza.librarymanagementrest.models"})
@ComponentScan(basePackages = {
        "lt.viko.eif.gmauza.librarymanagementrest.controllers",
        "lt.viko.eif.gmauza.librarymanagementrest.repositories",
        "lt.viko.eif.gmauza.librarymanagementrest.data"})
public class LibraryManagementRestApplication {

    /**
     * The main method is the entry point of the application.
     * It starts the Spring Boot application.
     */
    public static void main(String... args) {
        SpringApplication.run(LibraryManagementRestApplication.class, args);
    }
}
