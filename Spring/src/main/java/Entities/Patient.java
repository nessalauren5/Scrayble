package Entities;

import org.json.*;

public class Patient {

	private JSONObject patient;
	private String resourceType;
	private String id;
	private JSONObject text;
	private Name name;
	private Address address;
	private String gender;
	private String birthDate;
	private boolean active;

	public Patient(String resourceType, String id, JSONObject text, Name name, Address address,
			String gender, String birthDate, boolean active) {
		
		patient = new JSONObject();
		patient.put("resourceType", resourceType);
		if(id != "" && id != null) {
			patient.put("id", id);
		}
		if(text != null) {
			patient.put("text", text);
		}
		if(name != null) {
			patient.put("name", name.getJSONObject());
		}
		if(address != null) {
			patient.put("address", address.getJSONObject());
		}
		patient.put("gender", gender);
		patient.put("birthDate", birthDate);
		patient.put("active", active);
		
		this.resourceType = resourceType;
		this.id = id;
		this.text = text;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.birthDate = birthDate;
		this.active = active;
	}
	
	public JSONObject getJSONObject() {
		return patient;
	}
	
	public String prettyPrint() {
		String n = "";
		if(name != null) {
			n = this.name.prettyPrint();
		}
		String a = "";
		if(address != null) {
			a = this.address.prettyPrint();
		}
		String t = "";
		if(text != null) {
			t = " Text: " +  this.text.toString();
		}
		return "Resource Type: " + this.resourceType
				+ " ID: " + this.id
				+ t
				+ n
				+ a
				+ " Gender: " + this.gender
				+ " Birth Date: " + this.birthDate
				+ " Active: " + this.active;
	};

//	public String jsonPrint() {
//		String n = "";
//		if(name != null) {
//			n = ", " + "name: " + "[" + this.name.jsonPrint() + "]";
//		}
//		String a = "";
//		if(address != null) {
//			a = ", " + "address: " + "[" + this.address.jsonPrint() + "]";
//		}
//		String t = "";
//		if(text != null) {
//			t = ", " + "text: " + this.text.toString();
//		}
//		String output =  "{ resourceType: " + this.resourceType
//				+ ", " + "id: " + this.id
//				+ t
//				+ n
//				+ ", " + "gender: " + this.gender
//				+ ", " + "birthDate: " + this.birthDate
//				+ a
//				+ ", " + "active: " + this.active
//				+ "}";
//		if (this.id == 0) {
//			output =  "{ resourceType: " + this.resourceType
//					+ t
//					+ n
//					+ ", " + "gender: " + this.gender
//					+ ", " + "birthDate: " + this.birthDate
//					+ a
//					+ ", " + "active: " + this.active
//					+ "}";
//		}
//		return output;
//	}
		
	public static Patient getByText(String json) {
		JSONObject patient = new JSONObject(json);
		String resourceType = patient.getString("resourceType"); 
		String id = patient.getString("id"); 
		JSONObject text = patient.getJSONObject("text");
		String gender = patient.getString("gender"); 
		String birthDate = patient.getString("birthDate"); 
		boolean active = patient.getBoolean("active"); 
		
	  return new Patient(resourceType, id, text,
			  getFirstName(patient), getFirstAddress(patient),
			  gender, birthDate, active);
	}
	
	private static Name getFirstName(JSONObject json) {
		JSONArray arr = json.getJSONArray("name");
		for (int i = 0; i < arr.length();)
		{
		    return new Name(arr.getJSONObject(i).getJSONArray("family"), arr.getJSONObject(i).getJSONArray("given"));
		}
		return null;
	}
	
	private static Address getFirstAddress(JSONObject json) {
		JSONArray arr = json.getJSONArray("address");
		for (int i = 0; i < arr.length();)
		{
		    return new Address(arr.getJSONObject(i).getString("use"),
		    		arr.getJSONObject(i).getJSONArray("line"),
		    		arr.getJSONObject(i).getString("city"),
		    		arr.getJSONObject(i).getString("state"),
		    		arr.getJSONObject(i).getString("postalCode"));
		}
		return null;
	}
}
