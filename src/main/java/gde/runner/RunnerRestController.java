package gde.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/runners")
public class RunnerRestController {
    @Autowired
    private RunnerService runnerService;

    @GetMapping
    public List<RunnerEntity> getAllRunners(){return runnerService.getAllRunners();}

    @PostMapping
    public RunnerEntity addRunner(@RequestBody RunnerEntity runnerEntity){return runnerService.addRunner(runnerEntity);}
}
