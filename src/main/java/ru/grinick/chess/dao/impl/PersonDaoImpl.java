package ru.grinick.chess.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ru.grinick.chess.dao.PersonDao;
import ru.grinick.chess.model.Person;

@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {
    @PersistenceContext
    private EntityManager em;
    
	@Override
	public void add(Person person) {
		// TODO Auto-generated method stub
		em.persist(person);

	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
	      CriteriaQuery<Person> criteriaQuery = em.getCriteriaBuilder().createQuery(Person.class);
	      @SuppressWarnings("unused")
	      Root<Person> root = criteriaQuery.from(Person.class);
	      return em.createQuery(criteriaQuery).getResultList();
	}

	@Override
	public Person getPersonById(Integer personId) {
		// TODO Auto-generated method stub
		return em.find(Person.class, personId);
	}

}
