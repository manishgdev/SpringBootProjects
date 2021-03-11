package com.manish.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.example.config.SimpleConfiguration;

public class SpringBootConfigurationTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(SimpleConfiguration.class);
		ctx.refresh();
		
		ctx.close();
	}
}
