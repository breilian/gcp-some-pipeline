package gcp.somepipeline.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class IdNameDtoImpl extends IdDtoImpl implements IdNameDto {

    public IdNameDtoImpl(Long id, String name) {
        super(id);
        this.name = name;
    }

    String name;
}
