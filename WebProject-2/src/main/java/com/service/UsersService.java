package com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.UsersDao;
import com.modal.Users;

@Component
public class UsersService {

	@Autowired
	private UsersDao usersDao;
	
	public List getAllUsers() {
		return usersDao.getAllUser();
	}
	
	public Object Add(Users user) {
		return usersDao.add(user);
	}
	
	public Object checkLogin(String username,String password) {
		return usersDao.checkLogin(username,password);
	}

}
