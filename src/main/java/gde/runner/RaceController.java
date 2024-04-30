package gde.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RaceController {

    @Autowired
    private RaceRepository raceRepository;

    @GetMapping("/races")
    public String getAllRaces(Model model){
        List<RaceEntity> raceEntities = raceRepository.findAll();
        model.addAttribute("races", raceEntities);
        return "races";
    }

}
