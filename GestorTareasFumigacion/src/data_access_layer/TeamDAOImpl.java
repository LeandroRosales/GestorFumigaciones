package data_access_layer;

import java.util.List;

import bussines_layer.Team;

/*el DAO de los equipos solo tienen la funcion de obtener, dado que suponemos
 * que los datos vienen del servidor de administracion
 */

public class TeamDAOImpl implements TeamDAO {
	
	List<Team> teamList;

	@Override
	public List<Team> getTeamList() {return teamList;} //retorna la lista de los equipos

	@Override
	public Team getTeamById(Integer id) {

		int i = 0;
		
		for(i=0;i<teamList.size();i++)
		{
			if(teamList.get(i).getIdTeam()==id)
			{
				break;
			}
		}
		
		return teamList.get(i); //retorna el equipo
		
	}
	
	

}
