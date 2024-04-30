package gde.runner;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ResultRepository extends JpaRepository<ResultEntity, Long> {

    List<ResultEntity> findResultEntitiesByRaceEntityRaceId(Long raceId);
}
