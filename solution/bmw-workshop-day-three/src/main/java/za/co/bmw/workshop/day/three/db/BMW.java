package za.co.bmw.workshop.day.three.db;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.sqlclient.Row;
import io.vertx.mutiny.pgclient.PgPool;
import io.vertx.mutiny.sqlclient.RowSet;
import io.vertx.mutiny.sqlclient.Tuple;

public class BMW {

    public Long id;

    public String model;

    public String year;

    public String price;
    public String color;

    public BMW() {
    }

    public BMW(Long id, String model, String year, String color, String price) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }


    private static BMW from(Row row) {
        return new BMW(row.getLong("id"), row.getString("model"), row.getString("year"), row.getString("color"), row.getString("price"));
    }

    public static Multi<BMW> findAll(PgPool client) {
        return client.query("SELECT id, model, year, color, price FROM bmwcars ORDER BY id ASC").execute()
                .onItem().transformToMulti(set -> Multi.createFrom().iterable(set))
                .onItem().transform(BMW::from);
    }

    public static Uni<BMW> findById(PgPool client, Long id) {
        return client.preparedQuery("SELECT id, model, year, color, price FROM bmwcars WHERE id = $1").execute(Tuple.of(id))
                .onItem().transform(RowSet::iterator)
                .onItem().transform(iterator -> iterator.hasNext() ? from(iterator.next()) : null);
    }

    public Uni<Long> save(PgPool client) {
        return client.preparedQuery("INSERT INTO bmwcars (model, year, color, price) VALUES ($1, $2, $3, $4) RETURNING id").execute(Tuple.of(model, year, color, price))
                .onItem().transform(pgRowSet -> pgRowSet.iterator().next().getLong("id"));
    }

    public static Uni<Boolean> delete(PgPool client, Long id) {
        return client.preparedQuery("DELETE FROM bmwcars WHERE id = $1").execute(Tuple.of(id))
                .onItem().transform(pgRowSet -> pgRowSet.rowCount() == 1);
    }
}