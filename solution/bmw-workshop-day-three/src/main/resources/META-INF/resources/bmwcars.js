function refresh() {
    $.get('/bmwcars', function (bmwcars) {

        var list = '';

        list = list
            + '<div class="container">'
            + '<table class="table table-hover">'
            + '<thead>'
            + '<tr>'
            + '<th>ID</th>'
            + '<th>Model</th>'
            + '<th>Yea</th>'
            + '<th>Color</th>'
            + '<th>Price</th>'
            + '<th>Action</th>'
            + '</tr>'
            + '</thead>'
            + '<tbody>';

        (bmwcars || []).forEach(function (bmw) {
            list = list
                    + '<tr>'
                        + '<td>' + bmw.id + '</td>'
                        + '<td>' + bmw.model + '</td>'
                        + '<td>' + bmw.year + '</td>'
                        + '<td>' + bmw.color + '</td>'
                        + '<td>' + bmw.price + '</td>'
                        + '<td><a href="#" onclick="deleteCar(' + bmw.id + ')">Delete</a></td>'
                    + '</tr>'
                + '</tbody>'
                + '</div>'
        });
        if (list.length > 0) {
            list = ''
                + '<table><thead><th>Id</th><th>Name</th><th></th></thead>'
                + list
                + '</table>';
        } else {
            list = "No BMW cars in database"
        }
        $('#all-bmws').html(list);
    });
}

function deleteCar(id) {
    $.ajax('/bmwcars/' + id, {method: 'DELETE'}).then(refresh);
}

$(document).ready(function () {

    $('#create-car-button').click(function () {
        var carModel = $('#car-model').val();
        var carYear = $('#car-year').val();
        var carColor = $('#car-color').val();
        var carPrice = $('#car-price').val();
        $.post({
            url: '/bmwcars',
            contentType: 'application/json',
            data: JSON.stringify({model: carModel,year: carYear,color: carColor,price: carPrice})
        }).then(refresh);
    });

    refresh();
});