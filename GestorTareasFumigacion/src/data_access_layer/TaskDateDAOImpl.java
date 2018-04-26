package data_access_layer;

import java.util.List;

import bussines_layer.TaskDate;
import user_interface_layer.TaskDTO;

public class TaskDateDAOImpl implements TaskDateDAO {
	
	List<TaskDate> taskDateList;

	@Override
	public List<TaskDate> getTaskDateList() {return taskDateList;}

	@Override
	public TaskDate getTaskDateById(Integer id) {
		
		int i = 0;
		
		for(i=0;i<taskDateList.size();i++)
		{
			if(taskDateList.get(i).getIdTask()==id)
			{
				break;
			}
		}
		
		return taskDateList.get(i);
	}

	@Override
	public void createTaskDate(TaskDate taskDate) {
		
		for(int i=0;i<taskDateList.size();i++)
		{
			if(taskDateList.get(i).getIdTask()==taskDate.getIdTask())
			{
				System.out.println("La tarea ya posee una fecha. Tarea Nro: " +taskDateList.get(i).getIdTask());
				System.out.println("Puede ir a modificaciones, para modificar la misma");
			}
			else
			{
				taskDateList.add(taskDate);
			}
		}
		
	}

	@Override
	public void updateTaskDate(TaskDate taskDate, TaskDTO changeTask) {
		
		for(int i=0;i<taskDateList.size();i++)
		{
			if(taskDateList.get(i).getIdTask()==changeTask.getIdTask())
			{
				taskDateList.get(i).setCreationDate(changeTask.getCreationDate());
				taskDateList.get(i).setFinishDate(changeTask.getFinishDate());
				taskDateList.get(i).setDueDate(changeTask.getDueDate());
				taskDateList.get(i).setLastUpdateDate(changeTask.getLastUpdateDate());
				
			}
		}
		
	}

	@Override
	public void deleteTaskDate(TaskDate taskDate) {
		
		for(int i=0;i<taskDateList.size();i++)
		{
			if(taskDateList.get(i).getIdTask()==taskDate.getIdTask())
			{
				taskDateList.remove(i);
			}
		}
		
	}

}
