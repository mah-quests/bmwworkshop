package za.co.bmw.workshop.day.two;


import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;

import java.util.List;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

@ApplicationScoped
@Transactional(REQUIRED)
public class DeveloperService {

    @Inject
    Logger LOGGER;
    @Transactional(SUPPORTS)
    public List<Developer> findAllDevelopers() {
        LOGGER.info("Inside inside the findAllDevelopers() method");
        LOGGER.info(Developer.listAll());
        return Developer.listAll();
    }

    @Transactional(SUPPORTS)
    public Developer findDeveloperById(Long id) {
        return Developer.findById(id);
    }

    @Transactional(SUPPORTS)
    public Developer findRandomDeveloper() {
        Developer randomDeveloper = null;
        while (randomDeveloper == null) {
            randomDeveloper = Developer.findRandom();
        }
        return randomDeveloper;
    }

    public Developer persistDeveloper(@Valid Developer developer) {
        developer.persist();
        return developer;
    }

    public Developer updateDeveloper (@Valid Developer developer) {
        Developer entity = Developer.findById(developer.id);
        entity.first_name = developer.first_name;
        entity.surname = developer.surname;
        entity.favorite_language = developer.favorite_language;
        entity.specialization = developer.specialization;

        return entity;
    }

    public void removeDeveloper(Long id) {
        Developer developer = Developer.findById(id);
        developer.delete();
    }
}
