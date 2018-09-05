package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.modal.Users;
import com.service.UsersService;


@Controller
public class MainController {
	

	@Autowired
	private UsersService usersService;
	
	
	
	@GetMapping("index")
	public String Index() {
		return "login";		
	}
	@GetMapping("signup")
	public String SignUp() {
		return "signup";
	}
	
	@GetMapping("ii")
	public String i() {
		return "the-play-of-form/index.html";
	}
	
	@GetMapping("video")
	public String Grid() {
		return "css-grid-album/index.html";
	}
	
	//-----------------------------
	//传递参数给页面
	@RequestMapping("greeting")
	public String  test(HttpServletRequest request, @RequestParam(value = "name", required = false, defaultValue = "springboot-thymeleaf") String name) {
		request.setAttribute("name","欢迎使用Thymeleaf!");
	    return "greeting";
	}
	
	@PostMapping("userlogin")
	public Object checkLogin(HttpServletRequest request,@RequestParam("Username") String username,@RequestParam("Password") String password) {
		//传递参数给页面，
		request.setAttribute("user",usersService.checkLogin(username, password));	
		return "login";
	}
	
	
	
}
