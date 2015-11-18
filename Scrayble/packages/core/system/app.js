'use strict';

/*
 * Defining the Package
 */
var meanio = require('meanio');
var Module = meanio.Module,
  config = meanio.loadConfig(),
  favicon = require('serve-favicon');

var SystemPackage = new Module('system');

/*
 * All MEAN packages require registration
 * Dependency injection is used to define required modules
 */
SystemPackage.register(function(app, auth, database, circles) {

  //We enable routing. By default the Package Object is passed to the routes
  SystemPackage.routes(app, auth, database);

  var libDir = "../lib/";
  SystemPackage.aggregateAsset('css',libDir + "css/bootstrap.min.css");
  SystemPackage.aggregateAsset('css',libDir + "css/font-awesome.min.css")

  SystemPackage.aggregateAsset('css',libDir + "css/switchery.min.css");
  SystemPackage.aggregateAsset('css',libDir + "css/freelancer.css");


  SystemPackage.aggregateAsset('js',libDir + "js/jqBootstrapValidation.js");
  SystemPackage.aggregateAsset('js',libDir + "js/jquery.validate.js");
  SystemPackage.aggregateAsset('js',libDir + "js/bootstrap.min.js");

  SystemPackage.aggregateAsset('js',libDir + "js/jquery.js");



  SystemPackage.aggregateAsset('img',libDir + "img/profile.png");
  SystemPackage.angularDependencies(['mean-factory-interceptor']);


  // The middleware in config/express will run before this code

  // Set views path, template engine and default layout
  app.set('views', __dirname + '/server/views');

  // Setting the favicon and static folder
  if(config.favicon) {
    app.use(favicon(config.favicon));
  } else {
    app.use(favicon(__dirname + '/public/assets/lib/img/favicon.ico'));
  }

  // Adding robots and humans txt
  app.useStatic(__dirname + '/public/assets/static');

  return SystemPackage;

});
