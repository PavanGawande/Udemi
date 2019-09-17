package com.onlinetutorial.udemi.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinetutorial.udemi.model.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {
	
	public Optional<Course> findByCourseId(Long courceId);
	

}
