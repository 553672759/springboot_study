package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.modal.Users;

@RestController
public class LoginController {
	
	@PostMapping("useradd")
	public String UserAdd(@RequestParam("Username") String username,@RequestParam("Password")String password,@RequestParam("Password2") String  password2) {
		String str=username+" "+password+" "+password2;
		
		return str;
	}
	@GetMapping("useradd")
	public String UserAdd2(@RequestParam("Username") String username,@RequestParam("Password")String password,@RequestParam("Email") String  email) {
		String str="str==="+username+" "+password+" "+email;
		Users users=new Users();
		users.setUserName(username);
		users.setPassWord(password);
		users.setEmail(email);
		
		return str;
	}

}
