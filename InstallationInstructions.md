Installation Instructions

Required Softwares:
Eclipse IDE
mySQL
Active Internet connection
Postman (If you want to test the API)

Instructions:
Download zipfile from github titled ActivityTrackerFinal.zip (Link)
Extract this file and save it to your preferred folder
Download  activitytrackercreate.sql file (Link) and save it to your preferred folder
Download storyline.json file (Link) and save it to your preferred folder
Use activitytrackercreate.sql file and open it in mySQL and click on run (This will create your schema)
Open Eclipse IDE and open this extracted file in the IDE
Inside Resources>application.properties file - update your mysql username, password
Inside src>main>java>ActivityTracker>DAO>ConnManager, update your username and password.
Inside src>main>java>ActivityTracker>Inserter update the file location to where storyline.json file is located
Right click on the pom.xml file and click on maven>reload project
Right click on inserter.java and click on Run ‘Inserter.main()’, this will insert all the data into your database (This will take a few minutes to finish)
Right click on ActivityTrackerApplication and click on Run. This will start your server, now you can go to localhost:8080/ and use the webpages we created or use the api we have made.
