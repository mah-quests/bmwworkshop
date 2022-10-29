package za.co.bmw.workshop.kyalami.bmwbrand;

import io.quarkus.hibernate.reactive.panache.common.runtime.ReactiveTransactional;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;
import org.jboss.resteasy.reactive.RestPath;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.net.URI;
import java.util.List;

import static javax.ws.rs.core.MediaType.*;

@Path("/bmwracingcar")
@Tag(name = "bmwracingcar")
@ApplicationScoped
public class BMWRaceCarResource {

    Logger logger;

    public BMWRaceCarResource(Logger logger){
        this.logger = logger;
    }

    @GET
    @Path("/info")
    @Produces(MediaType.TEXT_PLAIN)
    @Tag(name = "info")
    public String hello() {
        return "Microservice for BMW racing cars";
    }


    @Operation(summary = "Returns all the BMW Racing Cars from the database")
    @GET
    @APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = BMWRaceCar.class, type = SchemaType.ARRAY)))
    @APIResponse(responseCode = "204", description = "BMW Racing Cars")
    public Uni<List<BMWRaceCar>> getAllBMWRacingCar() {
        return BMWRaceCar.listAll();
    }

    @Operation(summary = "Returns a random BMW Racing Car")
    @GET
    @Path("/random")
    @APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = BMWRaceCar.class, required = true)))
    public Uni<BMWRaceCar> getRandomBMWRacingCar() {
        return BMWRaceCar.findRandom()
                .invoke(h -> logger.debugf("Found random bmw racing car: %s", h));
    }


    @Operation(summary = "Returns a BMW Racing Car for a given identifier")
    @GET
    @Path("/{id}")
    @APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = BMWRaceCar.class)))
    @APIResponse(responseCode = "204", description = "A BMW Racing Car is not found for a given identifier")
    public Uni<Response> getBMWRacingCar(@RestPath Long id) {
        return BMWRaceCar.<BMWRaceCar>findById(id)
                .map(bmwRacingCar -> {
                    if (bmwRacingCar != null) {
                        return Response.ok(bmwRacingCar).build();
                    }
                    logger.debugf("No BMW Racing Car found with id %d", id);
                    return Response.noContent().build();
                });
    }

    @Operation(summary = "Creates a valid BMW Racing Car")
    @POST
    @APIResponse(responseCode = "201", description = "The URI of the created BMW Racing Car", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = URI.class)))
    @ReactiveTransactional
    public Uni<Response> createBMWRacingCar(@Valid BMWRaceCar bmwRaceCar, @Context UriInfo uriInfo) {
        return bmwRaceCar.<BMWRaceCar>persist()
                .map(h -> {
                    UriBuilder builder = uriInfo.getAbsolutePathBuilder().path(Long.toString(h.id));
                    logger.debug("New BMW Racing Car created with URI " + builder.build().toString());
                    return Response.created(builder.build()).build();
                });
    }

    @Operation(summary = "Updates an exiting BMW Racing Car")
    @PUT
    @APIResponse(responseCode = "200", description = "The updated BMW Racing Car", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = BMWRaceCar.class)))
    @ReactiveTransactional
    public Uni<Response> updateBMWRacingCar(@Valid BMWRaceCar bmwRaceCar) {
        return BMWRaceCar.<BMWRaceCar>findById(bmwRaceCar.id)
                .map(retrieved -> {
                    retrieved.model = bmwRaceCar.model;
                    retrieved.engineCapacity = bmwRaceCar.engineCapacity;
                    retrieved.year = bmwRaceCar.year;
                    retrieved.torque = bmwRaceCar.torque;
                    retrieved.zeroToHundred = bmwRaceCar.zeroToHundred;
                    retrieved.topSpeed = bmwRaceCar.topSpeed;
                    return retrieved;
                })
                .map(h -> {
                    logger.debugf("BMW Racing Car updated with new valued %s", h);
                    return Response.ok(h).build();
                });
    }

    @Operation(summary = "Deletes an exiting BMW Racing Car")
    @DELETE
    @Path("/{id}")
    @APIResponse(responseCode = "204")
    @ReactiveTransactional
    public Uni<Response> deleteBMWRacingCar(@RestPath Long id) {
        return BMWRaceCar.deleteById(id)
                .invoke(() -> logger.debugf("BMW Racing Car deleted with %d", id))
                .replaceWith(Response.noContent().build());
    }

}
