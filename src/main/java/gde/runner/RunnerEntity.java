package gde.runner;

import jakarta.persistence.*;
@Entity
@Table(name = "runners")
public class RunnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "runner_id", nullable = false)
    private Long runnerId;

    @Column(name = "runnerName" ,nullable = false)
    private String runnerName;

    @Column(name = "runnerAge", nullable = false)
    private int runnerAge;

    @Column(name = "runnerGender", nullable = false)
    private String runnerGender;

    public RunnerEntity(){}

    public RunnerEntity(String name, int age, String gender){
        this.runnerName = name;
        this.runnerAge = age;
        this.runnerGender = gender;
    }


    /*Getters, setters*/
    public void setRunnerId(Long runnerId) {
        this.runnerId = runnerId;
    }

    public Long getRunnerId() {
        return runnerId;
    }

    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }

    public String getRunnerName() {
        return runnerName;
    }

    public void setRunnerAge(int runnerAge) {
        this.runnerAge = runnerAge;
    }

    public int getRunnerAge() {
        return runnerAge;
    }

    public void setRunnerGender(String runnerGender) {
        this.runnerGender = runnerGender;
    }

    public String getRunnerGender() {
        return runnerGender;
    }

}
