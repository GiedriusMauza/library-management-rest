package lt.viko.eif.gmauza.librarymanagementrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"lt.viko.eif.gmauza.librarymanagementrest.models"})
@ComponentScan(basePackages = {"lt.viko.eif.gmauza.librarymanagementrest.controllers"})
public class LibraryManagementRestApplication {

	public static void main(String... args) {
		SpringApplication.run(LibraryManagementRestApplication.class, args);
	}

}
