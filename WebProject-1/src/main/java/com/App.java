package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lication.MyApplicationEvent;
import com.lication.MyApplicationListenter;


/**
 * 带有监听的程序启动方法
 * @author xx
 *
 */
@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		SpringApplication app=new SpringApplication(App.class);
		
		app.addListeners(new MyApplicationListenter());
		
		ConfigurableApplicationContext context=app.run(args);
		
		context.publishEvent(new MyApplicationEvent(new Object()));
		
		context.close();
	}

}
