package com.manish.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleConfiguration {
	
//	@Autowired
//	private MyBean mBean;   // if we don't want to use @Configuration we can use @Autowired for Object creation
	
	@Bean(name="myBeanM")
	public MyBean getMyBean() {
		return new MyBean();
	}
	
	@Bean
	public MyBeanConsumer getMyConsumerBean() {
		return new MyBeanConsumer(getMyBean());
	}
}
