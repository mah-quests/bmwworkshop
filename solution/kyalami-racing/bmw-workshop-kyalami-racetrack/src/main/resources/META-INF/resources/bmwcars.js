function refresh() {
    $.get('/bmwcars/all', function (bmwcars) {

        var list = '';

        list = list
            + '<div class="container">'
            + '<table class="table table-hover">'
            + '<thead>'
            + '<tr>'
            + '<th>Brand</th>'
            + '<th>Model</th>'
            + '<th>Engine Capacity</th>'
            + '<th>Year</th>'
            + '<th>Torque</th>'
            + '<th>Zero to Hundred</th>'
            + '<th>Top Speed</th>'
            + '</tr>'
            + '</thead>'
            + '<tbody>';

        (bmwcars || []).forEach(function (bmw) {
            list = list
                    + '<tr>'
                        + '<td>' + bmw.brand + '</td>'
                        + '<td>' + bmw.model + '</td>'
                        + '<td>' + bmw.engineCapacity + '</td>'
                        + '<td>' + bmw.year + '</td>'
                        + '<td>' + bmw.torque + '</td>'
                        + '<td>' + bmw.zeroToHundred + '</td>'
                        + '<td>' + bmw.topSpeed + '</td>'
                    + '</tr>'
                + '</tbody>'
                + '</div>'
        });
        if (list.length > 0) {
            list = ''
                + '<table><thead><th></th><th></th><th></th></thead>'
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