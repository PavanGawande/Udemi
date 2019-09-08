package com.onlinetutorial.udemi.commons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlinetutorial.udemi.model.User;

@Component
public class CurrentUser {
	
	@Autowired
	private static LoggingUser loggingUser;

	public static  User getLoggingUser() {
		return loggingUser.getCurrentUser();
	}

	public void setLoggingUser(LoggingUser loggingUser) {
		this.loggingUser = loggingUser;
	}

}
