package ru.grinick.chess.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ru.grinick.chess.model.Person;
import ru.grinick.chess.services.PersonService;
 
 
@RestController
public class MainController {
	
	@Autowired
	PersonService personService;
 
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
    	return "Welcome to my rest service";
    }
 
    @CrossOrigin
    @RequestMapping(value = "/person/{personId}")
    public Person getPerson(@PathVariable Integer personId) {
    	return personService.getPersonById(personId);
    }
}
