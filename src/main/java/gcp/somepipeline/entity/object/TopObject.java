package gcp.somepipeline.entity.object;

import gcp.somepipeline.entity.BaseNamedEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class TopObject extends BaseNamedEntity {

    @OneToOne
    @JoinColumn(name = "parentObjectId")
    TopObject parentObject;

    @OneToMany(mappedBy = "topObject", orphanRemoval = true)
    List<ObjectAction> actions;

    Boolean requiresValue;

    public TopObject(Long id) {
        super(id);
    }

    public TopObject(String name) {
        super(name);
    }

    public TopObject(String name, Long parentObjectId) {
        super(name);

        if (Objects.nonNull(parentObjectId)) {
            this.parentObject = new TopObject(parentObjectId);
        }
    }

    @Override
    public String toString() {
        return "TopObject " + super.toString();
    }

}
