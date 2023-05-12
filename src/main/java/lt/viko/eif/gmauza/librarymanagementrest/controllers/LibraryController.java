package lt.viko.eif.gmauza.librarymanagementrest.controllers;

import java.util.List;

import lt.viko.eif.gmauza.librarymanagementrest.LibraryNotFoundException;
import lt.viko.eif.gmauza.librarymanagementrest.models.Library;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    private final LibraryRepository repository;

    LibraryController(LibraryRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/libraries")
    List<Library> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/libraries")
    Library newLibrary(@RequestBody Library newLibrary) {
        return repository.save(newLibrary);
    }

    // Single item

    @GetMapping("/libraries/{id}")
    Library one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new LibraryNotFoundException(id));
    }

    @PutMapping("/libraries/{id}")
    Library replaceLibrary(@RequestBody Library newLibrary, @PathVariable Long id) {

        return repository.findById(id)
                .map(Library -> {
                    Library.setLibraryName(newLibrary.getLibraryName());
                    Library.setLibraryAddress(newLibrary.getLibraryAddress());
                    Library.setWorkHours(newLibrary.getWorkHours());
                    return repository.save(Library);
                })
                .orElseGet(() -> {
                    newLibrary.setid(id);
                    return repository.save(newLibrary);
                });
    }

    @DeleteMapping("/libraries/{id}")
    void deleteLibrary(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
