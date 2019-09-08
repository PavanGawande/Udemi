package com.onlinetutorial.udemi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinetutorial.udemi.model.Email;

@Repository
public interface EmailDao extends JpaRepository<Email, Long> {

}
