package graphql.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphqlConfiguration {
    @Bean
    public PlayerDAO playerDAO() {
        List<Player> players = new ArrayList<>();
        for (int playerId = 0; playerId < 5; ++playerId) {
            Player player = new Player();
            player.setId("" + playerId);
            player.setName("Nom  " + playerId);
            player.setAge(playerId * 5);
            player.setHeight(playerId *10);
            player.setTeam("Team " + playerId);
            players.add(player);
        }
        return new PlayerDAO(players);
    }
}
