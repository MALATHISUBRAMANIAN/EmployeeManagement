package com.project.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.employee.model.User;

public interface LoginRepo extends JpaRepository<User, Long> {

	User findByMailid(String mailid);

}
