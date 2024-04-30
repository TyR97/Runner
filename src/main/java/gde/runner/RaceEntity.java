package gde.runner;

import jakarta.persistence.*;

@Entity
@Table(name = "races")
public class RaceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "raceId", nullable = false)
    private Long raceId;

    @Column(name = "raceName", nullable = false)
    private String raceName;

    @Column(name = "raceLength", nullable = false)
    private double raceLength;

    public RaceEntity() {
    }

    public RaceEntity(String name, double length) {
        this.raceName = name;
        this.raceLength = length;
    }


    /*Getters, setters*/
    public void setRaceId(Long raceId) {
        this.raceId = raceId;
    }

    public Long getRaceId() {
        return raceId;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceLength(double raceLength) {
        this.raceLength = raceLength;
    }

    public double getRaceLength() {
        return raceLength;
    }
}