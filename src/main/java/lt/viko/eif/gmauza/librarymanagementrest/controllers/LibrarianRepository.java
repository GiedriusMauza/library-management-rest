package lt.viko.eif.gmauza.librarymanagementrest.controllers;

import lt.viko.eif.gmauza.librarymanagementrest.models.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for accessing librarians in the database.
 * Extends JpaRepository with Librarian as entity and Long as primary key type.
 */
@Repository
interface LibrarianRepository extends JpaRepository<Librarian, Long> {


}
