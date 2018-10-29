package ru.grinick.chess.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.grinick.chess.dao.PersonDao;
import ru.grinick.chess.dao.PersonRepository;
import ru.grinick.chess.model.Person;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	PersonDao personDao;
	
	public Person getPersonById(Integer personId) {
		//return personDao.getPersonById(personId);
		return personRepository.findById(Long.valueOf(personId)).orElse(null);
	}
	
	public Person addPerson(Person person) {
		//return personDao.add(person);
		return personRepository.save(person);
	}
	
	public List<Person> getAllPersons() {
		return personDao.getAllPersons();
		//return personRepository.findAll();
	}
}
