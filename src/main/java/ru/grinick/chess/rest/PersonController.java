package ru.grinick.chess.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ru.grinick.chess.model.Person;
import ru.grinick.chess.services.PersonService;
 
 
@RestController
@CrossOrigin
public class PersonController {
	
	@Autowired
	PersonService personService;
  
    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<Person> getAllPersons() {
    	return personService.getAllPersons();
    }
 
    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable Integer personId) {
    	return personService.getPersonById(personId);
    }
    
    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public Person addPerson(@RequestBody Person person) {
    	return personService.addPerson(person);
    }
}
