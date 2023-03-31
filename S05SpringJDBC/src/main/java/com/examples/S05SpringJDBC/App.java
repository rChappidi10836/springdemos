package com.examples.S05SpringJDBC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S05SpringJDBC.dao.EmployeeDAO;
import com.examples.S05SpringJDBC.entity.Employee;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "JDBCTemplate Demo" );
        
//        create();
        
//        update();
        
//        delete();
        
//        readOneEmployee();
        
          listemployees();
      
    }
    
    private static void listemployees() {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
	      		   "com/examples/S05SpringJDBC/springconfig.xml");
	         
	        
	        EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
	        System.out.println(employeeDao.read());
		
	}

	private static void readOneEmployee() {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
	      		   "com/examples/S05SpringJDBC/springconfig.xml");
	         
	        
	        EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
	        Employee employee = employeeDao.read(1);
	        System.out.println(employee);//System.out.println(employeeDao.read(1));
		
	}

	
	private static void delete() {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
	      		   "com/examples/S05SpringJDBC/springconfig.xml");
	         
	        
	        EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
	        employeeDao.delete(2);
	}
	private static void update() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
	      		   "com/examples/S05SpringJDBC/springconfig.xml");
	         
	        
	        EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
	        
	        Employee emp2 = new Employee();
	        emp2.setId(1);
	        emp2.setFirstName("DP");
	        emp2.setLastName("LaMbda");
	        
	        employeeDao.update(emp2);
			
		
	}

	private static void create() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
      		   "com/examples/S05SpringJDBC/springconfig.xml");
         
        
        EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
        
        Employee emp = new Employee();
        emp.setId(2);
        emp.setFirstName("DB");
        emp.setLastName("LM");
        
        employeeDao.create(emp);
		
	}
}
