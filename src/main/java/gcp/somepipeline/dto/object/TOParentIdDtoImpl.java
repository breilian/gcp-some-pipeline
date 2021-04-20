package gcp.somepipeline.dto.object;

import gcp.somepipeline.dto.IdNameDtoImpl;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TOParentIdDtoImpl extends IdNameDtoImpl implements TOParentIdDto {

    Long parentId;
    Boolean requiresValue;
}
