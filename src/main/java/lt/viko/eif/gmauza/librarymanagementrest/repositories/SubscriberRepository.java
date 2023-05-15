package lt.viko.eif.gmauza.librarymanagementrest.repositories;

import lt.viko.eif.gmauza.librarymanagementrest.models.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for accessing Subscriber in the database.
 * Extends JpaRepository with Subscriber as entity and Long as primary key type.
 */
@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {


}

