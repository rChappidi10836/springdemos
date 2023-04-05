package com.examples.S01springcoreapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public Employee emp1() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Wick");
		return emp;
	}

	@Bean
	public Employee emp2() {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Barter");
		return emp;
	}

	@Bean
	public Employee emp3() {
		Employee emp = new Employee();
		emp.setId(3);
		emp.setName("benet");
		return emp;
	}

	@Bean
	public Employee emp4() {
		Employee emp = new Employee();
		emp.setId(4);
		emp.setName("Marty");
		List<String> departments = new ArrayList<>();
		departments.add("HR");
		departments.add("Admin");
		departments.add("Sales");
		emp.setDepartments(departments);
		return emp;
	}
	
	@Bean
	public Employee emp5() {
		Employee emp = new Employee();
		emp.setId(5);
		emp.setName("Kelen");
		
		return emp;
	}
	
	@Bean
	public Employee emp6() {
		Employee emp = new Employee();
		emp.setId(5);
		emp.setName("Kelen");
		return emp;
	}
	
	@Bean
	public Employee emp7() {
		Employee emp = new Employee();
		emp.setId(5);
		emp.setName("Kelen");
		Address address = new Address();
		address.setCity("Coimbatoure");
		address.setState("TN");
		address.setPincode("500048");
		emp.setAddress(address);
		return emp;
	}
	
}
