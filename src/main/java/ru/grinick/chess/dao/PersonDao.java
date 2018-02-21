package ru.grinick.chess.dao;

import java.util.List;

import ru.grinick.chess.model.Person;

public interface PersonDao {
	   Person add(Person person);
	   List<Person> getAllPersons();
	   Person getPersonById(Integer personId);
}
