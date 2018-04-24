package com.clairvoyant.spring.assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Hello obj = (Hello)context.getBean(Hello.class);
		obj.setMessage("Hello World !!!");
		System.out.println(obj.getMessage());
	}

}
