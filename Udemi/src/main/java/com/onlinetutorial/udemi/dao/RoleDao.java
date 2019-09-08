package com.onlinetutorial.udemi.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinetutorial.udemi.enums.RoleEnum;
import com.onlinetutorial.udemi.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
	
	public Set<Role> findByRoleCode(String roleCode);

}
