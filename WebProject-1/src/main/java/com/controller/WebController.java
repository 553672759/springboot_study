package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@Value(value="${xx.secret}")
	private String uuid;
	
	@Value(value="${xx.number}")
	private int randomID;
	
	@Value(value="${xx.limitnumber}")
	private int limitnumber;
	
	@RequestMapping("/index")
	public Map<String,Object> Index(){
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("uuid", uuid);
		map.put("randomID", randomID);
		map.put("limitnumber", limitnumber);
		return map;
		
	}
	
	
}
