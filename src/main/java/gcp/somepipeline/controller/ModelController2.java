package gcp.somepipeline.controller;

import gcp.somepipeline.dto.IdNameDto;
import gcp.somepipeline.dto.object.*;
import gcp.somepipeline.entity.object.TopObjectAssembler;
import gcp.somepipeline.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

//@RestController
public class ModelController2 {

//    @Autowired
//    private ModelService modelService;
//
//    @Autowired
//    private TopObjectAssembler objectAssembler;
//
//    @CrossOrigin
//    @GetMapping(value = "objects/{topObjectId}")
//    public EntityModel<TOParentIdDto> getObject(@PathVariable Long topObjectId) {
//        return objectAssembler.toModel(modelService.getObject(topObjectId));
//    }
//
//    @CrossOrigin
//    @GetMapping(value = "objects")
//    public CollectionModel<EntityModel<TOParentIdDto>> allObjects() {
//        return objectAssembler.toModel(modelService.fetchAllTo());
//    }
//
//    @CrossOrigin
//    @PostMapping(value = "objects")
//    public ResponseEntity<?> addObject(@RequestBody TOParentIdDtoImpl topObject) {
//        EntityModel<TOParentIdDto> objectModel = objectAssembler.toModel(modelService.addNewTo(topObject));
//
//        return ResponseEntity
//                .created(objectModel.getRequiredLink(IanaLinkRelations.SELF).toUri())
//                .body(objectModel);
//    }
//
//    @CrossOrigin
//    @GetMapping(value = "actions/{topObjectId}")
//    public List<IdNameDto> allActions(@PathVariable Long topObjectId) {
//        return modelService.fetchActionsOfTo(topObjectId, IdNameDto.class);
//    }
//
//    @CrossOrigin
//    @PostMapping(value = "actions/{topObjectId}")
//    public void addAction(@RequestBody OAObjectIdDtoImpl objectAction) {
//        modelService.addNewActionInTo(objectAction);
//    }
//
//    @CrossOrigin
//    @GetMapping(value = "parameters/{objectActionId}")
//    public List<APSimpleDto> allParameters(@PathVariable Long objectActionId) {
//        return modelService.fetchParametersOfOa(objectActionId);
//    }
//
//    @CrossOrigin
//    @PostMapping(value = "parameters")
//    public void addParameter(@RequestBody APSimpleDtoImpl actionParameter) {
//        modelService.addNewParameterInOa(actionParameter);
//    }
//
//    @CrossOrigin
//    @DeleteMapping(value = "parameters/{actionParameterId}")
//    public void deleteParameter(@PathVariable Long actionParameterId) {
//        modelService.deleteParameter(actionParameterId);
//    }

}
