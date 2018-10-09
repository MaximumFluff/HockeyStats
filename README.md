# HockeyStats

Java Spring App built as an assignment for my Server Programming course. Utilizing Java, jQuery and Bootstrap.

## Description

Pulls latest hockey statistics from EliteProspects API and renders them as a web app.

Stats can be sorted by goals, assists and penalties.

Site has basic user validation built in, two built in users: user and admin (Passwords are the same for now)

## Try it out!

https://hh-hockey-stats.herokuapp.com/

Unfortunately the EliteProspects API does not currently support HTTPS, so you will need to allow mixed content on your browser or run the app locally.

In Firefox, you can change this setting by typing 'about:config' into your address bar and then changing the 'security.mixed_content.block_active_content' setting to false

You can also click the https lock icon to access the options and choose to disable the mixed content blocker (be sure to re-activate it afterwards!)
