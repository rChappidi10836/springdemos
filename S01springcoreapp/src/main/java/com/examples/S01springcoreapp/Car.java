package com.examples.S01springcoreapp;

public class Car {
	
	String regno;
	String model;
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [regno=" + regno + ", model=" + model + "]";
	}
	
}
