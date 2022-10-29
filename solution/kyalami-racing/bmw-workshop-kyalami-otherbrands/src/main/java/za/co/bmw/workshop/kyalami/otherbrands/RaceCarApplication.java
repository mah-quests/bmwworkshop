package za.co.bmw.workshop.kyalami.otherbrands;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(title = "Racing Cars API",
                description = "This API allows CRUD operations on a racing car",
                version = "1.0",
                contact = @Contact(name = "BMW-ZA Workshop", url = "https://github.com/mah-quests/bmwworkshop")),
        servers = {
                @Server(url = "http://localhost:8084")
        },
        externalDocs = @ExternalDocumentation(url = "https://github.com/mah-quests/bmwworkshop", description = "A 5 day quarkus microservices course")
)


public class RaceCarApplication extends Application{
}
