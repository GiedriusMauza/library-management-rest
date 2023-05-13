package lt.viko.eif.gmauza.librarymanagementrest.controllers;


import lt.viko.eif.gmauza.librarymanagementrest.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
