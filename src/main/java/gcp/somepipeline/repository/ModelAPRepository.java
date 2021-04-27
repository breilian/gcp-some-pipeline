package gcp.somepipeline.repository;

import gcp.somepipeline.entity.ActionParameter;
import org.springframework.data.repository.CrudRepository;

public interface ModelAPRepository extends CrudRepository<ActionParameter, Long> {
}
