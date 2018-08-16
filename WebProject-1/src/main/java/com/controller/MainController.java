package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modal.Users;
import com.service.UsersService;


@Controller
public class MainController {
	

	@Autowired
	private UsersService usersService;
	
	
	
	@GetMapping("index")
	public String Index() {
		return "login.html";		
	}
	@GetMapping("signup")
	public String SignUp() {
		return "signup.html";
	}
	
	@GetMapping("ii")
	public String i() {
		return "the-play-of-form/index.html";
	}
	
	@GetMapping("grid")
	public String Grid() {
		return "css-grid-album/index.html";
	}
	
	
	
}
