package com.examples.S01springcoreapp;

public class Computer {
	
	int cpucores;
	String display;
	String type;
	
	
	
	public Computer(String display, String type) {
		this.display = display;
		this.type = type;
	}

	public Computer(int cpucores, String display, String type) {
		this.cpucores = cpucores;
		this.display = display;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Computer [cpucores=" + cpucores + ", display=" + display + ", type=" + type + "]";
	}
	
	
}
