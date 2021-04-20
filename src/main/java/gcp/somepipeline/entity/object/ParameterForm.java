package gcp.somepipeline.entity.object;

import gcp.somepipeline.entity.BaseNamedEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class ParameterForm extends BaseNamedEntity {

    public ParameterForm(Long id) {
        super(id);
    }

    public ParameterForm(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "ParameterForm " + super.toString();
    }
}
