package com.onlinetutorial.udemi.controllerserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetutorial.udemi.beans.UserBean;
import com.onlinetutorial.udemi.model.User;
import com.onlinetutorial.udemi.service.TriggerMailService;
import com.onlinetutorial.udemi.service.UserService;
import com.onlinetutorial.udemicontrollerservice.RegistrtionControllerService;

@Service
public class RegistrtionControllerServiceImpl implements RegistrtionControllerService {

	@Autowired
	private UserService userService;

	@Autowired
	private TriggerMailService triggerMailService;

	@Override
	public void saveUser(UserBean userBean) {

		userService.saveUser(userBean);

	}

	@Override
	public void sentOtp(UserBean userBean) {

		triggerMailService.sendOtp(userBean);

	}

	@Override
	public void upatePassword(UserBean userBean) {
		
		userService.upatePassword(userBean);

	}

	@Override
	public List<User> findAllActiveUser() {
		
		return userService.findAllActiveUser();
	}
	
	

}
