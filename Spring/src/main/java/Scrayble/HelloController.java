package Scrayble;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

import Entities.*;
import Fhir.*;

@RestController
public class HelloController {
    
    @RequestMapping(value = "/Get/{Resource}/{Id}", method=RequestMethod.GET)
	public String index(@PathVariable("Resource") String resource, @PathVariable("Id") String id) {
		return Patient.getByText(GaTechProxy.get(resource, id)).getJSONObject().toString();
		//return "Greetings from Spring Boot!";
    }
}