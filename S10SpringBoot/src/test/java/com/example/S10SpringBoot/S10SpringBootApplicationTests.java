package com.example.S10SpringBoot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.S10SpringBoot.service.SomeService;

@SpringBootTest
class S10SpringBootApplicationTests {

	
	@Autowired
	ApplicationContext context;
	
	@Test
	void contextLoads() {
		SomeService someservice = context.getBean(SomeService.class);
		someservice.create();
	}

}
