package com.manish.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello") //by default maps to GET
	public String sayHi() {
		return "Hi";
	}
	
	@RequestMapping("/") //by default maps to GET
	public String defaultPage() {
		return "The server is started";
	}
}
