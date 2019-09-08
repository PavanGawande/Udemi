package com.onlinetutorial.udemicontrollerservice;

import java.util.List;

import com.onlinetutorial.udemi.beans.UserBean;
import com.onlinetutorial.udemi.model.User;

public interface RegistrtionControllerService {
	
	public void saveUser(UserBean userBean);
	
	public void sentOtp(UserBean userBean);
	
	public void upatePassword(UserBean userBean);

	public List<User> findAllActiveUser();

}
