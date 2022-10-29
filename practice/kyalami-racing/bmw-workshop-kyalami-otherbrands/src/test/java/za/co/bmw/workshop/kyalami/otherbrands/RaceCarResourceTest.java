package za.co.bmw.workshop.kyalami.otherbrands;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class RaceCarResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/racingcar")
          .then()
             .statusCode(200)
             .body(is("Hello from RESTEasy Reactive"));
    }

}