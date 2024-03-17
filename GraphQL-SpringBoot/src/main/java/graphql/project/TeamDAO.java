package graphql.project;

import java.util.ArrayList;
import java.util.List;


public class TeamDAO {

    private List<Team> teams;

    public TeamDAO(List<Team> teams) { this.teams = teams;}

    public List<Team> getAllTeams() {
        return new ArrayList<>(this.teams);
    }

    public Team addTeam (Team team) {
        this.teams.add(team);

        return team;}
}
