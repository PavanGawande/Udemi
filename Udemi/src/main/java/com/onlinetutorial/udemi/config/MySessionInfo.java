package com.onlinetutorial.udemi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.onlinetutorial.udemi.dao.UserDao;
import com.onlinetutorial.udemi.model.User;

@Component
@Scope("session")
public class MySessionInfo {

	@Autowired
	private UserDao userDao;
    private User user;

    public  User getCurrentUser() {
        if (user == null) {
        	UserDetails userdetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
   		 
            user = userDao.findByEmail(userdetails.getUsername());
        }
        return user;
    }
}