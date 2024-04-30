package gde.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RaceController {

    @Autowired
    private RaceRepository raceRepository;

    @Autowired
    private RaceService raceService;

    @GetMapping("/races")
    public String getAllRaces(Model model){
        List<RaceEntity> raceEntities = raceRepository.findAll();
        model.addAttribute("races", raceEntities);
        return "races";
    }

    @GetMapping("races/create")
    public String showRaceForm(Model model){
        model.addAttribute("race", new RaceEntity());
        return "create";
    }

    @PostMapping("races/create")
    public String createRace(@ModelAttribute("races") RaceEntity raceEntity){
        raceService.addRace(raceEntity);
        return "redirect:/races";
    }

}
