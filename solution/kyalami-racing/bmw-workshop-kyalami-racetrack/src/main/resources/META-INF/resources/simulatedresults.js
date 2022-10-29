function refresh() {
    $.get('/kyalamitrack/all', function (results) {

        var list = '';

        list = list
            + '<div class="container">'
            + '<table class="table table-hover">'
            + '<thead>'
            + '<tr>'
            + '<th>Winner</th>'
            + '<th>Looser</th>'
            + '<th>Winner Top Speed</th>'
            + '<th>Looser Top Speed</th>'
            + '<th>Winner Torque</th>'
            + '<th>Looser Torque</th>'
            + '<th>Date & Time</th>'
            + '</tr>'
            + '</thead>'
            + '<tbody>';

        (results || []).forEach(function (showresult) {
            list = list
                    + '<tr>'
                        + '<td>' + showresult.winner + '</td>'
                        + '<td>' + showresult.looser + '</td>'
                        + '<td>' + showresult.winnerTopSpeed + '</td>'
                        + '<td>' + showresult.looserTopSpeed + '</td>'
                        + '<td>' + showresult.winnerTorque + '</td>'
                        + '<td>' + showresult.looserTorque + '</td>'
                        + '<td>' + showresult.raceDate + '</td>'
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
            list = "No simulated races in database"
        }
        $('#race-results').html(list);
    });
}

function deleteCar(id) {
    $.ajax('/kyalamitrack/' + id, {method: 'DELETE'}).then(refresh);
}

$(document).ready(function () {

    $('#create-car-button').click(function () {
        var carModel = $('#car-model').val();
        var carYear = $('#car-year').val();
        var carColor = $('#car-color').val();
        var carPrice = $('#car-price').val();
        $.post({
            url: '/kyalamitrack',
            contentType: 'application/json',
            data: JSON.stringify({model: carModel,year: carYear,color: carColor,price: carPrice})
        }).then(refresh);
    });

    refresh();
});