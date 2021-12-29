package com.javatask.enocaTask.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatask.enocaTask.Entities.Employee;
import com.javatask.enocaTask.Service.IEmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	
	private IEmployeeService employeeService;
	
	@Autowired
	public EmployeeController(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public List<Employee> get(){
		return employeeService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Employee employee) {
		employeeService.add(employee);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Employee employee) {
		employeeService.update(employee);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Employee employee) {
		employeeService.delete(employee);
	}
	

}
