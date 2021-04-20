package gcp.somepipeline.repository;

import gcp.somepipeline.entity.object.TopObject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModelTORepository extends JpaRepository<TopObject, Long> {

    <T> List<T> findAllProjectedBy(Class<T> projectionClass);
}
