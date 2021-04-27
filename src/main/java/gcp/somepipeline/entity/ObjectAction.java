package gcp.somepipeline.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class ObjectAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @ManyToOne
    @JoinColumn(name = "topObjectId")
    @JsonBackReference
    TopObject topObject;

    @OneToMany(mappedBy = "objectAction", orphanRemoval=true)
    List<ActionParameter> parameters;

    @Override
    public String toString() {
        return "ObjectAction " + super.toString();
    }
}
