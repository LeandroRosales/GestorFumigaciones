package bussines_layer;

import java.util.List;

public class Team {
	
	private Integer idTeam;
	private Employee teamLeader;
	private List<Employee> crew;
	
	public Team(Integer idTeam, Employee teamLeader, List<Employee> crew) {
		super();
		this.idTeam = idTeam;
		this.teamLeader = teamLeader;
		this.crew = crew;
	}

	public Integer getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(Integer idTeam) {
		this.idTeam = idTeam;
	}

	public Employee getTeamLeader() {
		return teamLeader;
	}

	public void setTeamLeader(Employee teamLeader) {
		this.teamLeader = teamLeader;
	}

	public List<Employee> getCrew() {
		return crew;
	}

	public void setCrew(List<Employee> crew) {
		this.crew = crew;
	}	

}
