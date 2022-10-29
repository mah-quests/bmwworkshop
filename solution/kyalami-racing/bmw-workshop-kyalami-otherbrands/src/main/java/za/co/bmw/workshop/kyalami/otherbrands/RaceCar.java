package za.co.bmw.workshop.kyalami.otherbrands;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Random;

@Entity
public class RaceCar  extends PanacheEntity {
    @NotNull
    @Size(min = 1, max = 50)
    public String brand;

    public String model;

    public String engineCapacity;

    @NotNull
    @Min(1900)
    @Max(2022)
    public int year;

    public int torque;

    public double zeroToHundred;

    public int topSpeed;


    public static RaceCar findRandom() {
        long countRaceCar = count();
        Random random = new Random();
        int randomRaceCar = random.nextInt((int) countRaceCar);
        return findAll().page(randomRaceCar, 1).firstResult();
    }

    @Override
    public String toString() {
        return "Race Car{" +
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
