package lt.viko.eif.gmauza.librarymanagementrest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryNotFoundExceptionTest {

    @Test
    public void testConstructor() {
        Long id = 12365465L;
        String expectedMessage = "Could not find library " + id;
        LibraryNotFoundException exception = new LibraryNotFoundException(id);
        assertEquals(expectedMessage, exception.getMessage());
    }
}