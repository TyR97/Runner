package gde.runner;

import jakarta.persistence.*;

@Entity
@Table(name = "results")
public class ResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "resultId", nullable = false)
    private Long resultId;

    @Column(name = "resultTime", nullable = false)
    private double resultTime;


    @ManyToOne
    @JoinColumn(name = "runnerId", nullable = false)
    RunnerEntity runnerEntity;


    @ManyToOne
    @JoinColumn(name = "raceId", nullable = false)
    RaceEntity raceEntity;

    public ResultEntity(){}

    public ResultEntity(double time, RunnerEntity runner, RaceEntity race){
        this.resultTime = time;
        this.runnerEntity = runner;
        this.raceEntity = race;
    }

    /*Getters, Setters*/

    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    public Long getResultId() {
        return resultId;
    }

    public void setResultTime(double resultTime) {
        this.resultTime = resultTime;
    }

    public double getResultTime() {
        return resultTime;
    }

    public void setRunnerEntity(RunnerEntity runnerEntity) {
        this.runnerEntity = runnerEntity;
    }

    public RunnerEntity getRunnerEntity() {
        return runnerEntity;
    }

    public void setRaceEntity(RaceEntity raceEntity) {
        this.raceEntity = raceEntity;
    }

    public RaceEntity getRaceEntity() {
        return raceEntity;
    }
}
