package com.onlinetutorial.udemi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinetutorial.udemi.model.TestType;
import java.lang.Long;
import java.util.List;
import java.util.Optional;

public interface TestTypeRepo extends JpaRepository<TestType, Long> {
	
	public Optional<TestType> findByTestTypeId(Long testtypeid);
	

}
