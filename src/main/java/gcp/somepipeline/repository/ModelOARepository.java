package gcp.somepipeline.repository;

import gcp.somepipeline.entity.ObjectAction;
import org.springframework.data.repository.CrudRepository;

public interface ModelOARepository extends CrudRepository<ObjectAction, Long> {
}
