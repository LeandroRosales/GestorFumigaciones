package data_access_layer;

import java.util.List;

import bussines_layer.Location;
import user_interface_layer.LocationDTO;

public interface LocationDAO {
	
	public List<Location> getLocationList();
	public Location getLocationById(Integer id);
	public void createLocation(Location location);
	public void updateLocation(Location location, LocationDTO changeLocation);
	public void deleteLocation(Location location);

}
