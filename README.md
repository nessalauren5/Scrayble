# Scrayble

A Health Care Coordination Provider built on the MEAN stack
#Scrayble Folder Structure
```
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
---------------------------- foot.html - footer template
---------------------------- head.html - header template
----------------------- layouts
---------------------------- default.html - default body template
------------- public
------------------ assets
----------------------- lib - all custom css,js, fonts are placed here
------------------ controller - angular controller
------------------ routes  - angular routes
------------------ views
---------------------------- index.html - html templates go here

```

#Shell Script Option:

- Run
```
sudo ./Scrayble/buildNPMandBower.sh
```
This will fix all dependencies and start the server on port 3000

#Run Instructions

- Install Node (example below using brew on Mac OS)
```
  brew update
  sudo brew install nodejs
```
- Install Gulp, Bower and Mean CLI
```
 sudo npm install -g gulp
 sudo npm install -g bower
 sudo npm install -g mean-cli
```
- Navigate to Scrayble/Scrayble directory
- Install Bower dependencies
```
  bower install --allow-root
```
- Install node modules by typing the command
```
  sudo npm i
```
- Copy lib folder into Scayable/Scrayble/packages/core/system/public/assets

- Build and Run by typing the command
```
  gulp
```
You should see the server start up...
- Open Browser to localhost:3000

#DB Configuration
**Unless otherwised configured, the environment script run is development**

In order to connect to an mongo db, the url of should be placed on line of the config js file
```
  db: 'mongodb://admin:admin@ds055564.mongolab.com:55564/scraybledb'
```
To access the cloud db you can login here: https://mongolab.com/databases/scraybledb or you can configure the file above to whatever instance you wish.
