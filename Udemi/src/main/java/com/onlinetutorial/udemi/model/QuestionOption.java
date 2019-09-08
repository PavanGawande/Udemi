package com.onlinetutorial.udemi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="OPTIONS_MCQ")
public class QuestionOption {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "OPTION_ID")
	private Long optionId;
	
	@Column(name = "MCQ")
	private String mcq;
	
	@ManyToOne(optional = false)
    @JoinColumn(name = "QUESTION_ID")
	private OnlineTestQuestion question;
	
	@Column(name = "IS_ANSWER")
	private String isAnswer;
	
	public String getMcq() {
		return mcq;
	}

	public String getIsAnswer() {
		return isAnswer;
	}

	public void setIsAnswer(String isAnswer) {
		this.isAnswer = isAnswer;
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

	public OnlineTestQuestion getQuestion() {
		return question;
	}

	public void setQuestion(OnlineTestQuestion question) {
		this.question = question;
	}

	

}
