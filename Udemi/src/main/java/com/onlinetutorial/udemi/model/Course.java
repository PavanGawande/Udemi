package com.onlinetutorial.udemi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "COURSE")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO , generator = "COURSE_SEQ")
	@SequenceGenerator(name = "COURSE_SEQ" ,sequenceName = "COURSE_SEQ" ,allocationSize = 1)
	@Column(name = "COURSE_ID")
	private Long courseId;
	
	@Column(name = "COURSE")
	private String course;
	
	@Lob
	@Column(name = "COURCE_DESCRIPTION")
	private String courseDescribtion;
	
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
	
	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}


	public String getCourseDescribtion() {
		return courseDescribtion;
	}

	public void setCourseDescribtion(String courseDescribtion) {
		this.courseDescribtion = courseDescribtion;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
