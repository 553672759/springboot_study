package xx.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import xx.dao.UsersDaoImpl;
import xx.modal.Users;

@ComponentScan
public class UsersService {

	@Autowired
	UsersDaoImpl usersDaoImpl;
	
	public List getAllUsers() {
		return usersDaoImpl.findAll();
	}
	
	public Object addUser(Users user) {
		return usersDaoImpl.add(user);
	}
}
