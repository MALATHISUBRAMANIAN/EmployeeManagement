package com.project.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.employee.model.Employee;
import com.project.employee.model.Login;
import com.project.employee.model.User;
import com.project.employee.repository.EmployeeRepo;
import com.project.employee.repository.LoginRepo;

@Service
public class LoginRegisterService {
	
	@Autowired
	LoginRepo repo;
	
	@Autowired
	EmployeeRepo employeeService;
	
	public Long getId(Login login) throws Exception {
		User userObj = repo.findByMailid(login.getMailid());
		if(userObj!=null && (userObj.getPassword().equals(login.getPassword()))){
			return userObj.getId();
		}
		else {
			throw new Exception("Invalid username or password");
		}
	}

	public long registerNewUser(User user) throws Exception {
		String mailId = user.getMailid();
		User existenceCheckObj = repo.findByMailid(mailId);
		if(existenceCheckObj!=null) {
			throw new Exception("User with mailId : "+mailId+"already exists");
		}
		else {
			repo.save(user);
			return repo.findByMailid(user.getMailid()).getId();
		}
		
	}

}
