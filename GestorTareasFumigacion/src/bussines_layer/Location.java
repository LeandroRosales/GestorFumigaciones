package bussines_layer;

public class Location {
	
	private String longitude;
	private String latitude;
	private Integer idTask;
	
	public Location(String longitude, String latitude, Integer idTask) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.idTask = idTask;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Integer getIdTask() {
		return idTask;
	}

	public void setIdTask(Integer idTask) {
		this.idTask = idTask;
	}
	
	
	
	

}
