package ru.grinick.chess.dao;

import java.util.List;

import ru.grinick.chess.model.Player;

public interface PlayerDao {
	   Player add(Player player);
	   List<Player> getAllPlayers();
	   Player getPlayerById(Integer playerId);
}
