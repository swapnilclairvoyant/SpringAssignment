package com.clairvoyant.spring.assignment1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class App {

	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		Hello obj = (Hello)factory.getBean("helloBean1");
		System.out.println(obj.getMessage());
	}

}
