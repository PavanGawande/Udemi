package com.onlinetutorial.udemi.commons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import com.onlinetutorial.udemi.dao.UserDao;
import com.onlinetutorial.udemi.model.User;

@SessionScope
@Component
public class LoggingUser {
	@Autowired
	private UserDao userDao;
	private User user;

	public User getUser() {
		return getCurrentUser();
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getCurrentUser() {
		if (user == null) {
			UserDetails userdetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
					.getPrincipal();

			user = userDao.findByEmail(userdetails.getUsername());
		}
		return user;
	}

}
