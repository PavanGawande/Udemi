package com.onlinetutorial.udemi.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.onlinetutorial.udemi.dao.UserDao;
import com.onlinetutorial.udemi.model.Role;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		com.onlinetutorial.udemi.model.User user = userDao.findByEmail(userName);

		if (user == null) {

			System.out.println("User not found! " + userName);

			throw new UsernameNotFoundException("User " + userName + " was not found in the database");
		}		

		System.out.println("Found User: " + user.getEmail());

		Set<Role> userRole = user.getRole();

		List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();

		if (userRole != null) {

			for (Role role : userRole) { // ROLE_USER, ROLE_ADMIN,.. GrantedAuthority
				GrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleCode());
				grantList.add(authority);
			}
		}

		UserDetails userDetails = (UserDetails) new User(user.getEmail(), user.getPassword(), grantList);

		return userDetails;
	}

}
