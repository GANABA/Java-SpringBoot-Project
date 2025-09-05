package com.firstproject.helloworld.service;

import org.springframework.stereotype.Component;

import com.firstproject.helloworld.model.HelloWorld;

@Component
public class BusinessService {
	
	public HelloWorld getHelloWorld() {
		HelloWorld hw = new HelloWorld();
		return hw;
	}

}
