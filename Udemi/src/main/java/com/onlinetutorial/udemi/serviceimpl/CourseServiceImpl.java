package com.onlinetutorial.udemi.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetutorial.udemi.dao.CourseRepo;
import com.onlinetutorial.udemi.model.Course;
import com.onlinetutorial.udemi.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepo courseRepo;
	
	
	@Override
	public List<Course> getAllCources() {

		return courseRepo.findAll();
	}

}
