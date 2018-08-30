package com.lication;

import org.springframework.context.ApplicationListener;

/**
 * 定义事件监听器
 * @author xx
 *
 */

public class MyApplicationListenter implements ApplicationListener<MyApplicationEvent>{
	
	public void onApplicationEvent(MyApplicationEvent event) {
		System.out.println("接受到事件："+event.getClass());
	}

}
