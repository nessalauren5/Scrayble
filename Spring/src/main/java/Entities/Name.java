package Entities;

import org.json.JSONArray;
import org.json.JSONObject;

public class Name {

	private JSONObject name;
	private JSONArray given;
	private JSONArray family;

	public Name(String family, String given) {
		JSONArray g = new JSONArray();
		g.put(given);
		//JSONArray f = new JSONArray();
		//f.put(family);
		name = new JSONObject();
		name.put("famiy", family);
		name.put("given", g);
//		this.family = f;
//		this.given = g;
	}
	
//	public Name(JSONArray family, JSONArray given) {
//		name = new JSONObject();
//		name.put("famiy", family);
//		name.put("given", given);
//		this.family = family;
//		this.given = given;
//	}
	
	public JSONObject getJSONObject() {
		return name;
	}
	
//	public String prettyPrint() {
//		return "Given: " + this.given
//		+ " Family: " + this.family;
//	};
}
