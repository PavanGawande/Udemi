package com.onlinetutorial.udemi.service;

import com.onlinetutorial.udemi.beans.UserBean;
import com.onlinetutorial.udemi.model.User;

public interface TriggerMailService {
	
	public void signUpConfirmationMail(User user);
	
	public void sendOtp(UserBean userBean);

	public void sendConfmPassIsChange(User user);

}
