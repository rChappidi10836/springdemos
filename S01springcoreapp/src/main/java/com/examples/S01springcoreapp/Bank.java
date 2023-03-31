package com.examples.S01springcoreapp;

public class Bank {
	
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + "]";
	}
	
}
