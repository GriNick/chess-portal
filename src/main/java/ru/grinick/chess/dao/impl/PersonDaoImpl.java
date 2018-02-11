package ru.grinick.chess.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import ru.grinick.chess.dao.PersonDao;
import ru.grinick.chess.model.Person;

@Component
public class PersonDaoImpl implements PersonDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public void add(Person person) {
		// TODO Auto-generated method stub
		// em.persist(person);

	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		// CriteriaQuery<Person> criteriaQuery =
		// em.getCriteriaBuilder().createQuery(Person.class);
		// @SuppressWarnings("unused")
		// Root<Person> root = criteriaQuery.from(Person.class);
		// criteriaQuery.return em.createQuery(criteriaQuery).getResultList();
		return null;
	}

	@Override
	@Transactional(isolation = Isolation.READ_UNCOMMITTED)
	public Person getPersonById(Integer personId) {
		// TODO Auto-generated method stub
		Person result = em.find(Person.class, personId);
		return result;
	}

}
