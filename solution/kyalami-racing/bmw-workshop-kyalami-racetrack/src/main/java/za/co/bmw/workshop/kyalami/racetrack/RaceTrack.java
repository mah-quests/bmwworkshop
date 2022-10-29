
package za.co.bmw.workshop.kyalami.racetrack;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.time.Instant;


@Entity
public class RaceTrack extends PanacheEntity{

    @NotNull
    public Instant raceDate;


    @NotNull
    public String winner;

    @NotNull
    public String winnerBrand;
    @NotNull
    public String winnerModel;
    @NotNull
    public String winnerEngineCapacity;
    @NotNull
    public int winnerCarYear;
    @NotNull
    public int winnerTorque;
    @NotNull
    public double winnerZeroToHundred;
    @NotNull
    public int winnerTopSpeed;


    @NotNull
    public String looser;
    @NotNull
    public String looserBrand;
    @NotNull
    public String looserModel;
    @NotNull
    public String looserEngineCapacity;
    @NotNull
    public int looserCarYear;
    @NotNull
    public int looserTorque;
    @NotNull
    public double looserZeroToHundred;
    @NotNull
    public int looserTopSpeed;

}
