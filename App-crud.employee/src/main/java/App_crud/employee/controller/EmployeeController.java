package App_crud.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import App_crud.employee.entities.Employee;
import App_crud.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
    EmployeeService service;
 
	@GetMapping("/add")
  public String add() {
	  return "add_employee";
  }
  
  @PostMapping("/register")
  public String postMethodName(@ModelAttribute Employee emp) {
      service.addEmployee(emp);
      
      return "index";
  }
 
}
