package data_access_layer;

import java.util.List;

import bussines_layer.Team;

public interface TeamDAO {
	
	public List<Team> getTeamList();
	public Team getTeamById(Integer id);

}
