package lt.viko.eif.gmauza.librarymanagementrest.repositories;

import lt.viko.eif.gmauza.librarymanagementrest.models.Borrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for accessing Borrowing in the database.
 * Extends JpaRepository with Borrowing as entity and Long as primary key type.
 */
@Repository
public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {

}
