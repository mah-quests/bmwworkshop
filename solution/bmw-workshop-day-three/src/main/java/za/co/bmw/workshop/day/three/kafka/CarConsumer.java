package za.co.bmw.workshop.day.three.kafka;


import io.smallrye.reactive.messaging.kafka.Record;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CarConsumer {

    private final Logger logger = Logger.getLogger(CarConsumer.class);

    @Incoming("cars-in")
    public void receive(Record<Integer, String> record) {
        logger.infof("Car details on the floor (Year - Model): %d - %s", record.key(), record.value());
    }
}