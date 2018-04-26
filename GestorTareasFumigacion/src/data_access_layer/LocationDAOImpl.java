package data_access_layer;

import java.util.List;

import bussines_layer.Location;
import user_interface_layer.LocationDTO;

public class LocationDAOImpl implements LocationDAO {
	
	List<Location> locationList;

	@Override
	public List<Location> getLocationList() {return locationList;} //retorna la lista de ubicaciones

	@Override
	public Location getLocationById(Integer id) {
		
		int i = 0;
		
		for(i=0;i<locationList.size();i++)
		{
			if(locationList.get(i).getIdTask()==id)
			{
				break;
			}
		}
		return locationList.get(i);
	}

	@Override
	public void createLocation(Location location) {
		
		for(int i=0;i<locationList.size();i++)
		{
			if(locationList.get(i).getIdTask()==location.getIdTask())
			{
				System.out.println("La tarea ya tiene una ubicacion predeterminada. Tarea Nro: " +locationList.get(i).getIdTask());
				System.out.println("Puede ir a modificaciones, para modificar la misma");
			}
			else
			{
				locationList.add(location);
			}
		}
		
	}

	@Override
	public void updateLocation(Location location, LocationDTO changeLocation) {
		
		for(int i=0;i<locationList.size();i++)
		{
			if(locationList.get(i).getIdTask()==location.getIdTask())
			{
				locationList.get(i).setLatitude(changeLocation.getLatitude());
				locationList.get(i).setLongitude(changeLocation.getLongitude());
				
			}
		}
		
	}

	@Override
	public void deleteLocation(Location location) {
		
		for(int i=0;i<locationList.size();i++)
		{
			if(locationList.get(i).getIdTask()==location.getIdTask())
			{
				locationList.remove(i);
			}
		}
		
	}

}
