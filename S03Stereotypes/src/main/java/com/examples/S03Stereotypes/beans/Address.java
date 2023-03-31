package com.examples.S03Stereotypes.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	@Value("pune")
	private String city;
	@Value("Maha")
	private String state;
	@Value("69991")
	private String pincode;
	
	
}
