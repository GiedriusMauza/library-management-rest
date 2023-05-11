package lt.viko.eif.gmauza.librarymanagementrest;

public class LibraryNotFoundException extends RuntimeException {
    LibraryNotFoundException(Long id) {
        super("Could not find library " + id);
    }
}
