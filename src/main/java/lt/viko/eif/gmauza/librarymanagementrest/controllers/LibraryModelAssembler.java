package lt.viko.eif.gmauza.librarymanagementrest.controllers;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import lt.viko.eif.gmauza.librarymanagementrest.models.Library;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

@Component
class LibraryModelAssembler implements RepresentationModelAssembler<Library, EntityModel<Library>> {

    @Override
    public EntityModel<Library> toModel(Library library) {

        return EntityModel.of(library, //
                WebMvcLinkBuilder.linkTo(methodOn(LibraryController.class).one(library.getId())).withSelfRel(),
                linkTo(methodOn(LibraryController.class).all()).withRel("libraries"));
    }
}
