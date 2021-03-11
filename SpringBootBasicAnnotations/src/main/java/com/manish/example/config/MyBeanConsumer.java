package com.manish.example.config;

public class MyBeanConsumer {
	
	private MyBean myBean;
	
	public MyBeanConsumer(MyBean myBean) {
		this.myBean = myBean;
		System.out.println("MyConsumer Bean instance created");
	}
	
	public MyBean getMyBean() {
		return myBean;
	}
	
}
