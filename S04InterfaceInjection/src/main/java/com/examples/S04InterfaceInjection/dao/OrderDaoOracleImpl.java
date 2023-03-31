package com.examples.S04InterfaceInjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaooracle")
public class OrderDaoOracleImpl implements OrderDAO{

	@Override
	public void createOrder() {
			System.out.println("Open Oracle Connection");
			System.out.println("Run insert Oracle statement");
			System.out.println("Order created in Oracle DB");
	}

}
