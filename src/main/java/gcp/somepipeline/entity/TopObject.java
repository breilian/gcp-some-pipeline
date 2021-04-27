package gcp.somepipeline.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class TopObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @OneToOne
    @JoinColumn(name = "parentObjectId")
    TopObject parentObject;

    @OneToMany(mappedBy = "topObject", orphanRemoval = true)
    List<ObjectAction> actions;

    Boolean requiresValue;

    public TopObject(Long id) {
        this.id = id;
    }

    public TopObject(String name) {
        this.name = name;
    }

    public TopObject(String name, Long parentObjectId) {
        this.name = name;

        if (Objects.nonNull(parentObjectId)) {
            this.parentObject = new TopObject(parentObjectId);
        }
    }

    @Override
    public String toString() {
        return "TopObject " + super.toString();
    }

}
