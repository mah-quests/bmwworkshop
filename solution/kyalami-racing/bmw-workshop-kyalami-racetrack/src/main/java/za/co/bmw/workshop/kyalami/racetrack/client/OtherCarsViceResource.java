package za.co.bmw.workshop.kyalami.racetrack.client;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/othercars")
public class OtherCarsViceResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Other Branded Race Car Vice Resource";
    }

    @RestClient
    OtherCarsViceService otherCarsViceService;
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<OtherCarsVice> getAllBMWRaceCars() {
        return otherCarsViceService.getAllOtherRaceCars();
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/random")
    public OtherCarsVice getRandomBMWRaceCars() {
        return otherCarsViceService.getRandomRaceCar();
    }
}
