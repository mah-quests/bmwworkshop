package za.co.bmw.workshop.day.three.db;


import io.quarkus.runtime.StartupEvent;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import io.vertx.mutiny.pgclient.PgPool;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("bmwcars")
@ApplicationScoped
public class BMWResource {

    @Inject
    PgPool client;

    @Inject
    @ConfigProperty(name = "myapp.schema.create", defaultValue = "true")
    boolean schemaCreate;

    void config(@Observes StartupEvent ev) {
        if (schemaCreate) {
            initdb();
        }
    }

    private void initdb() {
        // TODO
        client.query("DROP TABLE IF EXISTS bmwcars").execute()
                .flatMap(r -> client.query("CREATE TABLE bmwcars (id SERIAL PRIMARY KEY, model TEXT NOT NULL, year TEXT NOT NULL, color TEXT NOT NULL, price TEXT NOT NULL)").execute())
                .flatMap(r -> client.query("INSERT INTO bmwcars (model, year, color, price) VALUES ('X5','2016','charcole black', 'R599,000')").execute())
                .flatMap(r -> client.query("INSERT INTO bmwcars (model, year, color, price) VALUES ('i8','2017','blue', 'R2,050,000')").execute())
                .flatMap(r -> client.query("INSERT INTO bmwcars (model, year, color, price) VALUES ('M4','2020','white', 'R1,900,000')").execute())
                .flatMap(r -> client.query("INSERT INTO bmwcars (model, year, color, price) VALUES ('330i','2021','passion red', 'R1,350,000')").execute())
                .flatMap(r -> client.query("INSERT INTO bmwcars (model, year, color, price) VALUES ('200d','2019','brown', 'R900,000')").execute())
                .flatMap(r -> client.query("INSERT INTO bmwcars (model, year, color, price) VALUES ('X2','2018','mellow yellow', 'R599,000')").execute())
                .await().indefinitely();
    }

    @GET
    public Multi<BMW> get() {
        return BMW.findAll(client);
    }

    @GET
    @Path("{id}")
    public Uni<Response> getSingle(Long id) {
        return BMW.findById(client, id)
                .onItem().transform(bmw -> bmw != null ? Response.ok(bmw) : Response.status(Response.Status.NOT_FOUND))
                .onItem().transform(Response.ResponseBuilder::build);
    }

    @POST
    public Uni<Response> create(BMW bmw) {
        return bmw.save(client)
                .onItem().transform(id -> URI.create("/bmwcars/" + id))
                .onItem().transform(uri -> Response.created(uri).build());
    }

    @DELETE
    @Path("{id}")
    public Uni<Response> delete(Long id) {
        return BMW.delete(client, id)
                .onItem().transform(deleted -> deleted ? Response.Status.NO_CONTENT : Response.Status.NOT_FOUND)
                .onItem().transform(status -> Response.status(status).build());
    }

}