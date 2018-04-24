package com.clairvoyant.spring.assignment3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean(name="helloBean3")
	public Hello helloworld() {
		return new Hello();
	}
}
