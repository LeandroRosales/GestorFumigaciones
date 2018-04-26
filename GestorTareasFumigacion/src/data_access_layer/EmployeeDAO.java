package data_access_layer;

import java.util.List;

import bussines_layer.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getEmployeeList();
	public Employee getEmployeeById(Integer id);

}
