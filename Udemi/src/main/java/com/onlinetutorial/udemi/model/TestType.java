package com.onlinetutorial.udemi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TEST_TYPE")
public class TestType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TEST_TYPE_ID")
	private Long testTypeId;
	
	@Column(name = "TEST_TYPE")
	private String testType;
	
	@Lob
	@Column(name = "TEST_DESCRIPTION")
	private String testDescribtion;
	
	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
	
	@Column(name = "UPDATED_BY")
	private Long updatedBy;
	
	@NotNull
	@Column(name = "ENTER_DATE")
	private Date enterDate;
	
	@NotNull
	@Column(name = "ENTER_BY")
	private Long enterBy;
	
	public Long getTestTypeId() {
		return testTypeId;
	}

	public void setTestTypeId(Long testTypeId) {
		this.testTypeId = testTypeId;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getTestDescribtion() {
		return testDescribtion;
	}

	public void setTestDescribtion(String testDescribtion) {
		this.testDescribtion = testDescribtion;
	}

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
		return enterBy;
	}

	public void setEnterBy(Long enterBy) {
		this.enterBy = enterBy;
	}
	
	

}
