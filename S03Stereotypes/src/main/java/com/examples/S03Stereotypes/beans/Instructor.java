package com.examples.S03Stereotypes.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {
	
	@Value("12")
	private int id;
	
	@Value("Manny")
	private String name;
	
	@Autowired
	private Address homeAddress;
	
	
	@Override
	public String toString() {
		return "Insturctor [id=" + id + ", name=" + name + ", homeAddress=" + homeAddress +"]";
	}
	
	
	
}
