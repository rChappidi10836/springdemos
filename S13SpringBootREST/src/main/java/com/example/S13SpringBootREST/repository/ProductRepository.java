package com.example.S13SpringBootREST.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.S13SpringBootREST.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	// CUSTOM FINDERS: 
	
	List<Product> findByName(String name);// CUSTOM FINDERS: no need to define Spring will auto-matically define by naming conventions
	
	List<Product> findByNameAndPrice(String name, Double price);// we can even combine multiple findings
}
