package lt.viko.eif.gmauza.librarymanagementrest.controllers;

import lt.viko.eif.gmauza.librarymanagementrest.models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    /**
     * Initializes the database with sample data upon application startup.
     *
     * @param repository the repository for accessing the library data
     * @return a CommandLineRunner for executing initialization code
     */
    @Bean
    CommandLineRunner initDatabase(LibraryRepository repository) {

        Item  item = new Item("Jonas", "3", "1992", "Eridanas", "true", "Jonas Ponas");

        Borrowing  borrowing = new Borrowing("2022-12-12", "2023-12-17", item);

        Borrowings borrowings = new Borrowings();
        borrowings.getBorrowing().add(borrowing);

        Subscriber subscriber = new Subscriber("Jonas","Jonaitis","Kalno g. 8", "test@test.ff", "+3706654654", borrowings);

        Subscribers subscribers = new Subscribers();
        subscribers.getSubscriber().add(subscriber);

        Librarian librarian = new Librarian("jonas123@mail.ff", "Jonas", "Jonaitis", "+3706654654");

        Library library = new Library("Centrinė", "Kalno g. 6", "8-14", librarian, subscribers);


        return args -> {
            log.info("Preloading " + repository.save(new Library("Rajono", "Paklanės g. 8", "7-18")));
            log.info("Preloading " + repository.save(new Library("Rajono", "Paklanės g. 8", "7-18")));
            log.info("Preloading " + repository.save(new Library("Kauno", "Kauno g. 1", "7-18")));
            log.info("Preloading " + repository.save(new Library("Vilniaus", "Vilniaus g. 1", "7-18")));
            log.info("Preloading " + repository.save(new Library("Klaipėda", "Klaipėda g. 1", "7-18")));
        };
    }
}
