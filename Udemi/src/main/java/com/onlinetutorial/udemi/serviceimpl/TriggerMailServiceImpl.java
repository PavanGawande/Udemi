package com.onlinetutorial.udemi.serviceimpl;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetutorial.udemi.beans.UserBean;
import com.onlinetutorial.udemi.commons.CommonsUtils;
import com.onlinetutorial.udemi.commons.Constants;
import com.onlinetutorial.udemi.dao.UserDao;
import com.onlinetutorial.udemi.mail.EmailService;
import com.onlinetutorial.udemi.mail.Mail;
import com.onlinetutorial.udemi.model.User;
import com.onlinetutorial.udemi.service.TriggerMailService;

import freemarker.template.TemplateException;

@Service
public class TriggerMailServiceImpl implements TriggerMailService {
	
	  @Autowired
	  private EmailService emailService;
	  
	  @Autowired
	  private UserDao userDao;
	 

	@Override
	public void signUpConfirmationMail(User user) {
		
		Mail mail  = new Mail();
		Map<String, String> map = new HashMap<String, String>();
		
		mail.setTo(user.getEmail());
		mail.setSubject(Constants.SUGNUP_CONFIRMATION_SUBJECT);
		
		
		map.put("name", user.getFirstName());
		map.put("location", "Pune Wakad");
		map.put("signature", "Pavan");
		mail.setTemplateName("signUp.ftl");
        mail.setModel(map);
        
        try {
			emailService.sendSimpleMessage(mail);
		} catch (MessagingException | IOException | TemplateException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void sendOtp(UserBean userBean) {
		
		User  user = userDao.findByEmail(userBean.getForgetPasswordBean().getEmail());
		
		Mail mail  = new Mail();
		Map<String, String> map = new HashMap<String, String>();
		
		mail.setTo(user.getEmail());
		mail.setSubject(Constants.FORGET_PASSWORD);
		
		
		map.put("name", user.getFirstName());
		map.put("location", "Pune Wakad");
		map.put("signature", "Pavan");
		map.put("otp", Long.toString(CommonsUtils.getRandomNumber()));
		mail.setTemplateName("forgetPasswordOtp.ftl");
        mail.setModel(map);
        
		/* save OTP and Time in USER table */
        user.setOtp(Long.parseLong(map.get("otp")));
        user.setOtpTime(new Date());        
        userDao.save(user);
        
        
        try {
			emailService.sendSimpleMessage(mail);
		} catch (MessagingException | IOException | TemplateException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Following Method is Use to send Confiration to User that You 
	 * PAssword Is change Successfully
	 *
	 */
	@Override
	public void sendConfmPassIsChange(User user) {
		
		Mail mail  = new Mail();
		Map<String, String> map = new HashMap<String, String>();
		
		mail.setTo(user.getEmail());
		mail.setSubject(Constants.PASSWORD_CHANGE);
		
		
		map.put("reciverName", user.getFirstName());
		map.put("location", "Pune Wakad");
		map.put("signature", "Pavan");
		map.put("reciverEmail", user.getEmail());
		mail.setTemplateName("sendConfmPassIsChange.ftl");
        mail.setModel(map);
        
        try {
			emailService.sendSimpleMessage(mail);
		} catch (MessagingException | IOException | TemplateException e) {
			e.printStackTrace();
		}
	
		
	}
	

}
