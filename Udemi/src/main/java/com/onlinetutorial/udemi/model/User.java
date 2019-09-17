package com.onlinetutorial.udemi.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USER")
public class User {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO , generator = "USER_SEQ")
	@SequenceGenerator(name = "USER_SEQ" ,sequenceName = "USER_SEQ" ,allocationSize = 1)	
	@Column(name = "USER_ID")
	private Long userId;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "MIDDLE_NAME")
    private String middleName;
	
	@Column(name = "EMAIL" , unique = true)
	//@Column(name = "EMAIL")
    private String email;
	
	@Column(name = "PASSWORD")
    private String password;
	
	@Column(name = "STATUS")
    private String status;
	
	@Column(name = "REGISTAR_DATE")
	private Date ragistarDate;
	
	@JoinTable(name = "USER_ROLE", joinColumns = @JoinColumn(name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
	@ManyToMany(fetch=FetchType.EAGER)  
	private Set<Role> role;
	
	@Column(name = "OTP")
	private Long otp;
	
	@Column(name = "OTP_TIME")
	private Date otpTime;
	
	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
	
	@Column(name = "UPDATED_BY")
	private Long updatedBy;
	
	@NotNull
	@Column(name = "ENTER_DATE")
	private Date enterDate;
	
	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getEnterDate() {
		return enterDate;
	}

	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}

	public Long getEnterBy() {
		return EnterBy;
	}

	public void setEnterBy(Long enterBy) {
		EnterBy = enterBy;
	}

	@NotNull
	@Column(name = "ENTER_BY")
	private Long EnterBy;

	public Long getOtp() {
		return otp;
	}

	public void setOtp(Long otp) {
		this.otp = otp;
	}

	public Date getOtpTime() {
		return otpTime;
	}

	public void setOtpTime(Date otpTime) {
		this.otpTime = otpTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public Date getRagistarDate() {
		return ragistarDate;
	}

	public void setRagistarDate(Date ragistarDate) {
		this.ragistarDate = ragistarDate;
	}

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
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
