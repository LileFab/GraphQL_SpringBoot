package graphql.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class TeamController {

    @Autowired
    private TeamDAO teamDAO;

    public TeamController() {}

    @QueryMapping
    public List<Team> getAllTeams() {
        return this.teamDAO.getAllTeams();
    }

    @MutationMapping
    public Team addTeam(@Argument String id, @Argument String name, @Argument String city, @Argument String creationDate) {
        Team team = new Team();
        team.setId(id);
        team.setName(name);
        team.setCity(city);
        team.setCreationDate(creationDate);

        return teamDAO.addTeam(team);
    }
}
