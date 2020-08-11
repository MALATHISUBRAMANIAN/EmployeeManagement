package com.project.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.employee.model.Employee;
import com.project.employee.repository.EmployeeRepo;

@Service
public class EmployeeManagementService {
	
	@Autowired
	EmployeeRepo repo;
	
	public void insertEmployeeDetails(Employee employee) {
		repo.save(employee);
	}
	
	public Employee getEmployeeById(Long id) {
		return repo.findByEmpid(id);
	}

	public void updateEmployeeById(long id, Employee employee) {
		Employee empObj = repo.findByEmpid(id);
		employee.setEmpid(empObj.getEmpid());
		repo.save(employee);
	}
}
