package za.co.bmw.workshop.day.three.kafka;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/kafka")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CarResource {

    @Inject
    CarProducer producer;

    @POST
    public Response send(Car car) {
        producer.sendCarListToKafka(car);
        // Return an 202 - Accepted response.
        return Response.accepted().build();
    }
}