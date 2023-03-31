package com.examples.S04InterfaceInjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.examples.S04InterfaceInjection.dao.OrderDAO;

@Component("orderservice")
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	@Qualifier(value="orderdaoMySQL")
	private OrderDAO orderdao;
	
	@Override
	public void placeOrder() {
		
		System.out.println("Perfrom Business login...");
		System.out.println("Ready to create order");
		orderdao.createOrder();
	}
	
	
	
}
