package com.onlinetutorial.udemi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.onlinetutorial.udemi.enums.RoleEnum;

@Entity
@Table(name = "ROLE")
public class Role {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO , generator = "ROLE_SEQ")
	@SequenceGenerator(name = "ROLE_SEQ" ,sequenceName = "ROLE_SEQ" ,allocationSize = 1)
	@Column(name = "ROLE_ID")
	private Long roleId;

	@Column(name = "ROLE_CODE")
	private String roleCode;

	@Column(name = "ROLE_DESCRIPTION")
	private String roleDescription;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	/*
	 * @ManyToMany
	 * 
	 * @Transient private User user;
	 * 
	 * public User getUser() { return user; }
	 * 
	 * public void setUser(User user) { this.user = user; }
	 */

	
}
