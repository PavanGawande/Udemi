package com.onlinetutorial.udemi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMAIL")
public class Email {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Long emailId;
	
	@Column(name = "FROM")
	private String from;
	
	@Column(name = "TO")
	private String to;
	
	@Column(name = "CC")
	private String cc;
	
	@Column(name = "MESSAGE")
	private String message;
	
	@Column(name = "SUBJECT")
	private String subject;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "ENTER_DATE")
	private Date enterDate;
	
	@Column(name = "RESEND_DATE")
	private String resendDate;
	
	@Column(name = "FAILUAR_REASON")
	private String failuarReason;

	public Long getEmailId() {
		return emailId;
	}

	public void setEmailId(Long emailId) {
		this.emailId = emailId;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getEnterDate() {
		return enterDate;
	}

	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}

	public String getResendDate() {
		return resendDate;
	}

	public void setResendDate(String resendDate) {
		this.resendDate = resendDate;
	}

	public String getFailuarReason() {
		return failuarReason;
	}

	public void setFailuarReason(String failuarReason) {
		this.failuarReason = failuarReason;
	}
	
	

}
