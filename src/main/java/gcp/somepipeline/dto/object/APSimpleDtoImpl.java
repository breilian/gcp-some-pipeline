package gcp.somepipeline.dto.object;

import gcp.somepipeline.dto.IdNameDtoImpl;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class APSimpleDtoImpl extends IdNameDtoImpl implements APSimpleDto {

    Long objectActionId;
    Boolean isOptional;
    Long parameterTypeId;
    Long parameterFormId;
}
