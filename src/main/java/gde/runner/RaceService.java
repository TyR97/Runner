package gde.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceService {
    @Autowired
    private RaceRepository raceRepository;
    @Autowired
    private ResultRepository resultRepository;

    public RaceEntity addRace(RaceEntity raceEntity){return raceRepository.save(raceEntity);}

    public RaceEntity getRaceById(Long id){
        RaceEntity raceEntity = raceRepository.findById(id).orElse(null);
        return raceEntity;
    }

    public List<ResultEntity> getResultsByRaceId(Long raceId){
        return resultRepository.findResultEntitiesByRaceEntityRaceId(raceId);
    }
}
