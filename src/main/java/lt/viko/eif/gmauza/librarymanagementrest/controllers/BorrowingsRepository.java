package lt.viko.eif.gmauza.librarymanagementrest.controllers;

import lt.viko.eif.gmauza.librarymanagementrest.models.Borrowings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowingsRepository extends JpaRepository<Borrowings, Long> {
}
