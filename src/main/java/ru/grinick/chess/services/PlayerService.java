package ru.grinick.chess.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.grinick.chess.dao.PlayerDao;
import ru.grinick.chess.model.Player;

@Service
public class PlayerService {
	
	@Autowired
	PlayerDao playerDao;
	
	public Player getPlayerById(Integer playerId) {
		return playerDao.getPlayerById(playerId);
	}
	
	public Player addPlayer(Player player) {
		return playerDao.add(player);
	}
	
	public List<Player> getAllPlayers() {
		return playerDao.getAllPlayers();
	}
}
