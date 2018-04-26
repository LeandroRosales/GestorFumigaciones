package user_interface_layer;

import java.time.LocalDate;

import bussines_layer.Employee;
import bussines_layer.Location;
import bussines_layer.Team;

public class TaskDTO {
	
	private Integer idTask;
	private Team team;
	private String product;
	private Location location;
	private Boolean status;
	private Employee assingnedWorker;
	private Integer progress;
	private LocalDate creationDate;
	private LocalDate finishDate;
	private LocalDate dueDate;
	private LocalDate lastUpdateDate;
	
	
	public Integer getIdTask() {
		return idTask;
	}
	public void setIdTask(Integer idTask) {
		this.idTask = idTask;
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
	public Integer getProgress() {
		return progress;
	}
	public void setProgress(Integer progress) {
		this.progress = progress;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDate getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public LocalDate getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(LocalDate lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	
	

}
