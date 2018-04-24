package com.clairvoyant.spring.assignment8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

	@Bean(name="helloBean3")
	@Scope("prototype")
	public Hello helloworld() {
		return new Hello();
	}
}
