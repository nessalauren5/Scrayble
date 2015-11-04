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
	//fhir.getResourceById("Encounter", "7346", function(resp) { response.send(resp.prettyPrint());});
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

	var patient = new Patient("Patient", "", {"status":"generated","div":"//<div><div class=\"hapiHeaderText\"> Josemaria L <b>DOLORES </b></div><table class=\"hapiPropertyTable\"><tbody><tr><td>Address</td><td><span>1234 Rocky Mountain Drive </span><br /><span>null </span><br /><span>Lincoln </span><span>IL </span></td></tr><tr><td>Date of birth</td><td><span>13 December 1922</span></td></tr></tbody></table></div>"},
	"Dolores", ["Josemaria","L"], "47 Flea Bottom", "Kings Landing", "Kings Landing", "90210", "male", "2015-10-31", true);
	fhir.postResource(patient, function(resp) { response.send(resp);});

	//var encounter = new Encounter("", "status", "eClass", "556", "periodStart", "periodEnd", "locationId", "serviceProvider");
	//fhir.postResourceById("Encounter", null, function(resp) { response.send(resp);});

	//var condition = new Condition("", "556", "encounterId", "practitionerId", "display", "text", "clinicalStatus", "onsetDateTime");
	//fhir.postResourceById("Condition", null, function(resp) { response.send(resp);});

	//var observation = new Observation("", "display", "eClass", "valueQuantity", "appliesDateTime", "status", "reliability", "subject", "encounter");
	//fhir.postResourceById("Observation", null, function(resp) { response.send(resp);});

	//fhir.postResourceById("Medication", null, function(resp) { response.send(resp);});
	//fhir.postResourceById("MedicationDispense", null, function(resp) { response.send(resp);});
	//fhir.postResourceById("MedicationPrescription", null, function(resp) { response.send(resp);});

	//UPDATE

	//var patient = new Patient("556", "Josemaria", "Dolores", "47 Westeros Drive", "Male", "2015-10-31");
	//fhir.postResourceById(patient, patient.id, function(resp) { response.send(resp);});
	//fhir.postResourceById("Encounter", null, function(resp) { response.send(resp);});
	//fhir.postResourceById("Condition", null, function(resp) { response.send(resp);});
	//fhir.postResourceById("Observation", null, function(resp) { response.send(resp);});
	//fhir.postResourceById("Medication", null, function(resp) { response.send(resp);});
	//fhir.postResourceById("MedicationDispense", null, function(resp) { response.send(resp);});
	//fhir.postResourceById("MedicationPrescription", null, function(resp) { response.send(resp);});

	//DELETE

	//TODO

});
app.listen(3000);
