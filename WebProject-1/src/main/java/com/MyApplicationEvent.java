package com;

import org.springframework.context.ApplicationEvent;


/**
 * 
 * 定义事件
 * @author xx
 *做完某一件事情以后，需要广播一些消息或者通知，
 *告诉其他的模块进行一些事件处理，一般来说，可以一个一个发送请求去通知，
 *但是有一种更好的方式，那就是事件监听，
 *事件监听也是设计模式中 发布-订阅模式、观察者模式的一种实现。
 *https://blog.csdn.net/Harry_ZH_Wang/article/details/79691994
 */
public class MyApplicationEvent extends ApplicationEvent{
	
	private static final long serivalVersionUID=1L;
	
	public MyApplicationEvent(Object object) {
		super(object);
	}

}
