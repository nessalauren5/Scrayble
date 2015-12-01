package Entities;

import org.json.JSONArray;
import org.json.JSONObject;

public class Name {

	private JSONObject name;
	private JSONArray given;
	private JSONArray family;
	
	public Name(JSONArray family, JSONArray given) {
		name = new JSONObject();
		name.put("famiy", family);
		name.put("given", given);
		this.family = family;
		this.given = given;
	}
	
	public JSONObject getJSONObject() {
		return name;
	}
	
	public String prettyPrint() {
		return "Given: " + this.given
		+ " Family: " + this.family;
	};

	//public String jsonPrint() {
	//	return name.toString();
//		return "{ given: " + this.given
//				+ ", " + "family: " + this.family
//				+ "}";
	//};

}
