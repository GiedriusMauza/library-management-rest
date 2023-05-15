package lt.viko.eif.gmauza.librarymanagementrest.repositories;


import lt.viko.eif.gmauza.librarymanagementrest.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for accessing Item in the database.
 * Extends JpaRepository with Item as entity and Long as primary key type.
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
