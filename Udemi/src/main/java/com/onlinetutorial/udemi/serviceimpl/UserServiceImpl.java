package com.onlinetutorial.udemi.serviceimpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.onlinetutorial.udemi.beans.UserBean;
import com.onlinetutorial.udemi.commons.CommonsUtils;
import com.onlinetutorial.udemi.commons.Constants;
import com.onlinetutorial.udemi.dao.RoleDao;
import com.onlinetutorial.udemi.dao.UserDao;
import com.onlinetutorial.udemi.model.User;
import com.onlinetutorial.udemi.service.TriggerMailService;
import com.onlinetutorial.udemi.service.UserService;

import antlr.collections.List;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	  @Autowired 
	  private BCryptPasswordEncoder bCryptPasswordEncoder;
	  
	  @Autowired
	  private RoleDao roleDao;
	  
	  @Autowired
	  private TriggerMailService triggerMailService;
	 
	
	@Override
	public void saveUser(UserBean userBean) {
		  
		User user =new User();
		//User logginUser = CurrentUser.getLoggingUser();
		
		user.setFirstName(userBean.getFirstName());
		
		if(userBean.getMiddleName() != null) {
		
			user.setMiddleName(userBean.getMiddleName());
		}
		
		user.setLastName(userBean.getLastName());
		user.setEmail(userBean.getEmail());
		user.setPassword(bCryptPasswordEncoder.encode(userBean.getPassword()));
		user.setStatus(Constants.ACTIVE);
		user.setEnterBy(9999l); 
		user.setEnterDate(new Date());
		 
		/*
		 * Set<Role> roleSet = roleDao.findByRoleCode("AD"); user.setRole(roleSet);
		 */
		
		userDao.save(user);
		
		triggerMailService.signUpConfirmationMail(user);
		
	}
	
	@Override
	public void upatePassword(UserBean userBean) {
		
	User user =	userDao.findByEmail(userBean.getForgetPasswordBean().getEmail());
		
		Date otpEnterTime = user.getOtpTime();
		long diffOtpCrtAndOtpEnter = CommonsUtils.diffBetwnDateInMinute(otpEnterTime, new Date());
		Long userOtp = Long.parseLong(userBean.getForgetPasswordBean().getOtp());
		
		if(userOtp.equals(user.getOtp())  && diffOtpCrtAndOtpEnter <= Constants.THIRTY) {
			
			//User logginUser = CurrentUser.getLoggingUser();
			
			user.setPassword(bCryptPasswordEncoder.encode(userBean.getForgetPasswordBean().getPassword()));
			//user.setUpdatedBy(logginUser.getUserId());
			user.setUpdatedDate(new Date());
			userDao.save(user);
			
			triggerMailService.sendConfmPassIsChange(user);
			
			userBean.getForgetPasswordBean().setIsPasswordUpdate(Constants.Y);
		}else {

			userBean.getForgetPasswordBean().setIsPasswordUpdate(Constants.N);			
		}
		
	}

	@Override
	public java.util.List<User> findAllActiveUser() {
		
		return userDao.findByStatus(Constants.ACTIVE);
	}

}
