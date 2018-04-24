package com.clairvoyant.spring.assignment7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class Config {

	@Bean(name="helloBean3")
	public Hello helloworld() {
		return new Hello();
	}
}
