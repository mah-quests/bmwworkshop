package za.co.bmw.workshop.kyalami.bmwbrand;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BMWRaceCarResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/bmwracingcar")
          .then()
             .statusCode(200)
             .body(is("Hello from RESTEasy Reactive"));
    }

}