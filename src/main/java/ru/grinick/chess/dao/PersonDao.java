package ru.grinick.chess.dao;

import java.util.List;

import ru.grinick.chess.model.Person;

public interface PersonDao {
	   void add(Person person);
	   List<Person> getAllPersons();
	   Person getPersonById(Integer personId);
}
