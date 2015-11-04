function Observation(id, display, eClass, valueQuantity,
		appliesDateTime, status, reliability, subject, encounter) {
	this.id = id;
	this.display = display;
	this.eClass = eClass;
	this.valueQuantity = valueQuantity;
	this.appliesDateTime = appliesDateTime;
	this.status = status;
	this.reliability = reliability;
	this.subject = subject;
	this.encounter = encounter;
};

Observation.prototype.prettyPrint = function() {
	return "ID: " + this.id
	+ " Display: "+this.display
	+ " Class: "+this.eClass
	+ " Value Quantity: "+this.valueQuantity
	+ " Applies Date Time: "+this.appliesDateTime
	+ " Status: "+this.status
	+ " Reliability: "+this.reliability
	+ " Patient ID: "+this.subject
	+ " Encounter ID: "+this.encounter;
};

Observation.prototype.jsonPrint = function() {
	return {	id: this.id,
				display: this.display,
				eClass: this.eClass,
				valueQuantity: this.valueQuantity,
				appliesDateTime: this.appliesDateTime,
				status: this.status,
				reliability: this.reliability,
				patientId: this.subject,
				encounter: this.encounter
			};
};

Observation.prototype.getObservationByText = function getObservationByText(text) {
	var observation = JSON.parse(text);
	var id = observation.id;
	var display = observation.code.coding[0].display;
	var eClass = observation.class;
	var valueQuantity = observation.valueQuantity.value+" "+observation.valueQuantity.units;
	var appliesDateTime = observation.appliesDateTime;
	var status = observation.status;
	var reliability = observation.reliability;
	var subject = observation.subject.reference.replace("Patient/","");
	var encounter = observation.encounter.reference.replace("Encounter/","");
	return new Observation(id, display, eClass, valueQuantity, appliesDateTime, status, reliability, subject, encounter);
};

module.exports = Observation;

