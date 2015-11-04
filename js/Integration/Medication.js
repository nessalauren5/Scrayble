function Medication(id, text, status, name, display) {
	this.id = id;
	this.text = text;
	this.status = status;
	this.name = name;
	this.display = display;
};

Medication.prototype.prettyPrint = function() {
	return "ID: " + this.id
	+ " Text: "+this.text
	+ " Status: "+this.status
	+ " Name: "+this.name
	+ " Display: "+this.display;
};

Medication.prototype.jsonPrint = function() {
	return {	id: this.id,
				text: this.text,
				status: this.status,
				name: this.name,
				display: this.display
			};
};

Medication.prototype.getMedicationByText = function getMedicationByText(text) {
	var medication = JSON.parse(text);
	var id = medication.id;
	var text = medication.text.div;
	var status = medication.text.status;
	var name = medication.name;
	var display = medication.code.coding[0].display;
	return new Medication(id, text, status, name, display);
};

module.exports = Medication;
