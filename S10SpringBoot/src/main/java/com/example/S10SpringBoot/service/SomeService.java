package com.example.S10SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.S10SpringBoot.dao.SomeDao;

@Component
public class SomeService {
	
	@Autowired
	SomeDao somedao;

	public void create() {
		
		somedao.hello();
		
	}
	
}
