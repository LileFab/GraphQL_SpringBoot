package graphql.project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class PlayerDAO {

    private List<Player> players;

    public PlayerDAO(List<Player> players) { this.players = players;}

    public List<Player> getAllPlayers() {
        return new ArrayList<>(this.players);
    }

    public Player addPlayer (Player player) {
    this.players.add(player);

    return player;}
}
