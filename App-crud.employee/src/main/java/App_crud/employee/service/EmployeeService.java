package App_crud.employee.service;

import java.util.List;

import App_crud.employee.entities.Employee;

public interface EmployeeService {
    
	void addEmployee(Employee emp);
	void updateEmployee(Employee emp);
	
	Employee searchEmployee(int id);
	void deleteEmployee(int id);
	
	List<Employee> fetchAllEmployees();
	
}
