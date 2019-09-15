package com.onlinetutorial.udemi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinetutorial.udemi.model.OnlineTestQuestion;
import com.onlinetutorial.udemi.model.TestType;
import java.util.List;
import java.util.Optional;

@Repository
public interface OnlineTestQuestionDao extends JpaRepository<OnlineTestQuestion, Long> {
	
	public List<OnlineTestQuestion> findByTestType(Optional<TestType> testtype);

}
