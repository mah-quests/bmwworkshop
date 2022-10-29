package za.co.bmw.workshop.day.one;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty (name = "bmw.training.course")
    String course;

    @ConfigProperty(name = "bmw.training.subject", defaultValue="Microservices")
    String subject;

    @ConfigProperty(name = "bmw.training.trainer")
    Optional<String> trainer;


    @Inject
    GreetingService service;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Excited about writting my first Quakus Microservice App!";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greetingWithName(String name) {
        return service.greeting(name);
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
        @Path("/course-details")
    public String aboutTraining() {
        return course + " class done by  " +
                trainer.orElse("Oracle Guy") +
                ", the best parts are " + subject;
    }

    @Inject TrainingDetails details;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/more-details")
    public String trainingInterface() {
        return "Workshop is running at " + details.location() +
                " start date is " + details.date() +
                " start time is  " + details.starttime() +
                " projected end time is " + details.endtime();
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/topics")
    public String subjectDetails() {
        return SubjectDetails.readFile();

    }


}