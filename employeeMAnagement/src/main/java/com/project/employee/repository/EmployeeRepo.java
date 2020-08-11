package com.project.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.employee.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,  Long> {

	Employee findByEmpid(Long id);

}
