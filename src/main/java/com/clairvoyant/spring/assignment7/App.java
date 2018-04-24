package com.clairvoyant.spring.assignment7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.clairvoyant.spring.assignment6.Hello;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		com.clairvoyant.spring.assignment7.Hello obj = (com.clairvoyant.spring.assignment7.Hello)context.getBean(com.clairvoyant.spring.assignment7.Hello.class);
		obj.setMessage("Contents of Hello's Singleton bean");
		System.out.println(obj.getMessage());
		
		com.clairvoyant.spring.assignment7.Hello obj1 = (com.clairvoyant.spring.assignment7.Hello)context.getBean(com.clairvoyant.spring.assignment7.Hello.class);
		System.out.println("Message: "+obj1.getMessage());
	}

}
