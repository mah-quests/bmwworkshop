package za.co.bmw.workshop.kyalami.otherbrands;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

@ApplicationScoped
@Transactional(REQUIRED)

public class RaceCarService {
    @Transactional(SUPPORTS)
    public List<RaceCar> findAllRaceCars() {
        return RaceCar.listAll();
    }

    @Transactional(SUPPORTS)
    public RaceCar findRaceCarById(Long id) {
        return RaceCar.findById(id);
    }

    @Transactional(SUPPORTS)
    public RaceCar findRandomRaceCar() {
        RaceCar randomRaceCar = null;
        while (randomRaceCar == null) {
            randomRaceCar = RaceCar.findRandom();
        }
        return randomRaceCar;
    }

    public RaceCar persistRaceCar(@Valid RaceCar raceCar) {
        raceCar.persist();
        return raceCar;
    }

    public RaceCar updateRaceCar(@Valid RaceCar raceCar) {
        RaceCar entity = RaceCar.findById(raceCar.id);
        entity.brand = raceCar.brand;
        entity.model = raceCar.model;
        entity.year = raceCar.year;
        entity.torque = raceCar.torque;
        entity.zeroToHundred = raceCar.zeroToHundred;

        return entity;
    }

    public void deleteRaceCar(Long id) {
        RaceCar raceCar = RaceCar.findById(id);
        raceCar.delete();
    }
}
