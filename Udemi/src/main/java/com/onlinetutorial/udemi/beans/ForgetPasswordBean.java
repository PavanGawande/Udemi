package com.onlinetutorial.udemi.beans;

public class ForgetPasswordBean {
	
	private String email;
	
	private String password;
	
	private String confirmPassword;
	
	private String otp;
	
	private String isPasswordUpdate;
	
	private String isOtpPage;
	
	private String passwordCommErr;
	
	public String getPasswordCommErr() {
		return passwordCommErr;
	}
	public void setPasswordCommErr(String passwordCommErr) {
		this.passwordCommErr = passwordCommErr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIsPasswordUpdate() {
		return isPasswordUpdate;
	}
	public void setIsPasswordUpdate(String isPasswordUpdate) {
		this.isPasswordUpdate = isPasswordUpdate;
	}
	public String getPassword() {
		return password;
	}
	public String getIsOtpPage() {
		return isOtpPage;
	}
	public void setIsOtpPage(String isOtpPage) {
		this.isOtpPage = isOtpPage;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	
	

}
