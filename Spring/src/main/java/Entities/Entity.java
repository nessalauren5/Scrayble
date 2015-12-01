package Entities;

import org.json.JSONObject;

public abstract class Entity {

	protected JSONObject entity;
//	protected String resourceType;
//	protected String id;
	
	public Entity(String resourceType, String id, String json) {
		if(json != "" && json != null) {
			entity = new JSONObject(json);
		} else {
			entity = new JSONObject();
			entity.put("resourceType", resourceType);
			if(id != "" && id != null) {
				entity.put("id", id);
			}
		}
//		resourceType = resourceType;
//		id = id;
	}
	
	//Properties
	public String getResourceType() {
		return entity.getString("resourceType");
	}
//	public String getId() { return resourceType; }
	
	public JSONObject getJSONObject() {
		return entity;
	}
}
