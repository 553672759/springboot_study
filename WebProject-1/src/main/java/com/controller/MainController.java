package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modal.Users;
import com.service.UsersService;


@RestController
public class MainController {
	

	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/findall")
	public List<Users> find() {
		return usersService.getAllUsers();
		
	}
	
	@RequestMapping("/add")
	public Object add() {
		Users user=new Users();
		user.setId("1");
		user.setUserName("5536");
		user.setRealName("wdc");
		user.setPassWord("0000");
		user.setEmail("553672759");
		usersService.addUser(user);
		return "OK";
	}
	
}