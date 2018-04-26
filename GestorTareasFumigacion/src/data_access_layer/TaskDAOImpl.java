package data_access_layer;

import java.util.List;

import bussines_layer.Task;
import user_interface_layer.TaskDTO;

public class TaskDAOImpl implements TaskDAO{
	
	List<Task> taskList;

	@Override
	public List<Task> getTaskList() {return taskList;} //retorna la lista de tareas completa

	@Override
	public Task getTaskById(Integer id) {
		
		int i = 0;
		
		for(i=0;i<taskList.size();i++)
		{
			if(taskList.get(i).getIdTask()==id)
			{
				break;
			}
		}
		
		return taskList.get(i);
		
	} //retorna de la lista por id

	@Override
	public void createTask(Task task) {
		
		if(taskList.contains(task)==false) {taskList.add(task);} //añade a la lista
		
	}

	@Override
	public void updateTask(Task task, TaskDTO changeTask) {  //modifica o actualiza la tarea
		
		for(int i=0;i<taskList.size();i++)
		{
			if(taskList.get(i).getIdTask()==task.getIdTask())
			{
				taskList.get(i).setAssingnedWorker(changeTask.getAssingnedWorker());
				taskList.get(i).setLocation(changeTask.getLocation());
				taskList.get(i).setProduct(changeTask.getProduct());
				taskList.get(i).setStatus(changeTask.getStatus());
				taskList.get(i).setTeam(changeTask.getTeam());
				taskList.get(i).setProgress(changeTask.getProgress());
				
			}
		}
		
		
		
	}

	@Override
	public void deleteTask(Task task) {    //elimina la tarea
		
		for(int i=0;i<taskList.size();i++)
		{
			if(taskList.get(i).getIdTask()==task.getIdTask())
			{
				taskList.remove(i);
			}
		}
		
	}
}
