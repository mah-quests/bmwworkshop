package za.co.bmw.workshop.kyalami.bmwbrand;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import io.smallrye.mutiny.Uni;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Random;

@Entity
@Cacheable
public class BMWRaceCar extends PanacheEntity{

    public final String brand = "BMW";

    @NotNull
    @Size(min = 1, max = 50)
    public String model;


    @NotNull
    @Size(min = 3, max = 50)
    public String engineCapacity;

    @NotNull
    @Min(1900)
    @Max(2022)
    public int year;

    public int torque;

    public double zeroToHundred;

    public int topSpeed;

    public static Uni<BMWRaceCar> findRandom() {
        Random random = new Random();
        return count()
                .map(count -> random.nextInt(count.intValue()))
                .chain(randomBMWRaceCar -> findAll().page(randomBMWRaceCar, 1).firstResult());
    }

    @Override
    public String toString() {
        return "BMW Race Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine capacity='" + engineCapacity + '\'' +
                ", year=" + year +
                ", torque='" + torque + " Nm" + '\'' +
                ", zero to hundred='" + zeroToHundred + " sec" + '\'' +
                ", topSpeed='" + topSpeed + '\'' +
                '}';
    }
}
