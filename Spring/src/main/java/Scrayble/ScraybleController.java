package Scrayble;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

import Entities.*;
import Fhir.*;

@RestController
public class ScraybleController {
	
	private Users users = Users.GetUsers();
	private Patients patients = Patients.GetPatients();
	private CarePlans carePlans = CarePlans.GetCarePlans();
	
	private void initializeDummyData() {
		users.put("Bill", new User("Bill", "Bill Patient", "Bill", "Patient"));
		users.put("Sally", new User("Sally", "Sally Aide", "Sally", "Aide"));
		users.put("Peter", new User("Peter", "Peter Primary", "Peter", "PCP"));
		users.put("Sandra", new User("Sandra", "Sandra Specialist", "Sandra", "Specialist"));
		Patient p = new Patient("Patient", "", null, new Name("Patient", "Bill"),
				new Address("home", "123 Alzheimers Lane", "Atlanta", "GA", "90210"),
				"male", "2015-12-01", true);
		String billId = GaTechProxy.post(p);
		patients.put(billId, p);
		
		//Associate Bill the user with Bill the Patient.
		p.setUser(users.get("Bill"));
		
		//Associate Bill with his Care Plan.
		carePlans.put(billId, new CarePlan(p));	}

	public ScraybleController() {
		initializeDummyData();
	}

	@RequestMapping(value = "/user/login", method=RequestMethod.GET)
	public String userLogin() {
    	return "User Login";
    }

    @RequestMapping(value = "/user/logout", method=RequestMethod.GET)
	public String userLogout() {
    	return "User Logout";
    }

    @RequestMapping(value = "/user/{userName}", method=RequestMethod.GET)
	public String getUserByName(@PathVariable("userName") String userName) {
    	return "Get User By User Name";
    }

    @RequestMapping(value = "/user/{userName}", method=RequestMethod.POST)
	public String updateUserByName(@PathVariable("userName") String userName) {
    	return "Update User By User Name";
    }

    @RequestMapping(value = "/user/{userName}", method=RequestMethod.DELETE)
	public String deleteUserByName(@PathVariable("userName") String userName) {
    	return "Delete User By User Name";
    }

    @RequestMapping(value = "/Condition/{Id}", method=RequestMethod.GET)
	public String getCondition(@PathVariable("Id") String id) {
    	//String json = GaTechProxy.get("Patient", id);
    	return "Condition: " + id;
    }

    @RequestMapping(value = "/Encounter/{Id}", method=RequestMethod.GET)
	public String getEncounter(@PathVariable("Id") String id) {
    	//String json = GaTechProxy.get("Patient", id);
    	return "Encounter: " + id;
    }

    @RequestMapping(value = "/Medication/{Id}", method=RequestMethod.GET)
	public String getMedication(@PathVariable("Id") String id) {
    	//String json = GaTechProxy.get("Patient", id);
    	return "Medication: " + id;
    }

    @RequestMapping(value = "/MedicationDispense/{Id}", method=RequestMethod.GET)
	public String getMedicationDispense(@PathVariable("Id") String id) {
    	//String json = GaTechProxy.get("Patient", id);
    	return "MedicationDispense: " + id;
    }

    @RequestMapping(value = "/MedicationPrescription/{Id}", method=RequestMethod.GET)
	public String getMedicationPrescription(@PathVariable("Id") String id) {
    	//String json = GaTechProxy.get("Patient", id);
    	return "MedicationPrescription: " + id;
    }

    @RequestMapping(value = "/Observation/{Id}", method=RequestMethod.GET)
	public String getObservation(@PathVariable("Id") String id) {
    	//String json = GaTechProxy.get("Patient", id);
    	return "Observation: " + id;
    }

    @RequestMapping(value = "/Patient/{Id}", method=RequestMethod.GET)
	public String getPatient(@PathVariable("Id") String id) {
    	String json = GaTechProxy.get("Patient", id);
    	return new Patient(json).getJSONObject().toString();
    }

    @RequestMapping(value = "/Patient/{Id}/CarePlan", method=RequestMethod.GET)
	public String getPatientCarePlan(@PathVariable("Id") String id) {
    	//String json = GaTechProxy.get("Patient", id);
    	return "Get Care Plan for Patient with ID: " + id + " from DB and send back to UI.";
    }

    @RequestMapping(value = "/Patient?family={Family}&given={Given}&"
    		+ "use={Use}&line={Line}&city={City}&state={State}&postalCode={postalCode}&"
    		+ "gender={Gender}&birthDate={birthDate}", method=RequestMethod.POST)
	public String createPatient(
			@PathVariable("Family") String family,
			@PathVariable("Given") String given,
			@PathVariable("Use") String use,
			@PathVariable("Line") String line,
			@PathVariable("City") String city,
			@PathVariable("State") String state,
			@PathVariable("PostalCode") String postalCode,
			@PathVariable("Gender") String gender,
			@PathVariable("BirthDate") String birthDate) {
//		Patient p = new Patient("Patient", "", null, new Name(family, given),
//				new Address(use, line, city, state, postalCode),
//				gender, birthDate, true);
//		return GaTechProxy.post(p);
    	return "";
    }
    
    @RequestMapping(value = "/Patient/Test", method=RequestMethod.POST)
	public String createPatientTest() {
		Patient p = new Patient("Patient", "", null, new Name("Patient", "Bill"),
				new Address("home", "123 Alzheimers Lane", "Atlanta", "GA", "90210"),
				"male", "2015-12-01", true);
		return GaTechProxy.post(p);
    }
}