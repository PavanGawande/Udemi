package com.onlinetutorial.udemi.beans;

public class QuestionOptionBean {
	
	private Long optionId;
	private String mcq;
	
	public String getMcq() {
		return mcq;
	}

	public void setMcq(String mcq) {
		this.mcq = mcq;
	}

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

}
