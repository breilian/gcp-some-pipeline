package gcp.somepipeline.entity.object;

import com.fasterxml.jackson.annotation.JsonBackReference;
import gcp.somepipeline.entity.BaseNamedEntity;
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
public class ObjectAction /*extends BaseNamedEntity*/ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name = "topObjectId")
    @JsonBackReference
    TopObject topObject;

    @OneToMany(mappedBy = "objectAction", orphanRemoval=true)
    List<ActionParameter> parameters;

//    public ObjectAction(Long id) {
//        super(id);
//    }
//
//    public ObjectAction(String name, Long topObjectId) {
//        super(name);
//
//        if ( Objects.nonNull(topObjectId)) {
//            this.topObject = new TopObject(topObjectId);
//        }
//    }

    @Override
    public String toString() {
        return "ObjectAction " + super.toString();
    }
}
