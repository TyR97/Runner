package gde.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunnerService {
    @Autowired
    private RunnerRepository runnerRepository;

    public List<RunnerEntity> getAllRunners(){return runnerRepository.findAll();}

    public RunnerEntity addRunner(RunnerEntity runnerEntity) {return runnerRepository.save(runnerEntity);}
}
