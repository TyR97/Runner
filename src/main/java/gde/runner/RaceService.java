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

    public RaceEntity updateRace(Long id, RaceEntity updatedRaceEntity){
        RaceEntity raceEntity = raceRepository.findById(id).orElse(null);

        if(raceEntity != null){
            raceEntity.setRaceName(updatedRaceEntity.getRaceName());
            raceEntity.setRaceLength(updatedRaceEntity.getRaceLength());
            return raceRepository.save(raceEntity);
        } else{
            return null;
        }
    }

    public double getAverageTime(Long raceId){
        List<ResultEntity> resultEntities = resultRepository.findResultEntitiesByRaceEntityRaceId(raceId);

        if(resultEntities.isEmpty()){
            return 0.0;
        } else{
            int total = 0;
            for(ResultEntity result: resultEntities){
                total += result.getResultTime();
            }
            return (double) total/resultEntities.size();
        }

    }

}
