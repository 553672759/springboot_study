package com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.UsersDaoImpl;
import com.modal.Users;

@Component
public class UsersService {

	@Autowired
	private UsersDaoImpl usersDaoImpl;
	
	public List getAllUsers() {
		return usersDaoImpl.findAll();
	}
	
	public Object addUser(Users user) {
		return usersDaoImpl.add(user);
	}
	public String getUsersNumber() {
		return usersDaoImpl.getNumber();
	}
}
