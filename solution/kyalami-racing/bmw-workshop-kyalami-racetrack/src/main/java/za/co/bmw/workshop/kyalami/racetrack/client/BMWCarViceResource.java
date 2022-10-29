package za.co.bmw.workshop.kyalami.racetrack.client;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;


@Path("/bmwcars")
public class BMWCarViceResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "BMW Race Car Vice Resource";
    }

    @RestClient
    BMWCarViceService bmwCarViceService;

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BMWCarVice> getAllBMWRaceCars() {
        return bmwCarViceService.getAllBMWRaceCars();
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/random")
    public BMWCarVice getRandomBMWRaceCars() {
        return bmwCarViceService.getRandomBMWRaceCar();
    }
}
