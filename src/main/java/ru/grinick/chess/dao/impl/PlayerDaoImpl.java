package ru.grinick.chess.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import ru.grinick.chess.dao.PlayerDao;
import ru.grinick.chess.model.Player;

@Component
public class PlayerDaoImpl implements PlayerDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional(isolation=Isolation.SERIALIZABLE)
	public Player add(Player player) {
		em.persist(player);
		return player;
	}

	@Override
	public List<Player> getAllPlayers() {
		CriteriaQuery<Player> criteriaQuery = em.getCriteriaBuilder().createQuery(Player.class);
		@SuppressWarnings("unused")
		Root<Player> root = criteriaQuery.from(Player.class);
		return em.createQuery(criteriaQuery).getResultList();
	}

	@Override
	public Player getPlayerById(Integer playerId) {
		Player result = em.find(Player.class, playerId);
		return result;
	}

}
