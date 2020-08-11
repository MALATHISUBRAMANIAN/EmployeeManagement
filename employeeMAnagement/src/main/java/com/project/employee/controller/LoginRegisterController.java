package com.project.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.model.Login;
import com.project.employee.model.User;
import com.project.employee.service.LoginRegisterService;

@RestController
@RequestMapping("/user")
public class LoginRegisterController {
	
	@Autowired
	LoginRegisterService service;
	
	@GetMapping("/check")
	public String check() {
		return "Welcome";
	}
	
	
	@PostMapping("/login")
	public long getByMailId(@RequestBody Login login) throws Exception {
		return service.getId(login);
	}
	
	@PostMapping("/addUser")
	public long registerUser(@RequestBody User user) throws Exception{
		return service.registerNewUser(user);
	}

}
