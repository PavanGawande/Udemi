package com.onlinetutorial.udemi.controllers;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.onlinetutorial.udemi.beans.ForgetPasswordBean;
import com.onlinetutorial.udemi.beans.UserBean;
import com.onlinetutorial.udemi.commons.Constants;
import com.onlinetutorial.udemi.mail.EmailService;
import com.onlinetutorial.udemi.validator.UserBeanValidator;
import com.onlinetutorial.udemicontrollerservice.RegistrtionControllerService;

@Controller
public class RegistrtionController {

	@Autowired
	private RegistrtionControllerService registrtionControllerService;

	@Autowired
	private UserBeanValidator validator;

	@InitBinder
	public void InitBinder(WebDataBinder webDataBinder) {
		webDataBinder.setValidator(validator);
	}

	@Autowired
	private EmailService emailService;

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String getUser(Model model) {

		model.addAttribute("userBean", new UserBean());

		return "signup";

	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String saveUser(Model model, @Validated @ModelAttribute("userBean") UserBean userBean,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("userBean", userBean);

			return "signup";
		}

		if (userBean != null) {

			userBean.setShowPassField(Constants.Y);

			model.addAttribute("userBean", userBean);

		}

		return "password";

	}

	@RequestMapping(value = "/confirmPassword", method = RequestMethod.POST)
	public String confirmPassword(Model model, @Validated @ModelAttribute("userBean") UserBean userBean,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			model.addAttribute("userBean", userBean);

			return "password";
		}

		registrtionControllerService.saveUser(userBean);
		model.addAttribute("isUserSave", Constants.Y);

		return "password";

	}

	@RequestMapping(value = "/forgetPasswordEnterEmail", method = RequestMethod.GET)
	public String forgetPasswordEnterEmail(Model model) {

		model.addAttribute("userBean", new UserBean());

		return "forgetPasswordEmail";

	}

	@RequestMapping(value = "/forgetPasswordEnterEmail", method = RequestMethod.POST)
	public String forgetPasswordEnterEmail(@Validated @ModelAttribute("userBean") UserBean userBean,
			BindingResult bindingResult, Model model, RedirectAttributes redirect) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("userBean", userBean);

			return "forgetPasswordEmail";
		}

		registrtionControllerService.sentOtp(userBean);

		redirect.addFlashAttribute("userBean", userBean);

		return "redirect:/forgetPassword";

	}

	@RequestMapping(value = "/forgetPassword", method = RequestMethod.GET)
	public String forgetPasswordEnterOtp(Model model) {

		UserBean userBean = (UserBean) model.asMap().get("userBean");

		model.addAttribute("userBean", userBean);

		return "forgetPassword";

	}

	@RequestMapping(value = "/forgetPassword", method = RequestMethod.POST)
	public String forgetPasswordEnterOtp(Model model, @Validated @ModelAttribute("userBean") UserBean userBean,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("userBean", userBean);

			return "forgetPassword";
		}

		registrtionControllerService.upatePassword(userBean);

		model.addAttribute("userBean", userBean);

		return "forgetPassword";

	}

	@RequestMapping(value = "/regenerateOtp", method = RequestMethod.GET)
	public String reGerenateOtp(Model model, @RequestParam("email") String email) {

		UserBean userBean = new UserBean();
		ForgetPasswordBean forgetPasswordBean = new ForgetPasswordBean();
		forgetPasswordBean.setEmail(email);
		userBean.setForgetPasswordBean(forgetPasswordBean);

		registrtionControllerService.sentOtp(userBean);

		model.addAttribute("userBean", userBean);

		return "forgetPassword";

	}

	/*
	 * @Scheduled(initialDelay = 1000, fixedRate = 10000) public void test() {
	 * 
	 * System.out.println("Current time is :: " + Calendar.getInstance().getTime());
	 * }
	 */
	  
	  
	 
	/*
	 * @Scheduled(fixedDelay = 10000) public void run() {
	 * System.out.println("Current time is :: " + Calendar.getInstance().getTime());
	 * }
	 */
	  
	/*
	 * @Scheduled(cron = "0 10 10 10 * ?") public void run() {
	 * logger.info("Current time is :: " + Calendar.getInstance().getTime()); }
	 */

}
