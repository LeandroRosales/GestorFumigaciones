package bussines_layer;

import java.time.LocalDate;

public class TaskDate {
	
	private LocalDate creationDate;
	private LocalDate finishDate;
	private LocalDate dueDate;
	private LocalDate lastUpdateDate;
	private Integer idTask;
	
	public TaskDate(LocalDate creationDate, LocalDate finishDate, LocalDate dueDate, LocalDate lastUpdateDate,
			Integer idTask) {
		super();
		this.creationDate = creationDate;
		this.finishDate = finishDate;
		this.dueDate = dueDate;
		this.lastUpdateDate = lastUpdateDate;
		this.idTask = idTask;
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

	public Integer getIdTask() {
		return idTask;
	}

	public void setIdTask(Integer idTask) {
		this.idTask = idTask;
	}
	
	
	
	
	
	

}
