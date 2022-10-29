package za.co.bmw.workshop.day.three;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cars")
public class ReactiveCarResource {

    @Inject ReactiveCarService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/bias")
    public String allTimeFavoriteBrand() {
        return "I may just be biased, but hey... Its BMW";
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/favorite/{car}")
    public Uni<String> favoriteCar(String car) {
        return service.favoriteCar(car);
    }

    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS)
    @Path("/e-car/{count}/{car}")
    public Multi<String> eCar(int count, String car) {
        return service.favoriteElectronCar(count, car);
    }

    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS)
    @Path("/flying/{car}")
    public Multi<String> flyingCarStream(String car) {
        return service.futureFlyingCar(car);
    }

}