package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	
	
}


