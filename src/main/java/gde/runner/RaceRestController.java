package gde.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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

    @GetMapping("{id}/runners")
    public List<ResultEntity> getRaceRunners(@PathVariable Long id){
        return raceService.getRaceRunners(id);
    }

    @GetMapping("/getAverageTime/{id}")
    public double getAverageTime(@PathVariable Long id){
        double averageTime = raceService.getAverageTime(id);
        return averageTime;
    }
}
