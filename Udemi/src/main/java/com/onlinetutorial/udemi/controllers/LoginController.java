package com.onlinetutorial.udemi.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
	
	@RequestMapping("/signup")
	public String signUp(Model model) {
		model.addAttribute("signUpPage", "Y");
		
		return "commons/signup";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response ,Model model ,String error, String logout) {
		
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		 if("true".equals(error)) {
			 model.addAttribute("error", "Please Enter Valide User Name or Password");
			 
		 }
		 if(logout != null) {
			 
			  if (auth != null){      
		           new SecurityContextLogoutHandler().logout(request, response, auth);  
		        }
		 }
	        
		return "commons/login";
	}
	@RequestMapping("/welcome")
	public String welcomePage() {
		return "welcome";
		
	}

}
