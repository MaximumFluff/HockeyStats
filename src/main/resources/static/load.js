$(document).ready(function() {
    $.ajax({
        url: "http://api.eliteprospects.com/beta/leagues/6/playerstats?season=2015-2016&sort=G:desc,GP&fields=player.id,player.firstName,player.lastName,GP,G,A,TP,PM,PIM,GGP,team.id,team.name&apikey=b2565bd81f55eb34ef6a335d78bc9563",
        data: {
            format: 'json'
        },
        success: function(data)
        {

            $('#name').html(data.metadata);
            var info = JSON.parse(data);
            for (var i = 0; i < info.data.length; i++)
            {
                var name = info.data[i].player.firstName + " " + info.data[i].player.lastName;
                $("#main").append("<tr><td>" + name + "</td>" + "<td>" + info.data[i].G + "</td>" + "<td>" + info.data[i].A +  "</td>" + "<td>" + info.data[i].PM + "</td> </tr>");
            }
            console.log("Loaded successfully!");
            console.log(info.data[0]);
        }
    })
});