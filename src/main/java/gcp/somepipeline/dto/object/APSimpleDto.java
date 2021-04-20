package gcp.somepipeline.dto.object;

import gcp.somepipeline.dto.IdNameDto;
import org.springframework.beans.factory.annotation.Value;

public interface APSimpleDto extends IdNameDto {

    @Value("#{target.objectAction.id}")
    Long getObjectActionId();
    Boolean getIsOptional();
    @Value("#{target.parameterType.id}")
    Long getParameterTypeId();
    @Value("#{target.parameterForm.id}")
    Long getParameterFormId();
}
