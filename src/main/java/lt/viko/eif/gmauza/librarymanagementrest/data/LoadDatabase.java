package lt.viko.eif.gmauza.librarymanagementrest.data;

import lt.viko.eif.gmauza.librarymanagementrest.models.*;
import lt.viko.eif.gmauza.librarymanagementrest.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);



    @Bean
    CommandLineRunner initDatabase(LibraryRepository repository,
                                   LibrarianRepository librarianRepository,
                                   SubscribersRepository subscribersRepository,
                                   SubscriberRepository subscriberRepository,
                                   BorrowingsRepository borrowingsRepository,
                                   BorrowingRepository borrowingRepository,
                                   ItemRepository itemRepository) {

        Item item = new Item(
                "Jonas",
                "3",
                "1992",
                "Eridanas",
                "true",
                "Jonas Ponas");
        itemRepository.save(item);

        Item item2 = new Item(
                "Antanas",
                "3",
                "1999",
                "Eridanas",
                "true",
                "Antano pasaka");
        itemRepository.save(item2);

        Borrowing borrowing = new Borrowing(
                "2022-12-12",
                "2023-12-17",
                item);
        borrowingRepository.save(borrowing);

        Borrowing borrowing2 = new Borrowing(
                "2022-10-01",
                "2023-04-18",
                item2);
        borrowingRepository.save(borrowing2);

        Borrowings borrowings = new Borrowings();
        borrowings.getBorrowing().add(borrowing);
        borrowings.getBorrowing().add(borrowing2);
        borrowingsRepository.save(borrowings);

        Subscriber subscriber = new Subscriber(
                "Jonas",
                "Jonaitis",
                "Kalno g. 8",
                "test@test.ff",
                "+3706654654", borrowings);
        subscriberRepository.save(subscriber);

        Subscribers subscribers = new Subscribers();
        subscribers.getSubscriber().add(subscriber);
        subscribersRepository.save(subscribers);

        Librarian librarian = new Librarian(
                "jonas123@mail.ff",
                "Jonas",
                "Jonaitis",
                "+3706654654");
        librarianRepository.save(librarian);

        Library library = new Library(
                "Centrinė",
                "Kalno g. 6",
                "8-14",
                librarian,
                subscribers);


        return args -> {
            log.info("Preloading " + repository.save(library));
        };
    }
}
