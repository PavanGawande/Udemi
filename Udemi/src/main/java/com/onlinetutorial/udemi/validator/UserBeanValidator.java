package com.onlinetutorial.udemi.validator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.onlinetutorial.udemi.beans.ForgetPasswordBean;
import com.onlinetutorial.udemi.beans.UserBean;
import com.onlinetutorial.udemi.commons.Constants;
import com.onlinetutorial.udemi.commons.ValidationsUtils;
import com.onlinetutorial.udemi.model.User;
import com.onlinetutorial.udemicontrollerservice.RegistrtionControllerService;

@Component
public class UserBeanValidator implements Validator {

	@Autowired
	private RegistrtionControllerService registrtionControllerService;

	@Override
	public boolean supports(Class<?> clazz) {

		return UserBean.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		UserBean userBean = (UserBean) target;
		if (userBean.getForgetPasswordBean() == null) {

			UserRegValidation(userBean, errors);
		} else {

			forgetPassword(userBean.getForgetPasswordBean(), errors);
		}

	}

	/**
	 * Following Method is Use to Validate the User while Registration
	 * 
	 * @param userBean
	 * @param errors
	 */
	private void UserRegValidation(UserBean userBean, Errors errors) {

		if (ValidationsUtils.checkStringIsNullorEmpty(userBean.getFirstName())) {
			errors.rejectValue("firstName", "firstName.not.null");

		}

		if (ValidationsUtils.onlyAlphabetsAllow(userBean.getFirstName())) {
			errors.rejectValue("firstName", "only.alphabets");
		}

		if (ValidationsUtils.checkStringIsNullorEmpty(userBean.getLastName())) {
			errors.rejectValue("lastName", "lastName.not.null");

		}

		if (ValidationsUtils.onlyAlphabetsAllow(userBean.getLastName())) {
			errors.rejectValue("lastName", "only.alphabets");
		}
       
		if (!ValidationsUtils.checkStringIsNullorEmpty(userBean.getEmail())) {
			
			if (ValidationsUtils.emailvalidation(userBean.getEmail())) {
				errors.rejectValue("email", "email.invalide");
			}else {
				
				List<User> userList = registrtionControllerService.findAllActiveUser();
				String isEmailExist = null;

				for (User user : userList) {

					if (userBean.getEmail().equalsIgnoreCase(user.getEmail())) {

						isEmailExist = Constants.Y;

					}
				}
				
				if (Constants.Y.equals(isEmailExist)) {

					errors.rejectValue("email", "email.exist");
				}
				
			}
		}
		

		if (ValidationsUtils.checkStringIsNullorEmpty(userBean.getEmail())) {
			errors.rejectValue("email", "email.not.null");
		}

		if (Constants.Y.equals(userBean.getShowPassField())) {

			if (ValidationsUtils.checkStringIsNullorEmpty(userBean.getPassword())) {
				errors.rejectValue("password", "password.not.null");
			}
			if (ValidationsUtils.checkStringIsNullorEmpty(userBean.getConfirmPassword())) {
				errors.rejectValue("confirmPassword", "confirmpassword.not.null");
			}

			if (!ValidationsUtils.checkStringIsNullorEmpty(userBean.getConfirmPassword())
					|| ValidationsUtils.checkStringIsNullorEmpty(userBean.getPassword())) {
				if (!userBean.getConfirmPassword().equals(userBean.getPassword())) {

					errors.rejectValue("passwordCommErr", "password.not.match");
				}

			}

		}

	}

	/**
	 * @param forgetPasswordBean
	 * @param errors
	 * 
	 *                           This Method is validate Forget password field.
	 */
	private void forgetPassword(ForgetPasswordBean forgetPasswordBean, Errors errors) {

		if (ValidationsUtils.checkStringIsNullorEmpty(forgetPasswordBean.getEmail())) {

			errors.rejectValue("forgetPasswordBean.email", "email.not.null");
		} else {

			List<User> userList = registrtionControllerService.findAllActiveUser();
			String isEmailExist = null;

			for (User user : userList) {

				if (forgetPasswordBean.getEmail().equalsIgnoreCase(user.getEmail())) {

					isEmailExist = Constants.Y;

				}
			}

			if (ValidationsUtils.emailvalidation(forgetPasswordBean.getEmail())) {

				errors.rejectValue("forgetPasswordBean.email", "email.invalide");

			} else if (!Constants.Y.equals(isEmailExist)) {

				errors.rejectValue("forgetPasswordBean.email", "email.not.exist");
			}

			if (Constants.Y.equals(forgetPasswordBean.getIsOtpPage())) {

				try {

					Long.parseLong(forgetPasswordBean.getOtp());

				} catch (NumberFormatException e) {

					errors.rejectValue("forgetPasswordBean.otp", "otp.only.NumberAllow");

				}

				if (ValidationsUtils.checkStringIsNullorEmpty(forgetPasswordBean.getPassword())) {
					errors.rejectValue("forgetPasswordBean.password", "password.not.null");
				}
				if (ValidationsUtils.checkStringIsNullorEmpty(forgetPasswordBean.getConfirmPassword())) {
					errors.rejectValue("forgetPasswordBean.confirmPassword", "confirmpassword.not.null");
				}

				if (!ValidationsUtils.checkStringIsNullorEmpty(forgetPasswordBean.getPassword())
						|| ValidationsUtils.checkStringIsNullorEmpty(forgetPasswordBean.getConfirmPassword())) {
					if (!forgetPasswordBean.getConfirmPassword().equals(forgetPasswordBean.getPassword())) {

						errors.rejectValue("passwordCommErr", "password.not.match");
					}

				}

			}

		}

	}

}
