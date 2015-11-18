# Scrayble

A Health Care Coordination Provider built on the MEAN stack
#Scrayble Folder Structure
-- bower_components - dependencies install by bower
-- bower.json - bower config file
-- config - folder with env configurations
-- gulp 
-- gulpfile.js - gulp config file
-- logs
-- node_modules - node dependencies (installed after running npm)
-- npm-shrinkwrap.json
-- package.json
-- packages
----- core
-------- system
------------- app.js - file to configure custom resources see assets/lib
------------- server 
------------------ controller
------------------ routes
------------------ views
----------------------- includes 
---------------------------- foot.html
------------- public
------------------ assets
----------------------- lib - all custom css,js, fonts are placed here
------------------ controller
------------------ routes
------------------ views

#Run Instructions

- Make sure your system has node, bower, and gulp installed
- In the console navigate to Scrayble/Scrayble directory
- Run gulp 
- Open Browser to localhost:3000

#DB Configuration
**Unless otherwised configured, the environment script run is development**

In order to connect to an mongo db, the url of should be placed on line of the config js file
```
  db: 'mongodb://admin:admin@ds055564.mongolab.com:55564/scraybledb'
```
To access the cloud db you can login here: https://mongolab.com/databases/scraybledb or you can configure the file above to whatever instance you wish.




