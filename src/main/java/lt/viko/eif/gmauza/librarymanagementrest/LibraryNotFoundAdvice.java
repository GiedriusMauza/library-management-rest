package lt.viko.eif.gmauza.librarymanagementrest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Controller advice to handle LibraryNotFoundException and return a custom error response with HTTP status code 404.
 */
@ControllerAdvice
public class LibraryNotFoundAdvice {

    /**
     * Exception handler method to handle LibraryNotFoundException and return a custom error response.
     *
     * @param ex the LibraryNotFoundException object that was thrown
     * @return a String representing the error message to be included in the HTTP response body
     */
    @ResponseBody
    @ExceptionHandler(LibraryNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(LibraryNotFoundException ex) {
        return ex.getMessage();
    }
}
