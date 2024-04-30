package gde.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/runners")
public class RunnerRestController {
    @Autowired
    private RunnerService runnerService;

    @GetMapping
    public List<RunnerEntity> getAllRunners(){return runnerService.getAllRunners();}
}
