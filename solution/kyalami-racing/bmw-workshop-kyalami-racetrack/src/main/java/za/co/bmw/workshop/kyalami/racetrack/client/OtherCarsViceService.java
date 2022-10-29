package za.co.bmw.workshop.kyalami.racetrack.client;


import org.eclipse.microprofile.faulttolerance.ExecutionContext;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.FallbackHandler;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/racingcar")
@RegisterRestClient
public interface OtherCarsViceService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Retry(maxRetries = 3, delay = 2000)
    public List<OtherCarsVice> getAllOtherRaceCars();

    @GET
    @Path("/random")
    @Retry(maxRetries = 3, delay = 2000)
    @Fallback(value = OtherRacesCarViceRecovery.class)
    @Produces(MediaType.APPLICATION_JSON)
    public OtherCarsVice getRandomRaceCar();

    public static class OtherRacesCarViceRecovery implements FallbackHandler<OtherCarsVice> {

        @Override
        public OtherCarsVice handle(ExecutionContext context) {
            return OtherCarsVice.EMPTY_CAR;
        }

    }

}
