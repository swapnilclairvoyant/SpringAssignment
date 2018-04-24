package com.clairvoyant.spring.assignment6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Hello obj = (Hello)context.getBean("helloBean6");
		obj.setMessage("Contents of Hello's Prototype bean");
		System.out.println("Message: "+obj.getMessage());
		
		Hello obj1 = (Hello)context.getBean("helloBean6");
		System.out.println("Message: "+obj1.getMessage());
	}

}
