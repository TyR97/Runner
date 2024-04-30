package gde.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {

    @Autowired
    private RaceRepository raceRepository;

    @Autowired
    private RunnerRepository runnerRepository;

    @Autowired
    private ResultRepository resultRepository;

    public ResultEntity addResult(ResultEntity resultEntity){
        RunnerEntity runner = runnerRepository.findById(resultEntity.getRunnerEntity().getRunnerId()).orElse(null);
        RaceEntity race = raceRepository.findById(resultEntity.getRaceEntity().getRaceId()).orElse(null);

        if(runner != null && race != null){
            resultEntity.setRunnerEntity(runner);
            resultEntity.setRaceEntity(race);
            return resultRepository.save(resultEntity);
        } else{
            return  null;
        }
    }
}
