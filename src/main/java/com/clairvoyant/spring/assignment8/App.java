package com.clairvoyant.spring.assignment8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.clairvoyant.spring.assignment6.Hello;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		com.clairvoyant.spring.assignment8.Hello obj = (com.clairvoyant.spring.assignment8.Hello)context.getBean(com.clairvoyant.spring.assignment8.Hello.class);
		obj.setMessage("Contents of Hello's Prototype bean");
		System.out.println(obj.getMessage()+ obj.hashCode());
		
		com.clairvoyant.spring.assignment8.Hello obj1 = (com.clairvoyant.spring.assignment8.Hello)context.getBean(com.clairvoyant.spring.assignment8.Hello.class);
		System.out.println("Message: "+obj1.getMessage()+ obj1.hashCode());
	}

}
