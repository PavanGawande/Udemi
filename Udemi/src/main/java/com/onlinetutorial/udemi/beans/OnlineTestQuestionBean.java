package com.onlinetutorial.udemi.beans;

import java.util.List;
import java.util.Set;

import org.springframework.web.multipart.MultipartFile;

public class OnlineTestQuestionBean {
	
	private String optionsCount;
	
	private Long questionId;
	
	private String question;
	
	private List<String> options;
	
	private List<String> answer;
	
	private MultipartFile files;
	
	private String courceId;


	public MultipartFile getFiles() {
		return files;
	}

	public void setFiles(MultipartFile files) {
		this.files = files;
	}
	public String getCourceId() {
		return courceId;
	}

	public void setCourceId(String courceId) {
		this.courceId = courceId;
	}

	public String getOptionsCount() {
		return optionsCount;
	}

	public void setOptionsCount(String optionsCount) {
		this.optionsCount = optionsCount;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public List<String> getAnswer() {
		return answer;
	}

	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}


}
