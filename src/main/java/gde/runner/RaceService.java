package gde.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RaceService {
    @Autowired
    private RaceRepository raceRepository;

    public RaceEntity addRace(RaceEntity raceEntity){return raceRepository.save(raceEntity);}
}
