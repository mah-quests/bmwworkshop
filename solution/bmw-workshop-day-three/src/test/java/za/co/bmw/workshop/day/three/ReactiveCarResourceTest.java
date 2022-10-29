package za.co.bmw.workshop.day.three;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ReactiveCarResourceTest {

    private static final String DEFAULT_CAR = "BMW";
    private static final int DEFAULT_COUNT = 1;

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/cars/bias")
          .then()
             .statusCode(200)
             .body(is("I may just be biased, but hey... Its BMW"));
    }

    @Test
    public void testFavoriteCar() {
        given()
                .pathParam("car", DEFAULT_CAR)
                .when().get("/favorite/{car}")
                .then()
                .statusCode(404);
    }


    @Test
    public void testFavoriteElectricCar() {
        given()
                .pathParam("count", DEFAULT_COUNT)
                .pathParam("car", DEFAULT_CAR)
                .when().get("/e-car/{count}/{car}")
                .then()
                .statusCode(404);
    }

    @Test
    public void testFlyingCar() {
        given()
                .pathParam("car", DEFAULT_CAR)
                .when().get("/flying/{car}")
                .then()
                .statusCode(404);
    }
}