package gcp.somepipeline.repository;

import gcp.somepipeline.entity.object.ObjectAction;
import gcp.somepipeline.entity.object.TopObject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModelOARepository extends JpaRepository<ObjectAction, Long> {

    <T> List<T> findByTopObject(TopObject to, Class<T> projectionClass);
}
