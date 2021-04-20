package gcp.somepipeline.dto.object;

import gcp.somepipeline.dto.IdNameDto;
import org.springframework.beans.factory.annotation.Value;

public interface TOParentIdDto extends IdNameDto {

    @Value("#{target.parentObject?.id}")
    Long getParentId();
    Boolean getRequiresValue();
}