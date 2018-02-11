package ru.grinick.chess.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ru.grinick.chess.dao.PersonDao;
import ru.grinick.chess.model.Person;

@Service
public class PersonService {
	
	@Autowired
	PersonDao personDao;
	
	public Person getPersonById(Integer personId) {
		return personDao.getPersonById(personId);
	}
}
