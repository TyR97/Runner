package gde.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/races")
public class RaceRestController {
    @Autowired
    private RaceService raceService;

    @PostMapping("{id}/update")
    public RaceEntity updateRace(@PathVariable Long id, @RequestBody RaceEntity updatedRaceEntity){
        RaceEntity raceEntity = raceService.updateRace(id, updatedRaceEntity);

        if(raceEntity != null){
            return raceEntity;
        } else{
            return null;
        }
    }
}
