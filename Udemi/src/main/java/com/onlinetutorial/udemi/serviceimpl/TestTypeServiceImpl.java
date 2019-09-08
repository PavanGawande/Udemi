package com.onlinetutorial.udemi.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetutorial.udemi.dao.TestTypeRepo;
import com.onlinetutorial.udemi.model.TestType;
import com.onlinetutorial.udemi.service.TestTypeService;

@Service
public class TestTypeServiceImpl implements TestTypeService {

	@Autowired
	private TestTypeRepo testTypeRepo; 
	
	
	@Override
	public List<TestType> getAllTestType() {

		return testTypeRepo.findAll();
	}

}
