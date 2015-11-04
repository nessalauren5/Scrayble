function Address(line, city, state, postalCode) {
	this.line = line;
	this.city = city;
	this.state = state;
	this.postalCode = postalCode;
};

Address.prototype.prettyPrint = function() {
	return "Street: " + this.line
	+ " City: " + this.city
	+ " State: " + this.state
	+ " Postal Code: " + this.postalCode;
};

Address.prototype.jsonPrint = function() {
	return { line: this.line,
				city: this.city,
				state: this.state,
				postalCode: this.postalCode
			};
};

module.exports = Address;
