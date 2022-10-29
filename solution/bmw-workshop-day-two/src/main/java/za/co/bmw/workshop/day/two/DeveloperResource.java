package za.co.bmw.workshop.day.two;


import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

import static javax.ws.rs.core.MediaType.*;

@Path("/bmw")
public class DeveloperResource {
    @Inject
    DeveloperService service;

    @GET
    @Produces(TEXT_PLAIN)
    public String helloBMWDeveloper() {
        return "Hello, I am a Developer working at BMW";
    }

    @GET
    @Produces(APPLICATION_JSON)
    @Path("/names")
    public List getRandomNames() {
        return GenerateRandomNames.getRandomNames();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/array-names-json-fmt")
    public String getRandomNamesJSON() {
        return GenerateRandomNames.convertListToJSON();
    }


    @Inject
    Logger logger;

    @GET
    @Path("/db-developers")
    public Response getAllDevelopers() {
        List<Developer> developers = service.findAllDevelopers();
        logger.debug("Total number of villains " + developers);
        return Response.ok(developers).build();
    }

    @GET
    @Produces(APPLICATION_JSON)
    @Path("/db-names-json-fmt")
    public String getDBDataNamesJSON() {
        List<Developer> developers = service.findAllDevelopers();
        return GenerateRandomNames.convertDBDataToJSON(developers);
    }

    @ConfigProperty(name = "developer.first_name")
    String firstname;

    @ConfigProperty(name = "developer.surname")
    String surname;

    @ConfigProperty(name = "developer.favorite_language")
    String programming_language;

    @ConfigProperty(name = "developer.specialization")
    String specialization;

    @Path("/profile-names")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String person() {
        return "The developer is " + firstname + " " + surname
                + " whose favorite programming language is " + programming_language
                + ", and specializes in " + specialization;
    }


}