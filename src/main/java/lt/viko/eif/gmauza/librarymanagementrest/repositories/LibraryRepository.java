package lt.viko.eif.gmauza.librarymanagementrest.repositories;

import lt.viko.eif.gmauza.librarymanagementrest.models.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for accessing libraries in the database.
 * Extends JpaRepository with Library as entity and Long as primary key type.
 */
@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {


}
