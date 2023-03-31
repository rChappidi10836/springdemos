package com.examples.S04InterfaceInjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaoMySQL")
public class OrderDaoImpl implements OrderDAO{

	@Override
	public void createOrder() {
			System.out.println("Open MySQL Connection");
			System.out.println("Run insert MySQL statement");
			System.out.println("Order created in MySQL DB");
	}

}
