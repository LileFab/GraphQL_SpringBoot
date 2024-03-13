package graphql.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class PlayerController {

    @Autowired
    private PlayerDAO playerDAO;

    public PlayerController() {}

    @QueryMapping
    public List<Player> getAllPlayers() {
        return this.playerDAO.getAllPlayers();
    }

    @MutationMapping
    public Player addPlayer(@Argument String id, @Argument String name, @Argument Integer age, @Argument Integer height, @Argument String team) {
        Player player = new Player();
        player.setId(id);
        player.setName(name);
        player.setAge(age);
        player.setHeight(height);
        player.setTeam(team);

        return playerDAO.addPlayer(player);
    }
}
