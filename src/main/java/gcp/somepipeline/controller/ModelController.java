package gcp.somepipeline.controller;

import gcp.somepipeline.dto.IdNameDto;
import gcp.somepipeline.dto.object.*;
import gcp.somepipeline.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v5")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @CrossOrigin
    @GetMapping(value = "objects")
    public List<TOParentIdDto> list() {
        return modelService.fetchAllTo();
    }

    @CrossOrigin
    @PostMapping(value = "object")
    public void add(@RequestBody TOParentIdDtoImpl topObject) {
        modelService.addNewTo(topObject);
    }

    @CrossOrigin
    @GetMapping(value = "actions/{topObjectId}")
    public List<IdNameDto> listActions(@PathVariable Long topObjectId) {
        return modelService.fetchActionsOfTo(topObjectId, IdNameDto.class);
    }

    @CrossOrigin
    @PostMapping(value = "action")
    public void addAction(@RequestBody OAObjectIdDtoImpl objectAction) {
        modelService.addNewActionInTo(objectAction);
    }

    @CrossOrigin
    @GetMapping(value = "parameters/{objectActionId}")
    public List<APSimpleDto> listParameters(@PathVariable Long objectActionId) {
        return modelService.fetchParametersOfOa(objectActionId);
    }

    @CrossOrigin
    @PostMapping(value = "parameter")
    public void addParameter(@RequestBody APSimpleDtoImpl actionParameter) {
        modelService.addNewParameterInOa(actionParameter);
    }

    @CrossOrigin
    @DeleteMapping(value = "parameter/{actionParameterId}")
    public void deleteParameter(@PathVariable Long actionParameterId) {
        modelService.deleteParameter(actionParameterId);
    }

}
