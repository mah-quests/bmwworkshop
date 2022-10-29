package za.co.bmw.workshop.day.three.kafka;

import io.smallrye.reactive.messaging.kafka.Record;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CarProducer {

    @Inject @Channel("cars-out")
    Emitter<Record<Integer, String>> emitter;

    public void sendCarListToKafka(Car car) {
        emitter.send(Record.of(car.year, car.model));
    }
}