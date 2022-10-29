package za.co.bmw.workshop.kyalami.racetrack;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class RaceTrackResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/kyalamitrack/info")
          .then()
             .statusCode(200)
             .body(is("Quarkus Microservices for car racing competition"));
    }

}