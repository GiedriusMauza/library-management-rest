package lt.viko.eif.gmauza.librarymanagementrest.repositories;

import lt.viko.eif.gmauza.librarymanagementrest.models.Borrowings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for accessing Borrowings in the database.
 * Extends JpaRepository with Borrowings as entity and Long as primary key type.
 */

@Repository
public interface BorrowingsRepository extends JpaRepository<Borrowings, Long> {
}
