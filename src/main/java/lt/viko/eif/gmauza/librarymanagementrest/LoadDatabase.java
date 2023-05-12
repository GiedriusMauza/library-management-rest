package lt.viko.eif.gmauza.librarymanagementrest;

import lt.viko.eif.gmauza.librarymanagementrest.models.Library;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    /**
     * Loads data into the database.
     *
     * @param repository
     * @return
     */
    @Bean
    CommandLineRunner initDatabase(LibraryRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Library("Centrinė", "Kalno g. 6", "8-14")));
            log.info("Preloading " + repository.save(new Library("Rajono", "Paklanės g. 8", "7-18")));
            log.info("Preloading " + repository.save(new Library("Kauno", "Kauno g. 1", "7-18")));
            log.info("Preloading " + repository.save(new Library("Vilniaus", "Vilniaus g. 1", "7-18")));
            log.info("Preloading " + repository.save(new Library("Klaipėda", "Klaipėda g. 1", "7-18")));
        };
    }
}
