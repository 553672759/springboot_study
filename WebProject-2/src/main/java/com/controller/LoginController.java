package com.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UsersDao;
import com.modal.Users;
import com.service.UsersService;

@RestController
public class LoginController {
	
	@Autowired
	UsersService usersService;
	
	@PostMapping("userlogin")
	public Object checkLogin(@RequestParam("Username") String username,@RequestParam("Password")String password) {
		Log log = LogFactory.getLog(UsersDao.class);
		log.info("===="+username+"  "+password);	
		return usersService.checkLogin(username, password);
	}

}
