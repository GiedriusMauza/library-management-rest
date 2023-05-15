package lt.viko.eif.gmauza.librarymanagementrest.controllers;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import lt.viko.eif.gmauza.librarymanagementrest.models.Library;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

/**
 * This class is responsible for converting a Library object to an EntityModel representation model.
 */

@Component
class LibraryModelAssembler implements RepresentationModelAssembler<Library, EntityModel<Library>> {

    /**
     * Converts a Library object into an EntityModel<Library> object containing links.
     *
     * @param library the Library object to be converted.
     * @return the EntityModel<Library> object representing the input Library object with links.
     */
    @Override
    public EntityModel<Library> toModel(Library library) {

        return EntityModel.of(library, //
                WebMvcLinkBuilder.linkTo(methodOn(LibraryController.class).one(library.getId())).withSelfRel(),
                linkTo(methodOn(LibraryController.class).all()).withRel("libraries"));
    }

}
