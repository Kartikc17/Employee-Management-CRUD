package App_crud.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import App_crud.employee.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
         
}
