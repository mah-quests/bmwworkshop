package za.co.bmw.workshop.kyalami.otherbrands;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.common.mapper.TypeRef;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static javax.ws.rs.core.HttpHeaders.ACCEPT;
import static javax.ws.rs.core.HttpHeaders.CONTENT_TYPE;
import static javax.ws.rs.core.Response.Status.*;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RaceCarResourceTest {

    private static final String JSON = "application/json;charset=UTF-8";

    private static final String DEFAULT_BRAND = "DEFAULT_BRAND";
    private static final String UPDATED_BRAND = "UPDATED_BRAND";

    private static final String DEFAULT_MODEL = "DEFAULT_MODEL";
    private static final String UPDATED_MODEL = "UPDATED_MODEL";

    private static final String DEFAULT_ENGINECAPACITY = "DEFAULT_ENGINECAPACITY";
    private static final String UPDATED_ENGINECAPACITY = "UPDATED_ENGINECAPACITY";

    private static final int DEFAULT_YEAR = 1999;
    private static final int UPDATED_YEAR = 1999;

    private static final int DEFAULT_TORQUE  = 50;
    private static final int UPDATED_TORQUE = 55;

    private static final float DEFAULT_0_TO_100 = 20F;
    private static final float UPDATED_0_TO_100 = 125F;

    private static final int DEFAULT_TOPSPEED = 200;
    private static final double UPDATED_TOPSPEED = 200;

    private static final int NB_RACECARS = 4;

    private static String raceCarId;

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/racingcar/info")
                .then()
                .statusCode(200)
                .body(is("Microservice for racing cars that are not a BMW brand"));
    }

    @Test
    void shouldNotGetUnknownRaceCar() {
        Long randomId = new Random().nextLong();
        given()
                .pathParam("id", randomId)
                .when().get("/racingcar/{id}")
                .then()
                .statusCode(NO_CONTENT.getStatusCode());
    }

    @Test
    void shouldGetRandomRaceCar() {
        given()
                .when().get("/racingcar/random")
                .then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON);
    }

    @Test
    void shouldNotAddInvalidRaceCar() {
        RaceCar raceCar = new RaceCar();

        raceCar.brand = null;
        raceCar.model = null;
        raceCar.engineCapacity = null;
        raceCar.year = 2000;
        raceCar.torque = 0;
        raceCar.zeroToHundred = 0;
        raceCar.topSpeed = 0;

        given()
                .body(raceCar)
                .header(CONTENT_TYPE, JSON)
                .header(ACCEPT, JSON)
                .when()
                .post("/racingcar")
                .then()
                .statusCode(BAD_REQUEST.getStatusCode());
    }

    @Test
    @Order(1)
    void shouldGetInitialRaceCars() {
        List<RaceCar> raceCars = get("/racingcar").then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .extract().body().as(getRaceCarTypeRef());
        assertEquals(NB_RACECARS, raceCars.size());
    }

    @Test
    @Order(2)
    void shouldAddAnRaceCar() {
        RaceCar raceCar = new RaceCar();
        raceCar.brand = DEFAULT_BRAND;
        raceCar.model = DEFAULT_MODEL;
        raceCar.engineCapacity = DEFAULT_ENGINECAPACITY;
        raceCar.year = DEFAULT_YEAR;
        raceCar.torque = DEFAULT_TORQUE;
        raceCar.zeroToHundred = DEFAULT_0_TO_100;
        raceCar.topSpeed = DEFAULT_TOPSPEED;


        String location = given()
                .body(raceCar)
                .header(CONTENT_TYPE, JSON)
                .header(ACCEPT, JSON)
                .when()
                .post("/racingcar")
                .then()
                .statusCode(CREATED.getStatusCode())
                .extract().header("Location");
        assertTrue(location.contains("/racingcar"));

        // Stores the id
        String[] segments = location.split("/");
        raceCarId = segments[segments.length - 1];
        assertNotNull(raceCarId);

        given()
                .pathParam("id", raceCarId)
                .when().get("/racingcar/{id}")
                .then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .body("brand", Is.is(DEFAULT_BRAND))
                .body("model", Is.is(DEFAULT_MODEL))
                .body("engineCapacity", Is.is(DEFAULT_ENGINECAPACITY))
                .body("year", Is.is(DEFAULT_YEAR))
                .body("torque", Is.is(DEFAULT_TORQUE))
                .body("zeroToHundred", Is.is(DEFAULT_0_TO_100))
                .body("topSpeed", Is.is(DEFAULT_TOPSPEED));

        List<RaceCar> raceCars = get("/racingcar").then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .extract().body().as(getRaceCarTypeRef());
        assertEquals(NB_RACECARS + 1, raceCars.size());
    }

    @Test
    @Order(3)
    void testUpdatingAnRaceCar() {

        RaceCar raceCar = new RaceCar();

        raceCar.id = Long.valueOf(raceCarId);
        raceCar.brand = DEFAULT_BRAND;
        raceCar.model = DEFAULT_MODEL;
        raceCar.engineCapacity = DEFAULT_ENGINECAPACITY;
        raceCar.year = DEFAULT_YEAR;
        raceCar.torque = DEFAULT_TORQUE;
        raceCar.zeroToHundred = DEFAULT_0_TO_100;
        raceCar.topSpeed = DEFAULT_TOPSPEED;

        given()
                .body(raceCar)
                .header(CONTENT_TYPE, JSON)
                .header(ACCEPT, JSON)
                .when()
                .put("/racingcar")
                .then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .body("brand", Is.is(DEFAULT_BRAND))
                .body("model", Is.is(DEFAULT_MODEL))
                .body("engineCapacity", Is.is(DEFAULT_ENGINECAPACITY))
                .body("year", Is.is(DEFAULT_YEAR))
                .body("torque", Is.is(DEFAULT_TORQUE))
                .body("zeroToHundred", Is.is(DEFAULT_0_TO_100))
                .body("topSpeed", Is.is(DEFAULT_TOPSPEED));

        List<RaceCar> raceCars = get("/racingcar").then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .extract().body().as(getRaceCarTypeRef());
        assertEquals(NB_RACECARS + 1, raceCars.size());
    }

    @Test
    @Order(4)
    void shouldRemoveAnRaceCar() {
        given()
                .pathParam("id", raceCarId)
                .when().delete("/racingcar/{id}")
                .then()
                .statusCode(NO_CONTENT.getStatusCode());

        List<RaceCar> raceCars = get("/racingcar").then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .extract().body().as(getRaceCarTypeRef());
        assertEquals(NB_RACECARS, raceCars.size());
    }

    private TypeRef<List<RaceCar>> getRaceCarTypeRef() {
        return new TypeRef<List<RaceCar>>() {
        };
    }

    @Test
    void shouldPingOpenAPI() {
        given()
                .header(ACCEPT, JSON)
                .when().get("/q/openapi")
                .then()
                .statusCode(OK.getStatusCode());
    }

}
