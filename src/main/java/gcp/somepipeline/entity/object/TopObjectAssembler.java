package gcp.somepipeline.entity.object;

import gcp.somepipeline.controller.ModelController2;
import gcp.somepipeline.dto.object.TOParentIdDto;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TopObjectAssembler implements RepresentationModelAssembler<TOParentIdDto, EntityModel<TOParentIdDto>> {

    @Override
    public EntityModel<TOParentIdDto> toModel(TOParentIdDto topObject) {
        return null;
//        return new EntityModel<>(topObject,
//                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(ModelController2.class).getObject(topObject.getId())).withSelfRel(),
//                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(ModelController2.class).allObjects()).withRel("objects"));
    }

    public CollectionModel<EntityModel<TOParentIdDto>> toModel(List<TOParentIdDto> topObjects) {
        List<EntityModel<TOParentIdDto>> objects = topObjects.stream()
                .map(this::toModel)
                .collect(Collectors.toList());

        return null;
//        return new CollectionModel<>(objects, WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(ModelController2.class).allObjects()).withSelfRel());
    }
}
