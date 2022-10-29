package za.co.bmw.workshop.day.three;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import javax.enterprise.context.ApplicationScoped;
import java.time.Duration;
import java.util.Objects;

@ApplicationScoped
public class ReactiveCarService {

    public Uni<String> favoriteCar(String car) {
        return Uni.createFrom().item("my favorite car is "+ car);
    }


    public Multi<String> favoriteElectronCar(int count, String car) {
        return Multi.createFrom().range(0,count)
                .onItem().transform(n->String.format("my favorite electron is " + car + ", and its carbon emission is up to  %d"+ count , n));
    }

    public Multi<String> futureFlyingCar(String car) {
         return Multi.createFrom().ticks().every(Duration.ofSeconds(1))
         .onItem().transform(n-> String.format("future flying car ready on ... %s - %d", car, n));
    }
}
