package com.util;

import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class Util {
	
	/**
	 * 
	 * 返回String类型的UUID
	 * @return
	 */
	public String GetUUID() {
		Random random=new Random();
		return UUID.randomUUID().toString();
		//return Integer.toString(random.nextInt());
		
	}
	

}
