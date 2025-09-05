package com.firstproject.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.firstproject.helloworld.model.HelloWorld;
import com.firstproject.helloworld.service.BusinessService;

@SpringBootTest
class HelloworldApplicationTests {

	@Autowired
	private BusinessService bs;
	
	@Test
	public void testGetHelloWorld() {
		String hw = "Hello word!\nAll right!";
		
		HelloWorld res = bs.getHelloWorld();		
	
		assertEquals(hw, res);
	}
	
	@Test
	void contextLoads() {
	}

}
