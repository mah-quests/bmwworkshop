package za.co.bmw.workshop.kyalami.racetrack.client;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.faulttolerance.ExecutionContext;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.FallbackHandler;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/bmwracingcar")
@RegisterRestClient
public interface BMWCarViceService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Retry(maxRetries = 3, delay = 2000)
    public List<BMWCarVice> getAllBMWRaceCars();

    @GET
    @Path("/random")
    @Retry(maxRetries = 3, delay = 2000)
    @Fallback(value = BMWRaceCarViceRecovery.class)
    @Produces(MediaType.APPLICATION_JSON)
    public BMWCarVice getRandomBMWRaceCar();

    public static class BMWRaceCarViceRecovery implements FallbackHandler<BMWCarVice> {

        @Override
        public BMWCarVice handle(ExecutionContext context) {
            return BMWCarVice.EMPTY_CAR;
        }

    }

}
