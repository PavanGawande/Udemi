package com.onlinetutorial.udemi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinetutorial.udemi.model.OnlineTestQuestion;

@Repository
public interface OnlineTestQuestionDao extends JpaRepository<OnlineTestQuestion, Long> {

}
