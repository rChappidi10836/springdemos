package com.examples.S02Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	int id;
	String name;
	
	//property lever autowire
	@Autowired
	@Qualifier("address1")
	private Address homeaddress;
	
	@Autowired
	@Qualifier("address2")
	private Address offaddress;
	
//	//consturctor level autowire
//	public Employee(Address address) {
//		this.address=address;
//	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name +", homeaddress ="+homeaddress+ ", offaddress ="+offaddress+"]";
	}
	
	
////	setter level autowire
//	public Address getAddress() {
//		return address;
//	}
//	@Autowired
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	
	
}
