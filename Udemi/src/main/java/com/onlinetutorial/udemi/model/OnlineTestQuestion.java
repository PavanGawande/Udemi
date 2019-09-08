package com.onlinetutorial.udemi.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Entity
@Table(name = "QUESTION")
public class OnlineTestQuestion implements Serializable {
     
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "QUESTION_ID")
	private Long questionId;
	
	@Column(name = "QUESTION")
	private String question;
	
	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
	private List<QuestionOption> options;
	
	/*
	 * @ManyToOne(optional = false)
	 * 
	 * @JoinColumn(name = "Enter_BY")
	 * 
	 * @NotNull private User enterByUser;
	 */
	@Column(name = "ENTER_DATE")
	@NotNull
	private Date enterDate;
	
	@Column(name = "Updated_BY")
	private Long updatedBy;
	
	@ManyToOne(optional = false)
    @JoinColumn(name = "TEST_TYPE_ID")
	private TestType testType;
	
	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Column(name = "UPDATED_DATE")
	private Date updatedDate; 
	
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

	/*
	 * public User getEnterByUser() { return enterByUser; }
	 * 
	 * public void setEnterByUser(User enterByUser) { this.enterByUser =
	 * enterByUser; }
	 */

	public Date getEnterDate() {
		return enterDate;
	}

	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}

	public List<QuestionOption> getOptions() {
		return options;
	}

	public void setOptions(List<QuestionOption> options) {
		this.options = options;
	}
	
	
	public TestType getTestType() {
		return testType;
	}

	public void setTestType(TestType testType) {
		this.testType = testType;
	}


	/*
	 * public List<Answer> getAnswer() { return answer; }
	 * 
	 * public void setAnswer(List<Answer> answer) { this.answer = answer; }
	 */
	
}
