package lt.viko.eif.gmauza.librarymanagementrest;

import lt.viko.eif.gmauza.librarymanagementrest.models.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface LibraryRepository extends JpaRepository<Library, Long> {

}
