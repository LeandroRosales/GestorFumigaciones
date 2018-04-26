package data_access_layer;

import java.util.List;

import bussines_layer.TaskDate;
import user_interface_layer.TaskDTO;

public interface TaskDateDAO {
	
	public List<TaskDate> getTaskDateList();
	public TaskDate getTaskDateById(Integer id);
	public void createTaskDate(TaskDate taskDate);
	public void updateTaskDate(TaskDate taskDate, TaskDTO changeTask);
	public void deleteTaskDate(TaskDate taskDate);

}
