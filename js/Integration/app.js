var express = require('express');
var app = express();
var Fhir = require("./fhir");
var Patient = require("./Patient");
var Encounter = require("./Encounter");
var Observation = require("./Observation");
var Condition = require("./Condition");
var Medication = require("./Medication");
var MedicationDispense = require("./MedicationDispense");
var MedicationPrescription = require("./MedicationPrescription");

app.get('/', function(request, response) {
	var fhir = new Fhir();

	//READ
	//fhir.getResourceById("Patient", "556", function(resp) { response.send(resp.jsonPrint());});
	//fhir.getResourceById("Encounter", "7346", function(resp) { response.send(resp.jsonPrint());});
	//fhir.getResourceById("Observation", "40857", function(resp) { response.send(resp.jsonPrint());});
	//fhir.getResourceById("Condition", "3187", function(resp) { response.send(resp.jsonPrint());});
	//fhir.getResourceById("MedicationDispense", "765", function(resp) { response.send(resp.jsonPrint());});
	//fhir.getResourceById("Medication", "528264", function(resp) { response.send(resp.jsonPrint());});
	//fhir.getResourceById("MedicationPrescription", "2048", function(resp) { response.send(resp.jsonPrint());});

	//DEBUG METHODS
	//fhir.printResourceById("Patient", "556", function(resp) { response.send(resp);});
	//fhir.printResourceById("Encounter", "7346", function(resp) { response.send(resp);});
	//fhir.printResourceById("Observation", "40857", function(resp) { response.send(resp);});
	//fhir.printResourceById("Condition", "3187", function(resp) { response.send(resp);});
	//fhir.printResourceById("MedicationDispense", "765", function(resp) { response.send(resp);});
	//fhir.printResourceById("Medication", "528264", function(resp) { response.send(resp);});
	//fhir.printResourceById("MedicationPrescription", "2048", function(resp) { response.send(resp);});

	//CREATE

	//var entity = new Patient("Patient", "695", {"status":"generated","div":"<div><div class=\"hapiHeaderText\"> Josemaria L <b>DOLORES </b></div><table class=\"hapiPropertyTable\"><tbody><tr><td>Address</td><td><span>1234 Rocky Mountain Drive </span><br /><span>null </span><br /><span>Lincoln </span><span>IL </span></td></tr><tr><td>Date of birth</td><td><span>13 December 1922</span></td></tr></tbody></table></div>"},
	//"Dolores", ["Josemaria","L"], "home", "56 Flea Bottom", "Kings Landing", "IL", "90210", "male", "2015-10-31", true);
	//var entity = new Encounter("Encounter", "", "finished", "emergency", "556", "2015-10-26T20:12:00-04:00", "2015-10-26T20:12:00-04:00", 4, 6);
	//fhir.insertOrUpdateResource(entity, function(resp) { response.send(resp);});

	//var condition = new Condition("", "556", "encounterId", "practitionerId", "display", "text", "clinicalStatus", "onsetDateTime");
	//var observation = new Observation("", "display", "eClass", "valueQuantity", "appliesDateTime", "status", "reliability", "subject", "encounter");

	//UPDATE

	//var entity = new Patient("Patient", "699", {"status":"generated","div":"<div><div class=\"hapiHeaderText\"> Josemaria L <b>DOLORES </b></div><table class=\"hapiPropertyTable\"><tbody><tr><td>Address</td><td><span>1234 Rocky Mountain Drive </span><br /><span>null </span><br /><span>Lincoln </span><span>IL </span></td></tr><tr><td>Date of birth</td><td><span>13 December 1922</span></td></tr></tbody></table></div>"},
	//"Dolores", ["Josemaria","L"], "home", "56 Flea Bottom", "Kings Landing", "IL", "90210", "male", "2015-10-31", true);
	//fhir.insertOrUpdateResource(entity, function(resp) { response.send(resp);});

	//There appears to be a bug with Encounter Update in the FHIR Server so this doesn't work.
	//var entity = new Encounter("Encounter", "7489", "finished", "emergency", "556", "2015-11-26T20:12:00-04:00", "2015-11-26T20:12:00-04:00", 4, 6);
	//fhir.insertOrUpdateResource(entity, function(resp) { response.send(resp);});

	//DELETE

	//var entity = new Patient("Patient", "696", {"status":"generated","div":"<div><div class=\"hapiHeaderText\"> Josemaria L <b>DOLORES </b></div><table class=\"hapiPropertyTable\"><tbody><tr><td>Address</td><td><span>1234 Rocky Mountain Drive </span><br /><span>null </span><br /><span>Lincoln </span><span>IL </span></td></tr><tr><td>Date of birth</td><td><span>13 December 1922</span></td></tr></tbody></table></div>"},
	//"Dolores", ["Josemaria","L"], "home", "56 Flea Bottom", "Kings Landing", "IL", "90210", "male", "2015-10-31", true);
	//fhir.deleteResource(entity, function(resp) { response.send(resp);});

});
app.listen(3000);
