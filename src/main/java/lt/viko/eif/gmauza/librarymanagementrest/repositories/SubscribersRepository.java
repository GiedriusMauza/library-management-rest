package lt.viko.eif.gmauza.librarymanagementrest.repositories;

import lt.viko.eif.gmauza.librarymanagementrest.models.Subscribers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for accessing Subscribers in the database.
 * Extends JpaRepository with Subscribers as entity and Long as primary key type.
 */
@Repository
public interface SubscribersRepository extends JpaRepository<Subscribers, Long> {


}
