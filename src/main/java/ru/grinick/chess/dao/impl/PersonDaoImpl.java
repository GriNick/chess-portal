package ru.grinick.chess.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
	@Transactional(isolation=Isolation.SERIALIZABLE)
	public Person add(Person person) {
		em.persist(person);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return person;

	}

	@Override
	public List<Person> getAllPersons() {
		CriteriaQuery<Person> criteriaQuery = em.getCriteriaBuilder().createQuery(Person.class);
		@SuppressWarnings("unused")
		Root<Person> root = criteriaQuery.from(Person.class);
		return em.createQuery(criteriaQuery).getResultList();
	}

	@Override
	public Person getPersonById(Integer personId) {
		Person result = em.find(Person.class, personId);
		return result;
	}

}
