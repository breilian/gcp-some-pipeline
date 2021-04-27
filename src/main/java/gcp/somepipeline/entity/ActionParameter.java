package gcp.somepipeline.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class ActionParameter {

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

    @Builder
    public ActionParameter(String name, Boolean isOptional) {
        this.name = name;
        this.isOptional = isOptional;
    }

    @Override
    public String toString() {
        return "ActionParameter " + super.toString();
    }
}
