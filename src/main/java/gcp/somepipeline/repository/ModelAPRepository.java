package gcp.somepipeline.repository;

import gcp.somepipeline.entity.object.ActionParameter;
import gcp.somepipeline.entity.object.ObjectAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ModelAPRepository extends CrudRepository<ActionParameter, Long> {

//    <T> List<T> findByObjectAction(ObjectAction oa, Class<T> projectionClass);
}
