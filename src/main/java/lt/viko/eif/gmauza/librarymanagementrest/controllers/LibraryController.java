package lt.viko.eif.gmauza.librarymanagementrest.controllers;

import java.util.List;
import java.util.stream.Collectors;

import lt.viko.eif.gmauza.librarymanagementrest.LibraryNotFoundException;
import lt.viko.eif.gmauza.librarymanagementrest.models.Librarian;
import lt.viko.eif.gmauza.librarymanagementrest.models.Library;
import lt.viko.eif.gmauza.librarymanagementrest.repositories.LibraryRepository;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


/**
 * The type Library controller.
 */
@RestController
public class LibraryController {

    private final LibraryRepository repository;
    private final LibraryModelAssembler assembler;

    /**
     * Instantiates a new Library controller.
     *
     * @param repository the repository
     * @param assembler  the assembler
     */
    LibraryController(LibraryRepository repository, LibraryModelAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    /**
     * All collection model.
     *
     * @return the collection model
     */
    @GetMapping("/libraries")
    CollectionModel<EntityModel<Library>> all() {

        List<EntityModel<Library>> libraries = repository.findAll().stream()
                .map(assembler::toModel) //
                .collect(Collectors.toList());

        return CollectionModel.of(libraries, linkTo(methodOn(LibraryController.class).all()).withSelfRel());
    }

    /**
     * New library response entity.
     *
     * @param newLibrary the new library
     * @return the response entity
     */
    @PostMapping("/libraries")
    ResponseEntity<?> newLibrary(@RequestBody Library newLibrary) {
        EntityModel<Library> entityModel = assembler.toModel(repository.save(newLibrary));

        return ResponseEntity //
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
                .body(entityModel);
    }

    // Single item

    /**
     * One entity model.
     *
     * @param id the id
     * @return the entity model
     */
    @GetMapping("/libraries/{id}")
    EntityModel<Library> one(@PathVariable Long id) {

        Library library = repository.findById(id) //
                .orElseThrow(() -> new LibraryNotFoundException(id));

        return assembler.toModel(library);

    }

    /**
     * Find librarian response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @GetMapping("/libraries/{id}/librarian")
    public ResponseEntity<EntityModel<?>> findLibrarian(@PathVariable Long id) {
        Library library = repository.findById(id)
                .orElseThrow(() -> new LibraryNotFoundException(id));

        Librarian librarian = library.getLibrarian();

        EntityModel<Librarian> librarianModel = EntityModel.of(librarian);

        // Add self link to librarianModel
        Link selfLink = linkTo(methodOn(getClass()).findLibrarian(id)).withSelfRel();
        librarianModel.add(selfLink);

        return ResponseEntity.ok(librarianModel);
    }

    /**
     * Replace library response entity.
     *
     * @param newLibrary the new library
     * @param id         the id
     * @return the response entity
     */
    @PutMapping("/libraries/{id}")
    ResponseEntity<?> replaceLibrary(@RequestBody Library newLibrary, @PathVariable Long id) {

        Library updatedLibrary = repository.findById(id) //
                .map(library -> {
                    library.setLibraryName(newLibrary.getLibraryName());
                    library.setLibraryAddress(newLibrary.getLibraryAddress());
                    library.setWorkHours(newLibrary.getWorkHours());
                    return repository.save(library);
                }) //
                .orElseGet(() -> {
                    newLibrary.setId(id);
                    return repository.save(newLibrary);
                });

        EntityModel<Library> entityModel = assembler.toModel(updatedLibrary);

        return ResponseEntity //
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
                .body(entityModel);
    }

    /**
     * Delete library response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @DeleteMapping("/libraries/{id}")
    ResponseEntity<?> deleteLibrary(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
