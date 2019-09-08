package com.onlinetutorial.udemi.service;

import java.util.List;

import com.onlinetutorial.udemi.beans.UserBean;
import com.onlinetutorial.udemi.model.User;

public interface UserService {
	
	public void saveUser(UserBean userBean);

	public void upatePassword(UserBean userBean);

	public List<User> findAllActiveUser();

}
