package za.co.bmw.workshop.kyalami.otherbrands;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;
import org.jboss.resteasy.reactive.RestPath;

import javax.validation.Valid;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import java.net.URI;
import java.util.List;

import static javax.ws.rs.core.MediaType.*;

@Path("/racingcar")
@Tag(name="racingcar")
public class RaceCarResource {

    Logger logger;
    RaceCarService service;

    public RaceCarResource(Logger logger, RaceCarService service){
        this.service = service;
        this.logger = logger;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/info")
    @Tag(name="info")
    public String hello() {
        return "Microservice for racing cars that are not a BMW brand";
    }


    @Operation(summary = "Returns a random racing car")
    @GET
    @Path("/random")
    @APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = RaceCar.class, required = true)))
    public Response getRandomRacingCar() {
        RaceCar raceCar = service.findRandomRaceCar();
        logger.debug("Found random race car " + raceCar);
        return Response.ok(raceCar).build();
    }


    @Operation(summary = "Returns all the racing cars from the database")
    @APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = RaceCar.class, type = SchemaType.ARRAY)))
    @APIResponse(responseCode = "204", description = "No racing cars")
    @GET
    public Response getAllRaceCars() {
        List<RaceCar> raceCar = service.findAllRaceCars();
        logger.debug("Total number of race cars " + raceCar);
        return Response.ok(raceCar).build();
    }


    @Operation(summary = "Returns a racing cars for a given identifier")
    @GET
    @Path("/{id}")
    @APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = RaceCar.class)))
    @APIResponse(responseCode = "204", description = "The racing cars is not found for a given identifier")
    public Response getRaceCars(@RestPath Long id) {
        RaceCar raceCar = service.findRaceCarById(id);
        if (raceCar != null) {
            logger.debug("Found race car " + raceCar);
            return Response.ok(raceCar).build();
        } else {
            logger.debug("No race car found with id " + id);
            return Response.noContent().build();
        }
    }

    @Operation(summary = "Creates a valid racing car")
    @APIResponse(responseCode = "201", description = "The URI of the created racing car", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = URI.class)))
    @POST
    public Response createRaceCar(@Valid RaceCar raceCar, @Context UriInfo uriInfo) {
        raceCar = service.persistRaceCar(raceCar);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder().path(Long.toString(raceCar.id));
        logger.debug("New race car created with URI " + builder.build().toString());
        return Response.created(builder.build()).build();
    }

    @Operation(summary = "Updates an exiting racing car")
    @APIResponse(responseCode = "200", description = "The updated racing car", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = RaceCar.class)))
    @PUT
    public Response updateRaceCar(@Valid RaceCar raceCar) {
        raceCar = service.updateRaceCar(raceCar);
        logger.debug("RaceCar updated with new valued " + raceCar);
        return Response.ok(raceCar).build();
    }


    @Operation(summary = "Deletes an exiting racing car")
    @APIResponse(responseCode = "204")
    @DELETE
    @Path("/{id}")
    public Response deleteRaceCar(@RestPath Long id) {
        service.deleteRaceCar(id);
        logger.debug("RaceCar deleted with " + id);
        return Response.noContent().build();
    }

}
