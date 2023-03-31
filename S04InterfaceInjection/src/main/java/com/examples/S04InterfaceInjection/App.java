package com.examples.S04InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S04InterfaceInjection.service.OrderService;
 
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
     		   "com/examples/S04InterfaceInjection/springconfig.xml");
        
       OrderService orderService = (OrderService) ctx.getBean("orderservice");
       orderService.placeOrder();
    }
}
