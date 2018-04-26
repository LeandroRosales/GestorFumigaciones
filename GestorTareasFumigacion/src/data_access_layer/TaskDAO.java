package data_access_layer;

import java.util.List;

import bussines_layer.Task;
import user_interface_layer.TaskDTO;

public interface TaskDAO {
	
	public List<Task> getTaskList();
	public Task getTaskById(Integer id);
	public void createTask(Task task);
	public void updateTask(Task task, TaskDTO changeTask);
	public void deleteTask(Task task);
	

}
