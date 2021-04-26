package gcp.somepipeline.service;

import gcp.somepipeline.dto.object.*;
import gcp.somepipeline.entity.object.ActionParameter;
import gcp.somepipeline.entity.object.ObjectAction;
import gcp.somepipeline.entity.object.TopObject;
import gcp.somepipeline.repository.ModelAPRepository;
import gcp.somepipeline.repository.ModelOARepository;
import gcp.somepipeline.repository.ModelTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {

    @Autowired
    private ModelTORepository toRepository;
    @Autowired
    private ModelOARepository oaRepository;
    @Autowired
    private ModelAPRepository apRepository;

//    public TOParentIdDto getObject(Long topObjectId) {
//        return toRepository.findById(topObjectId, TOParentIdDto.class);
//    }
//
//    public List<TOParentIdDto> fetchAllTo() {
//        return toRepository.findAllProjectedBy(TOParentIdDto.class);
//    }
//
//    public TOParentIdDto addNewTo(TOParentIdDtoImpl to) {
//        TopObject newTO = new TopObject(to.getName(), to.getParentId());
//        newTO.setRequiresValue(to.getRequiresValue());
//
//        Long newId = toRepository.save(newTO).getId();
//        to.setId(newId);
//
//        return to;
//    }
//
//    public <T> List<T> fetchActionsOfTo(Long toId, Class<T> actionDto) {
//        return oaRepository.findByTopObject(new TopObject(toId), actionDto);
//    }
//
//    public void addNewActionInTo(OAObjectIdDtoImpl action) {
//        oaRepository.save(new ObjectAction(action.getName(), action.getObjectId()));
//    }
//
//    public List<APSimpleDto> fetchParametersOfOa(Long oaId) {
//        return apRepository.findByObjectAction(new ObjectAction(oaId), APSimpleDto.class);
//    }
//
//    public void addNewParameterInOa(APSimpleDtoImpl ap) {
//        ActionParameter newAp = ActionParameter.builder()
//                .name(ap.getName())
//                .objectActionId(ap.getObjectActionId())
//                .isOptional(ap.getIsOptional())
//                .parameterTypeId(ap.getParameterTypeId())
//                .parameterFormId(ap.getParameterFormId())
//                .build();
//
//        apRepository.save(newAp);
//    }
//
//    public void deleteParameter(Long apId) {
//        apRepository.deleteById(apId);
//    }
}
