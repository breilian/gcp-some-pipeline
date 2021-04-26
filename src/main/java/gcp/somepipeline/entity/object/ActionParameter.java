package gcp.somepipeline.entity.object;

import com.fasterxml.jackson.annotation.JsonBackReference;
import gcp.somepipeline.entity.BaseNamedEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class ActionParameter /*extends BaseNamedEntity*/ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    Boolean isOptional;

    @ManyToOne
    @JoinColumn(name = "objectActionId")
    @JsonBackReference
    ObjectAction objectAction;

    @OneToOne
    @JoinColumn(name = "parameterTypeId")
    ParameterType parameterType;

    @OneToOne
    @JoinColumn(name = "parameterFormId")
    ParameterForm parameterForm;

//    public ActionParameter(Long id) {
//        super(id);
//    }

    @Builder
    public ActionParameter(String name, Boolean isOptional, Long objectActionId, Long parameterTypeId, Long parameterFormId) {
//        super(name);
        this.name = name;


        this.isOptional = isOptional;

//        if (Objects.nonNull(objectActionId)) {
//            this.objectAction = new ObjectAction(objectActionId);
//        }

//        if (Objects.nonNull(parameterTypeId)) {
//            this.parameterType = new ParameterType(parameterTypeId);
//        }
//
//        if (Objects.nonNull(parameterFormId)) {
//            this.parameterForm = new ParameterForm(parameterFormId);
//        }
    }

    @Override
    public String toString() {
        return "ActionParameter " + super.toString();
    }
}
