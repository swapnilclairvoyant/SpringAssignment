package com.clairvoyant.spring.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Hello obj = (Hello)context.getBean("helloBean2");
		System.out.println(obj.getMessage());
	}

}
