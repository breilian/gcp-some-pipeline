package gcp.somepipeline.repository;

import gcp.somepipeline.entity.object.TopObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//@RepositoryRestResource()
public interface ModelTORepository extends CrudRepository<TopObject, Long> {

//    <T> T findById(Long id, Class<T> projectionClass);
//    <T> List<T> findAllProjectedBy(Class<T> projectionClass);
}
