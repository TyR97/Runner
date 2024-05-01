package gde.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{
    private final RunnerRepository runnerRepository;
    private final RaceRepository raceRepository;
    private final ResultRepository resultRepository;

    @Autowired
    public DataLoader(RunnerRepository runnerRepository, RaceRepository raceRepository, ResultRepository resultRepository){
        this.runnerRepository = runnerRepository;
        this.raceRepository = raceRepository;
        this.resultRepository = resultRepository;
    }

    @Override
    public void run(String... args){
        RunnerEntity runner1 = new RunnerEntity("Forest Gump", 38, "Male");
        RunnerEntity runner2 = new RunnerEntity("Pheidippidész", 20, "Male");
        RunnerEntity runner3 = new RunnerEntity("Kathrine Switzer",77,"Female");
        RunnerEntity runner4 = new RunnerEntity("Deena Kastor ",51,"Female");

        RaceEntity race1 = new RaceEntity("Why are you running?", 42.195);
        RaceEntity race2 = new RaceEntity("Age Of Da Feet", 90.0);

        ResultEntity result1 = new ResultEntity(300.0, runner1, race1);
        ResultEntity result2 = new ResultEntity(90.0, runner2, race1);
        ResultEntity result3 = new ResultEntity(120.0, runner3, race1);
        ResultEntity result4 = new ResultEntity(105.0, runner4, race1);
        ResultEntity result5 = new ResultEntity(210.0, runner2, race2);
        ResultEntity result6 = new ResultEntity(123.4, runner3, race2);

        runnerRepository.save(runner1);
        runnerRepository.save(runner2);
        runnerRepository.save(runner3);
        runnerRepository.save(runner4);
        raceRepository.save(race1);
        raceRepository.save(race2);
        resultRepository.save(result1);
        resultRepository.save(result2);
        resultRepository.save(result3);
        resultRepository.save(result4);
        resultRepository.save(result5);
        resultRepository.save(result6);
    }
}