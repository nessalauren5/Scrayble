package Entities;

import java.time.LocalTime;

import org.json.*;

public class Patient extends Entity {

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
		
		if(text != null) { super.entity.put("text", text); }
		if(name != null) { super.entity.put("name", name.getJSONObject()); }
		if(address != null) { super.entity.put("address", address.getJSONObject()); }
		super.entity.put("gender", gender);
		super.entity.put("birthDate", birthDate);
		super.entity.put("active", active);
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
}
