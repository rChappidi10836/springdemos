package com.examples.S03Stereotypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S03Stereotypes.beans.Instructor;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
    		   "com/examples/S03Stereotypes/springconfig.xml");
       
       Instructor instructor = (Instructor) ctx.getBean("Instructor");
       System.out.println(instructor);
    }
}
