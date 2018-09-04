package com.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.modal.Users;
import com.service.UsersService;
import com.util.Util;

@RestController
public class UsersController {
	
	@Autowired
	UsersService usersService;
	
	@PostMapping("useradd")
	public Object UserAdd2(@RequestParam("Username") String username,@RequestParam("Password")String password,@RequestParam("Email") String  email) {
		String str="str==="+username+" "+password+" "+email;
		Users users=new Users();
		users.setUserName(username);
		users.setPassWord(password);
		users.setEmail(email);
		Object o= usersService.Add(users);
		return o;
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
