package Scrayble;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

import Entities.*;
import Fhir.*;

@RestController
public class HelloController {
    	
    @RequestMapping(value = "/Get/{Resource}/{Id}", method=RequestMethod.GET)
	public String getResource(@PathVariable("Resource") String resource, @PathVariable("Id") String id) {
    	String json = GaTechProxy.get(resource, id);
    	if(resource.equalsIgnoreCase("Patient")) {
    		return new Patient(json).getJSONObject().toString();
    	}
    	return "";
    }

//    @RequestMapping(value = "/Create/Patient?family={Family}&given={Given}&"
//    		+ "use={Use}&line={Line}&city={City}&state={State}&postalCode={postalCode}&"
//    		+ "gender={Gender}&birthDate={birthDate}", method=RequestMethod.POST)
//	public String createPatient(
//			@PathVariable("Family") String family,
//			@PathVariable("Given") String given,
//			@PathVariable("Use") String use,
//			@PathVariable("Line") String line,
//			@PathVariable("City") String city,
//			@PathVariable("State") String state,
//			@PathVariable("PostalCode") String postalCode,
//			@PathVariable("Gender") String gender,
//			@PathVariable("BirthDate") String birthDate) {
//		Patient p = new Patient("Patient", "", null, new Name(family, given),
//				new Address(use, line, city, state, postalCode),
//				gender, birthDate, true);
//		return GaTechProxy.post(p);
//    }
    
    @RequestMapping(value = "/Create/Patient", method=RequestMethod.POST)
	public String createPatient2() {
		Patient p = new Patient("Patient", "", null, new Name("Jones", "Miller"),
				new Address("home", "56FleaBottom", "KingsLanding", "NJ", "90210"),
				"male", "2015-12-01", true);
		return GaTechProxy.post(p);
    }
}