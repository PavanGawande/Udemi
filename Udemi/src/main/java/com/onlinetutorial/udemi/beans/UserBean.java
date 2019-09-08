package com.onlinetutorial.udemi.beans;

public class UserBean {

	private String userId;

	private String firstName;
	
	private String lastName;
	
    private String middleName;
	
    private String email;
	
    private String password;
    
    private String confirmPassword;
    
    private String showPassField;
    
    private String passwordCommErr;
    
    private ForgetPasswordBean forgetPasswordBean;
    
	public ForgetPasswordBean getForgetPasswordBean() {
		return forgetPasswordBean;
	}

	public void setForgetPasswordBean(ForgetPasswordBean forgetPasswordBean) {
		this.forgetPasswordBean = forgetPasswordBean;
	}

	public String getUserId() {
		return userId;
	}

	public String getShowPassField() {
		return showPassField;
	}

	public String getPasswordCommErr() {
		return passwordCommErr;
	}

	public void setPasswordCommErr(String passwordCommErr) {
		this.passwordCommErr = passwordCommErr;
	}

	public void setShowPassField(String showPassField) {
		this.showPassField = showPassField;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getRegistarDate() {
		return registarDate;
	}

	public void setRegistarDate(String registarDate) {
		this.registarDate = registarDate;
	}

	private String status;

    private String registarDate;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
