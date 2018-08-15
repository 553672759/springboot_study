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
	
	
	
	
	
}
