package ru.grinick.chess.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.grinick.chess.model.Player;
import ru.grinick.chess.services.PlayerService;
 
 
@RestController
@CrossOrigin
public class PlayerController {
	
	@Autowired
	PlayerService playerService;
  
    @RequestMapping(value = "/player", method = RequestMethod.GET)
    public List<Player> getAllPlayers() {
    	return playerService.getAllPlayers();
    }
 
    @RequestMapping(value = "/player/{playerId}", method = RequestMethod.GET)
    public Player getPlayer(@PathVariable Integer playerId) {
    	return playerService.getPlayerById(playerId);
    }
    
    @RequestMapping(value = "/player", method = RequestMethod.POST)
    public Player addPlayer(@RequestBody Player player) {
    	return playerService.addPlayer(player);
    }
}
