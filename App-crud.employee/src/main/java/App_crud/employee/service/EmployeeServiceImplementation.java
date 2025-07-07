package App_crud.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App_crud.employee.entities.Employee;
import App_crud.employee.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

	@Autowired
	EmployeeRepository repo;
	
	public void addEmployee(Employee emp) {
		repo.save(emp);
		
	}
 
}
