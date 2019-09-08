package com.onlinetutorial.udemi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinetutorial.udemi.model.User;
import java.lang.String;

public interface UserDao extends JpaRepository<User, Long>  {
	
	public User findByEmail(String email);
	
	public List<User> findByStatus(String status);
	
	/* public User findByEmailAndStatus("Email" , "Status") */

}

