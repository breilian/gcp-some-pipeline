package gcp.somepipeline.repository;

import gcp.somepipeline.entity.object.ObjectAction;
import org.springframework.data.repository.CrudRepository;

public interface ModelOARepository extends CrudRepository<ObjectAction, Long> {

//    <T> List<T> findByTopObject(TopObject to, Class<T> projectionClass);
}
