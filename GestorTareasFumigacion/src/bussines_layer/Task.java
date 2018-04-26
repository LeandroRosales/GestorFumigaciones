package bussines_layer;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;

import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

public class Task implements JSONStreamAware{
	
	private Integer idTask;  
	private Team team;		
	private String product; 
	private Location location; 
	private Boolean status;				
	private Employee assingnedWorker;
	private Integer progress;
	private Boolean sync;
	
	public Task(Integer idTask, Team team, String product, Location location, Boolean status,
			Employee assingnedWorker, Integer progress, Boolean sync) {
		super();
		this.idTask = idTask;
		this.team = team;
		this.product = product;
		this.location = location;
		this.status = status;
		this.assingnedWorker = assingnedWorker;
		this.progress = progress;
		this.sync = sync;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Employee getAssingnedWorker() {
		return assingnedWorker;
	}

	public void setAssingnedWorker(Employee assingnedWorker) {
		this.assingnedWorker = assingnedWorker;
	}

	public Integer getIdTask() {
		return idTask;
	}

	public void setIdTask(Integer idTask) {
		this.idTask = idTask;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public Boolean getSync() {
		return sync;
	}

	public void setSync(Boolean sync) {
		this.sync = sync;
	}

	@Override
	public void writeJSONString(Writer out) throws IOException {
		
		LinkedHashMap<String, String> obj = new LinkedHashMap<String, String>();
		obj.put("idTask", String.valueOf(idTask) );
		obj.put("product", product);
		obj.put("status", String.valueOf(status) );
		obj.put("progress", String.valueOf(progress) );
		obj.put("sync", String.valueOf(sync) );
		JSONValue.writeJSONString(obj, out);
	}
	
	
	
	
	
	

}

