// This code handles the API calls and displaying onto webpage
function loadData(sort)
{
    // Find the code that corresponds to the correct league
    var leagueNo = $('#league').val();
    //console.log(leagueNo);
    // This ajax call retrieves data from API
    $.ajax({
        url: "http://api.eliteprospects.com/beta/leagues/" + leagueNo + "/playerstats?season=2017-2018&sort=" + sort + ":desc,GP&fields=player.id,player.firstName,player.lastName,GP,G,A,TP,PM,PIM,GGP,team.id,team.name&apikey=b2565bd81f55eb34ef6a335d78bc9563",
        data: {
            format: 'json'
        },
        success: function(data)
        {
            $('#name').html(data.metadata);
            var info = data;
            for (var i = 0; i < info.data.length; i++)
            {
                // This loop goes through data and prints into the table
                var name = info.data[i].player.firstName + " " + info.data[i].player.lastName;
                $('#main').append("<tr><td>" + (i+1) + "</td>" + "<td>" + name + "</td>" + "<td>" + info.data[i].G + "</td>" + "<td>" + info.data[i].A +  "</td>" + "<td>" + info.data[i].PIM + "</td></tr>");
            }
            console.log("Loaded successfully!");
            console.log(info.data[0]);
        }
    })
}

// These functions clear the table, then pass a sort parameter into the loadData function

function sortByGoals() {
    var sort = "G";
    $('#main').html("<tr><th>#</th><th>Name</th><th>Goals</th><th>Assists</th><th>Penalty Minutes</th></tr>");
    loadData(sort);
}

function sortByAssists() {
    var sort = "A";
    $('#main').html("<tr><th>#</th><th>Name</th><th>Goals</th><th>Assists</th><th>Penalty Minutes</th></tr>");
    loadData(sort);
}

function sortByPM() {
    var sort = "PIM";
    $('#main').html("<tr><th>#</th><th>Name</th><th>Goals</th><th>Assists</th><th>Penalty Minutes</th></tr>");
    loadData(sort);

}

/* MESTIS = 28;
NHL = 7;
LIIGA =6; */