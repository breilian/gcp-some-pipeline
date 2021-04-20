package gcp.somepipeline.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@MappedSuperclass
public class BaseNamedEntity extends BaseEntity {

    String name;

    public BaseNamedEntity(Long id) {
        super(id);
    }

    public BaseNamedEntity(Long id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + ", name='" + name + "'";
    }
}
