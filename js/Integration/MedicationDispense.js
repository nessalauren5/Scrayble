function MedicationDispense(id, patientId, quantity, daysSupply, medicationId, whenPrepared) {
	this.id = id;
	this.patientId = patientId;
	this.quantity = quantity;
	this.daysSupply = daysSupply;
	this.medicationId = medicationId;
	this.whenPrepared = whenPrepared;
};

MedicationDispense.prototype.prettyPrint = function() {
	return "ID: " + this.id
	+ " Patient ID: "+this.patientId
	+ " Quantity: "+this.quantity
	+ " Days Supply: "+this.daysSupply
	+ " Medication ID: "+this.medicationId
	+ " When Prepared: "+this.whenPrepared;
};

MedicationDispense.prototype.jsonPrint = function() {
	return {	id: this.id,
				patientId: this.patientId,
				quality: this.quality,
				daysSupply: this.daysSupply,
				medicationId: this.medicationId,
				whenPrepared: this.whenPrepared
			};
};

MedicationDispense.prototype.getMedicationDispenseByText = function getMedicationDispenseByText(text) {
	var md = JSON.parse(text);
	var id = md.id;
	var patientId = md.patient.reference.replace("Patient/","");
	var quantity = md.quantity.value;
	var daysSupply = md.daysSupply.value;
	var medicationId = md.medication.reference.replace("Medication/","");
	var whenPrepared = md.whenPrepared;
	return new MedicationDispense(id, patientId, quantity, daysSupply, medicationId, whenPrepared);
};

module.exports = MedicationDispense;
