package com.firstproject.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.firstproject.helloworld.model.HelloWorld;
import com.firstproject.helloworld.service.BusinessService;

@Component
public class HelloworldCl implements CommandLineRunner {
	@Autowired
	private BusinessService bs;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);

	}

}
