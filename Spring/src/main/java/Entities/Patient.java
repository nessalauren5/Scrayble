package Entities;

import java.time.LocalTime;

import org.json.*;

public class Patient extends Entity {

	private static final String ACTIVE = "active";
	private static final String BIRTH_DATE = "birthDate";
	private static final String GENDER = "gender";
	private static final String ADDRESS = "address";
	private static final String NAME = "name";
	private static final String TEXT = "text";
	
	private User user;
	private String employer;
	private String employerAddress;
	private String emergencyContact;
	private String emergencyContactAddress;
	private double height;
	private double weight;
	private boolean isCaffeine;
	private boolean isTobacco;
	private boolean isAlcohol;
	private boolean isImmunized;
	private boolean wasHospitalized;
	private String homeNurseAide;
	private String language;
	private String emergencyContactRelation;
	private LocalTime lastHomeVisit;

	public Patient(String resourceType, String id,
			JSONObject text, Name name, Address address,
			String gender, String birthDate, boolean active) {
		
		super(resourceType, id, null);
		
		if(text != null) { super.entity.put(TEXT, text); }
		if(name != null) { super.entity.put(NAME, name.getJSONObject()); }
		if(address != null) { super.entity.put(ADDRESS, address.getJSONObject()); }
		super.entity.put(GENDER, gender);
		super.entity.put(BIRTH_DATE, birthDate);
		super.entity.put(ACTIVE, active);
	}
	
	public Patient(String json) {
		super(null, null, json);	
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getEmployerAddress() {
		return employerAddress;
	}

	public void setEmployerAddress(String employerAddress) {
		this.employerAddress = employerAddress;
	}

	public String getEmergencyContactAddress() {
		return emergencyContactAddress;
	}

	public void setEmergencyContactAddress(String emergencyContactAddress) {
		this.emergencyContactAddress = emergencyContactAddress;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isCaffeine() {
		return isCaffeine;
	}

	public void setCaffeine(boolean isCaffeine) {
		this.isCaffeine = isCaffeine;
	}

	public boolean isTobacco() {
		return isTobacco;
	}

	public void setTobacco(boolean isTobacco) {
		this.isTobacco = isTobacco;
	}

	public boolean isAlcohol() {
		return isAlcohol;
	}

	public void setAlcohol(boolean isAlcohol) {
		this.isAlcohol = isAlcohol;
	}

	public boolean isImmunized() {
		return isImmunized;
	}

	public void setImmunized(boolean isImmunized) {
		this.isImmunized = isImmunized;
	}

	public boolean isWasHospitalized() {
		return wasHospitalized;
	}

	public void setWasHospitalized(boolean wasHospitalized) {
		this.wasHospitalized = wasHospitalized;
	}

	public String getHomeNurseAide() {
		return homeNurseAide;
	}

	public void setHomeNurseAide(String homeNurseAide) {
		this.homeNurseAide = homeNurseAide;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getEmergencyContactRelation() {
		return emergencyContactRelation;
	}

	public void setEmergencyContactRelation(String emergencyContactRelation) {
		this.emergencyContactRelation = emergencyContactRelation;
	}

	public LocalTime getLastHomeVisit() {
		return lastHomeVisit;
	}

	public void setLastHomeVisit(LocalTime lastHomeVisit) {
		this.lastHomeVisit = lastHomeVisit;
	}

	public void sync(Patient patientFromFHIR) {
		if(patientFromFHIR == null) { return; }
		JSONObject text = patientFromFHIR.getText();
		if(text != null) { super.entity.put(TEXT, text); }
		JSONArray name = patientFromFHIR.getName();
		if(name != null) { super.entity.put(NAME, name); }
		JSONArray address = patientFromFHIR.getAddress();
		if(address != null) { super.entity.put(ADDRESS, address); }
		super.entity.put(GENDER, patientFromFHIR.getGender());
		super.entity.put(BIRTH_DATE, patientFromFHIR.getBirthDate());
		super.entity.put(ACTIVE, patientFromFHIR.isActive());
	}

	public JSONObject getText() { return (JSONObject) super.entity.get(TEXT); }
	public void setText(JSONObject text) { super.entity.put(TEXT, text); }

	public JSONArray getName() { return (JSONArray) super.entity.get(NAME); }
	public void setName(JSONArray name) { super.entity.put(NAME, name); }

	public JSONArray getAddress() { return (JSONArray) super.entity.get(ADDRESS); }
	public void setAddress(JSONArray address) { super.entity.put(ADDRESS, address); }

	public String getGender() { return super.entity.getString(GENDER); }
	public String getBirthDate() { return super.entity.getString(BIRTH_DATE); }
	public boolean isActive() { return super.entity.getBoolean(ACTIVE); }
}
