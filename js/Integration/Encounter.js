function Encounter(id, status, eClass, patientId, periodStart, periodEnd, locationId, serviceProvider) {
	this.id = id;
	this.status = status;
	this.eClass = eClass;
	this.patientId = patientId;
	this.periodStart = periodStart;
	this.periodEnd = periodEnd;
	this.locationId = locationId;
	this.serviceProvider = serviceProvider;
};

Encounter.prototype.prettyPrint = function() {
	return "ID: " + this.id
	+ " Status: "+this.status
	+ " Class: "+this.eClass
	+ " Patient ID: "+this.patientId
	+ " Start Time: "+this.periodStart
	+ " End Time: "+this.periodEnd
	+ " Location ID: "+this.locationId
	+ " Service Provider: "+this.serviceProvider;
};

Encounter.prototype.jsonPrint = function() {
	return {	id: this.id,
				status: this.status,
				eClass: this.eClass,
				patientId: this.patientId,
				periodStart: this.periodStart,
				periodEnd: this.periodEnd,
				locationId: this.locationId,
				serviceProvider: this.serviceProvider
			};
};

Encounter.prototype.getEncounterByText = function getEncounterByText(text) {
	var encounter = JSON.parse(text);
	var id = encounter.id;
	var status = encounter.status;
	var eClass = encounter.class;
	var patientId = encounter.patient.reference.replace("Patient/","");
	var periodStart = encounter.period.start;
	var periodEnd = encounter.period.end;
	var locationId = encounter.location[0].location.reference.replace("Location/","");
	var serviceProvider = encounter.serviceProvider.reference.replace("Organization/","");
	return new Encounter(id, status, eClass, patientId, periodStart, periodEnd, locationId, serviceProvider);
};

module.exports = Encounter;

