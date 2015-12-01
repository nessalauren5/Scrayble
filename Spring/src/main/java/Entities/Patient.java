package Entities;

import org.json.*;

public class Patient extends Entity {

//	private JSONObject text;
//	private Name name;
//	private Address address;
//	private String gender;
//	private String birthDate;
//	private boolean active;

	public Patient(String resourceType, String id, JSONObject text, Name name, Address address,
			String gender, String birthDate, boolean active) {
		super(resourceType, id, null);
		if(text != null) {
			super.entity.put("text", text);
		}
		if(name != null) {
			super.entity.put("name", name.getJSONObject());
		}
		if(address != null) {
			super.entity.put("address", address.getJSONObject());
		}
		super.entity.put("gender", gender);
		super.entity.put("birthDate", birthDate);
		super.entity.put("active", active);
		
//		this.text = text;
//		this.name = name;
//		this.address = address;
//		this.gender = gender;
//		this.birthDate = birthDate;
//		this.active = active;
	}
	
	public Patient(String json) {
		super(null, null, json);
//		JSONObject text = super.entity.getJSONObject("text");
//		Name name = getFirstName(); 
//		Address address = getFirstAddress();
//		String gender = super.entity.getString("gender"); 
//		String birthDate = super.entity.getString("birthDate"); 
//		boolean active = super.entity.getBoolean("active");
	
		
//		if(text != null) {
//			super.entity.put("text", text);
//		}
//		if(name != null) {
//			super.entity.put("name", name.getJSONObject());
//		}
//		if(address != null) {
//			super.entity.put("address", address.getJSONObject());
//		}
//		super.entity.put("gender", gender);
//		super.entity.put("birthDate", birthDate);
//		super.entity.put("active", active);
	}
//	public String prettyPrint() {
//		
//		String n = "";
//		if(name != null) {
//			n = this.name.prettyPrint();
//		}
//		String a = "";
//		if(address != null) {
//			a = this.address.prettyPrint();
//		}
//		String t = "";
//		if(text != null) {
//			t = " Text: " +  this.text.toString();
//		}
//		return "Resource Type: " + this.resourceType
//				+ " ID: " + this.id
//				+ t
//				+ n
//				+ a
//				+ " Gender: " + this.gender
//				+ " Birth Date: " + this.birthDate
//				+ " Active: " + this.active;
//	};

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
	
//	private  Name getFirstName() {
//		JSONArray arr = super.entity.getJSONArray("name");
//		for (int i = 0; i < arr.length();)
//		{
//		    return new Name(arr.getJSONObject(i).getJSONArray("family"), arr.getJSONObject(i).getJSONArray("given"));
//		}
//		return null;
//	}
//	
//	private Address getFirstAddress() {
//		JSONArray arr = super.entity.getJSONArray("address");
//		for (int i = 0; i < arr.length();)
//		{
//		    return new Address(arr.getJSONObject(i).getString("use"),
//		    		arr.getJSONObject(i).getJSONArray("line"),
//		    		arr.getJSONObject(i).getString("city"),
//		    		arr.getJSONObject(i).getString("state"),
//		    		arr.getJSONObject(i).getString("postalCode"));
//		}
//		return null;
//	}
}
