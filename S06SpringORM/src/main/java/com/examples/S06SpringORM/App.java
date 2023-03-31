package com.examples.S06SpringORM;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S06SpringORM.dao.ProductDao;
import com.examples.S06SpringORM.entity.Product;

public class App 
{
    public static void main( String[] args )
    {
//    	create();
    	
//    	update();
    	
//    	delete();
    	
//    	find();
    	
    	findAll();
    }
    
    
    private static void findAll() {
		
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringORM/springconfig.xml");
	       ProductDao productDao = (ProductDao) ctx.getBean("productdao");
	      
	       List<Product> products = productDao.findAll();
	       System.out.println(" products found are \n"+products);
	}


	private static void find() {
		
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringORM/springconfig.xml");
	       ProductDao productDao = (ProductDao) ctx.getBean("productdao");
	       
	      
	       Product product = productDao.find(1);
	       System.out.println(" product found is "+product);
	}


	private static void delete() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringORM/springconfig.xml");
	       ProductDao productDao = (ProductDao) ctx.getBean("productdao");
	       
	       Product product = new Product();
	       product.setId(1);
	       productDao.delete(product);
	       System.out.println(" product deleted");
	}
    
	private static void update() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringORM/springconfig.xml");
	       ProductDao productDao = (ProductDao) ctx.getBean("productdao");
	       
	       Product product = new Product();
	       product.setId(2);
	       product.setName("balm");
	       product.setDescription("body pains");
	       product.setPrice(89.99);
	       
	       productDao.update(product);
	       System.out.println(" product updated");
	}

	private static void create() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringORM/springconfig.xml");
       ProductDao productDao = (ProductDao) ctx.getBean("productdao");
       
       Product product = new Product();
       product.setId(1);
       product.setName("brush");
       product.setDescription("auto-clean");
       product.setPrice(2599.999);
       
       int result = productDao.create(product);
       System.out.println(result + " product created");
	}
}
