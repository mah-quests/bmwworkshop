package za.co.bmw.workshop.day.two.metrics;

import java.time.Instant;
import java.util.Calendar;
import java.util.TimeZone;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.micrometer.core.annotation.Counted;
import io.micrometer.core.instrument.MeterRegistry;

@Path("/metrics")
public class PerformanceResource {
    private final MeterRegistry registry;

    PerformanceResource(MeterRegistry registry) {
        this.registry = registry;
        registry.gauge("offsetFromUTC", this,
                PerformanceResource::offsetFromUTC);
    }

    @Counted(value = "time.now")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Instant now() {
        return Instant.now();
    }

    int offsetFromUTC() {
        return TimeZone.getDefault().getOffset(Calendar.ZONE_OFFSET)/(3600*1000);
    }
}
