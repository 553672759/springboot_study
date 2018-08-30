package com.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modal.Users;
import com.service.UsersService;
import com.util.Util;

@RestController
public class UsersController {
	
	@Autowired
	UsersService usersService;
	
	@Autowired
	Util util;
	
	@GetMapping("/userAdd")
	public String UsersAdd() {
		Users user=new Users();
		user.setId(util.GetUUID());
		user.setUserName("5536");
		user.setRealName("wdc");
		user.setPassWord("0000");
		user.setEmail("553672759");
		
		return "ok";
	}
	
	@GetMapping("/userNumber")
	public String getNumber() {
		return "";
	}
	
	@RequestMapping("/userList")
	public List<Users> find() {
		return usersService.getAllUsers();
		
	}
	
}
