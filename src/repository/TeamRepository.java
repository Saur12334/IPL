package repository;

import entity.Team;

public class TeamRepository {

	// should return MI team details
	public static Team getMITeamDetails() {
	Team team = new Team();
	team.setId (101);
	team.setTeamName("Mumbai Indian");
	team.setCaptainName("Hardik Pandya");
	team.setCoachName("jayawardhane");
	team.setQualified(false);
	team.setnRR(2.3f);
	return team;
}
	
	
}
