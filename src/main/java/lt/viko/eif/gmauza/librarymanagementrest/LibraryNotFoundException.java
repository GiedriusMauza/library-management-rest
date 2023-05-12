package lt.viko.eif.gmauza.librarymanagementrest;


public class LibraryNotFoundException extends RuntimeException {
    public LibraryNotFoundException(Long id) {
        super("Could not find library " + id);
    }
}
