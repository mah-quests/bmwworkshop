package za.co.bmw.workshop.kyalami.racetrack;

import io.smallrye.mutiny.Multi;
import org.jboss.logging.Logger;
import org.jboss.resteasy.reactive.RestSseElementType;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.time.Duration;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Produces(APPLICATION_JSON)
@Path("/kyalamitrack")
public class RaceTrackResource {


    @GET
    @Path("/info")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Quarkus Microservices for car racing competition";
    }

    @Inject
    Logger logger;

    @Inject
    RaceTrackService raceTrackService;


    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<RaceTrack> showRaceResults() {
        return raceTrackService.findAllRaces();
    }


    @GET
    @Path("/random-simulation")
    @Produces(MediaType.APPLICATION_JSON)
    public RaceTrack showRandomlySelectedRacingCars() {
        return raceTrackService.showRandomlySelectedCars();
    }


    @GET
    @Path("/actual-race")
    @Produces(MediaType.APPLICATION_JSON)
    public RaceTrack actualTrackRacingCars() {
        return raceTrackService.persistRaceDetails();
    }


}

