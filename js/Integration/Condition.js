function Condition(id, patientId, encounterId, practitionerId,
	display, text, clinicalStatus, onsetDateTime) {
	this.id = id;
	this.patientId = patientId;
	this.encounterId = encounterId;
	this.practitionerId = practitionerId;
	this.display = display;
	this.text = text;
	this.clinicalStatus = clinicalStatus;
	this.onsetDateTime = onsetDateTime;
};

Condition.prototype.prettyPrint = function() {
	return "ID: " + this.id
	+ " Patient ID: "+this.patientId
	+ " Encounter ID: "+this.encounterId
	+ " Practitioner ID: "+this.practitionerId
	+ " Display: "+this.display
	+ " Text: "+this.text
	+ " Clinical Status: "+this.clinicalStatus
	+ " Onset Date & Time: "+this.onsetDateTime;
};

Condition.prototype.jsonPrint = function() {
	return {	id: this.id,
				patientId: this.patientId,
				encounterId: this.encounterId,
				practitionerId: this.practitionerId,
				display: this.display,
				text: this.text,
				clinicalStatus: this.clinicalStatus,
				onsetDateTime: this.onsetDateTime
			};
};

Condition.prototype.getConditionByText = function getConditionByText(text) {
	var condition = JSON.parse(text);
	var id = condition.id;
	var patientId = condition.patient.reference.replace("Patient/","");
	var encounterId = condition.encounter.reference.replace("Encounter/","");
	var practitionerId = condition.asserter.reference.replace("Practitioner/","");
	var display = condition.code.coding[0].display;
	var text = condition.text;
	var clinicalStatus = condition.clinicalStatus;
	var onsetDateTime = condition.onsetDateTime;
	return new Condition(id, patientId, encounterId, practitionerId, display, text, clinicalStatus, onsetDateTime);
};

module.exports = Condition;
