package com.example.S11SpringBootDataJPA;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.S11SpringBootDataJPA.entity.Product;
import com.example.S11SpringBootDataJPA.repository.ProductRepository;

@SpringBootTest
class S11SpringBootDataJpaApplicationTests {
	
	
	@Autowired
	ApplicationContext context;
	
	@Test
	void contextLoads() {
	}
	
//	@Test
	
	void createProduct() {
		Product product = new Product();
		product.setName("Croocks");
		product.setDesc("silicon made effective long lasting");
		product.setPrice(2499);
		
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		productRepository.save(product);
	}
	
	//@Test
	void readProduct() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct = productRepository.findById(6);
		if(optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			System.out.println(product);
		}else {
			System.out.println("Product not present in db for given id");
		}
	}
	
	//@Test
	void updateProduct() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct = productRepository.findById(3);
		if(optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			product.setPrice(10000);
			productRepository.save(product);
			System.out.println(product);
		}else {
			System.out.println("Product not present in db for given id");
		}
	}
	
//	@Test
	void readAllProduct() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		List<Product> products = (List<Product>) productRepository.findAll();
		for(Product i : products)
			System.out.println(i);
	}
	
	@Test
	void readAllProductsByName() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		List<Product> products = (List<Product>) productRepository.findByName("croocks");
		for(Product i : products)
			System.out.println(i);
	}
}
