package gcp.somepipeline.repository;

import gcp.somepipeline.entity.TopObject;
import org.springframework.data.repository.CrudRepository;

public interface ModelTORepository extends CrudRepository<TopObject, Long> {
}
