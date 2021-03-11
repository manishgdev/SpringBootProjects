package com.manish.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories("com.manish.jpa.*")
//@ComponentScan("com.manish.jpa.topics, com.manish.jpa.courses")
//@EntityScan("com.manish.jpa.*")   
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
