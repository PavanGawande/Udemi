package com.onlinetutorial.udemi.mail;

import java.util.Map;

public class Mail {

    private String from;
    private String to;
    private String subject;
    private String content;
    private String cc;
    private String templateName;
    private Map<String , String> model;

    public Mail() {
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

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Map<String, String> getModel() {
		return model;
	}

	public void setModel(Map<String, String> model) {
		this.model = model;
	}

	public Mail(String from, String to, String subject, String content, Map<String, String> model) {
		super();
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.content = content;
		this.model = model;
	}

    
}