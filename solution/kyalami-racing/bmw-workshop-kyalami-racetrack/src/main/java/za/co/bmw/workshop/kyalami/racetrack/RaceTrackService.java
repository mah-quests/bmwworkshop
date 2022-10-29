package za.co.bmw.workshop.kyalami.racetrack;

import io.smallrye.mutiny.Multi;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;
import za.co.bmw.workshop.kyalami.racetrack.client.BMWCarVice;
import za.co.bmw.workshop.kyalami.racetrack.client.BMWCarViceService;
import za.co.bmw.workshop.kyalami.racetrack.client.OtherCarsVice;
import za.co.bmw.workshop.kyalami.racetrack.client.OtherCarsViceService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import java.time.Instant;
import java.util.List;
import java.util.Random;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;


@ApplicationScoped
@Transactional(SUPPORTS)
public class RaceTrackService {


    @RestClient
    BMWCarViceService bmwRaceCarProxy;

    @RestClient
    OtherCarsViceService raceCarProxy;

    RaceTrack raceTrack;

    @Inject Logger logger;

    private final Random random = new Random();

    public List<RaceTrack> findAllRaces() {
        return RaceTrack.listAll();
    }

    public RaceTrack findRaceById(Long id) {
        return RaceTrack.findById(id);
    }


    public RaceTrack showRandomlySelectedCars() {

        logger.info("Simulating and toggling between race cars ... Its going to be fun!)");

        raceTrack = new RaceTrack();
        raceTrack.raceDate = Instant.now();

        Random rn = new Random();
        int odd_even = rn.nextInt(10) + 1;

        if ( odd_even % 2 == 0){
            bmwWonRace();
        } else {
            otherMakeWonRace();
        }
        return raceTrack;

    }

    public RaceTrack bmwWonRace() {

        logger.info("Yes, BMW Car won the race... Yay :-)");

        raceTrack = new RaceTrack();

        BMWCarVice chosenBMW = bmwRaceCarProxy.getRandomBMWRaceCar();
        OtherCarsVice chosenOther = raceCarProxy.getRandomRaceCar();

        populateBMWWonRace(raceTrack, chosenOther, chosenBMW);
        raceTrack.raceDate = Instant.now();

        return raceTrack;
    }


    public RaceTrack otherMakeWonRace() {

        logger.info("Eishhh, Other Make Car won the race... Eeehhhhh :-( ");

        raceTrack = new RaceTrack();

        BMWCarVice chosenBMW = bmwRaceCarProxy.getRandomBMWRaceCar();
        OtherCarsVice chosenOther = raceCarProxy.getRandomRaceCar();

        populateOtherBrandsWonRace(raceTrack, chosenOther, chosenBMW);
        raceTrack.raceDate = Instant.now();

        return raceTrack;
    }

    public RaceTrack populateBMWWonRace(RaceTrack raceTrack, OtherCarsVice chosenOther, BMWCarVice chosenBMW){

        raceTrack.winnerModel = chosenBMW.getModel();
        raceTrack.winnerBrand = chosenBMW.getBrand();
        raceTrack.winnerEngineCapacity = chosenBMW.getEngineCapacity();
        raceTrack.winnerCarYear = chosenBMW.getYear();
        raceTrack.winnerTorque = chosenBMW.getTorque();
        raceTrack.winnerTopSpeed = chosenBMW.getTopSpeed();
        raceTrack.winnerZeroToHundred = chosenBMW.getZeroToHundred();
        raceTrack.winner = raceTrack.winnerBrand + " - " + raceTrack.winnerModel;


        raceTrack.looserModel = chosenOther.getModel();
        raceTrack.looserBrand = chosenOther.getBrand();
        raceTrack.looserEngineCapacity = chosenOther.getEngineCapacity();
        raceTrack.looserCarYear = chosenOther.getYear();
        raceTrack.looserTorque = chosenOther.getTorque();
        raceTrack.looserTopSpeed = chosenOther.getTopSpeed();
        raceTrack.looserZeroToHundred = chosenOther.getZeroToHundred();
        raceTrack.looser = raceTrack.looserBrand + " - " + raceTrack.looserModel;


        return raceTrack;
    }



    public RaceTrack populateOtherBrandsWonRace(RaceTrack raceTrack, OtherCarsVice chosenOther, BMWCarVice chosenBMW){

        raceTrack.winnerModel = chosenOther.getModel();
        raceTrack.winnerBrand = chosenOther.getBrand();
        raceTrack.winnerEngineCapacity = chosenOther.getEngineCapacity();
        raceTrack.winnerCarYear = chosenOther.getYear();
        raceTrack.winnerTorque = chosenOther.getTorque();
        raceTrack.winnerTopSpeed = chosenOther.getTopSpeed();
        raceTrack.winnerZeroToHundred = chosenOther.getZeroToHundred();
        raceTrack.winner = raceTrack.winnerBrand + " - " + raceTrack.winnerModel;


        raceTrack.looserModel = chosenBMW.getModel();
        raceTrack.looserBrand = chosenBMW.getBrand();
        raceTrack.looserEngineCapacity = chosenBMW.getEngineCapacity();
        raceTrack.looserCarYear = chosenBMW.getYear();
        raceTrack.looserTorque = chosenBMW.getTorque();
        raceTrack.looserTopSpeed = chosenBMW.getTopSpeed();
        raceTrack.looserZeroToHundred = chosenBMW.getZeroToHundred();
        raceTrack.looser = raceTrack.looserBrand + " - " + raceTrack.looserBrand;


        return raceTrack;
    }

    @Transactional(REQUIRED)
    public RaceTrack persistRaceDetails(){

        Multi.createFrom().range(0,3)
                .onItem().transform(n->String.format("ready, steady, go %s - %d... ", n));


        logger.info("The Cars are On The Race Track, Ready to compete");

        raceTrack = new RaceTrack();

        BMWCarVice chosenBMW = bmwRaceCarProxy.getRandomBMWRaceCar();
        OtherCarsVice chosenOther = raceCarProxy.getRandomRaceCar();


        int bmwTurbo = random.nextInt(30);
        int carTurbo = random.nextInt(20);


        if ((chosenOther.getTorque() * carTurbo)
                > (chosenBMW.getTorque() * bmwTurbo)) {
            raceTrack = populateOtherBrandsWonRace(raceTrack, chosenOther, chosenBMW);
            logger.info("Another Race won by the other brands");
        } else if (chosenBMW.getTorque() * bmwTurbo < chosenOther.getTorque() * carTurbo) {
            raceTrack = populateBMWWonRace(raceTrack, chosenOther, chosenBMW);
            logger.info("Another Race won by the BMW brand");
        } else {
            raceTrack = random.nextBoolean() ? populateBMWWonRace(raceTrack, chosenOther, chosenBMW) :
                    populateOtherBrandsWonRace(raceTrack, chosenOther, chosenBMW);
        }

        raceTrack.raceDate = Instant.now();
        raceTrack.persist();

        return raceTrack;


    }

}
