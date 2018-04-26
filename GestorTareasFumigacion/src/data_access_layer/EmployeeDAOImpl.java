package data_access_layer;

import java.util.List;

import bussines_layer.Employee;

/*el DAO de los empleados solo tienen la funcion de obtener, dado que suponemos
 * que los datos vienen del servidor de administracion
 */

public class EmployeeDAOImpl implements EmployeeDAO{
	
	List<Employee> employeeList;

	@Override
	public List<Employee> getEmployeeList() {return employeeList;} //retorna la lista

	@Override
	public Employee getEmployeeById(Integer id) { 
		
		int i = 0;
		
		for(i=0;i<employeeList.size();i++)
		{
			if(employeeList.get(i).getId()==id)
			{
				break;
			}
		}
		
		return employeeList.get(i); //retorna el empleado
		
	}
	
}
