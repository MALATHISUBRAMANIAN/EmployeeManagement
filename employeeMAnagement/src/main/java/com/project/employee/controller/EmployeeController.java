package com.project.employee.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.model.Employee;
import com.project.employee.service.EmployeeManagementService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeManagementService employeeService;
	
	@PostMapping
	public void registerEmployeeDetails(@RequestBody Employee employee) {
		employeeService.insertEmployeeDetails(employee);
		
	}
	
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable("id") long id) {
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping("/updateEmployee/{id}")
	public void updateEmployee(@PathVariable("id") long id , @RequestBody Employee employee) {
		employeeService.updateEmployeeById(id, employee);
	}

}
