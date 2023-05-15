package lt.viko.eif.gmauza.librarymanagementrest;

/**
 * Exception thrown when a library with the given ID cannot be found.
 */

public class LibraryNotFoundException extends RuntimeException {

    /**
     * Constructs a {@code LibraryNotFoundException} with the specified library ID.
     *
     * @param id the ID of the library that could not be found
     */
    public LibraryNotFoundException(Long id) {
        super("Could not find library " + id);
    }
}
