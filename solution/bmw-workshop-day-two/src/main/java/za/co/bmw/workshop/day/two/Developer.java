package za.co.bmw.workshop.day.two;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.smallrye.common.constraint.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Size;
import java.util.Random;

@Entity
public class Developer extends PanacheEntity {
    @NotNull
    @Size (min = 3, max = 50)
    String first_name;

    @NotNull
    @Size(min = 3, max = 50)
    String surname;

    @NotNull
    @Size (min = 1, max = 50)
    @Column(name = "fav_language", columnDefinition = "TEXT")
    String favorite_language;

    @NotNull
    @Size (min = 1, max = 50)
    @Column(name = "specializing_in", columnDefinition = "TEXT")
    String specialization;


    public String toString(){
        return "Developer{" +
                "id=" + id +
                ", name='" + first_name + '\'' +
                ", surname='" + surname + '\'' +
                ", favorite programming language=" + favorite_language +
                ", specializing in='" + specialization + '\'' +
                '}';
    }

    public static Developer findRandom() {
        long countDevelopers = count();
        Random random = new Random();
        int randomDeveloper = random.nextInt((int) countDevelopers);
        return findAll().page(randomDeveloper, 1).firstResult();
    }

}
