package za.co.bmw.workshop.day.two;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.core.Application;


@OpenAPIDefinition(
        tags = {
                @Tag(name="company", description="BMW Workshop"),
                @Tag(name="country", description="South Africa"),
                @Tag(name="specializatation", description="Quarkus"),
                @Tag(name="language", description="Java")
        },
        info = @Info(
                title="BMW South Africa Workshop",
                version = "1.0.1",
                contact = @Contact(
                        name = "Thato Mohono",
                        url = "http://tm.mahquests.co.za",
                        email = "thato.mohono@gmail.com"),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0.html"))
)
public class DevelopersApiApplication extends Application {
}
