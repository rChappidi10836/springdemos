package com.example.S13SpringBootREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.S13SpringBootREST.repository.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductWebController {
	
	@Autowired
	private ProductRepository repo;
	
	@GetMapping
	public String getProducts(ModelMap model) {
		model.addAttribute("products",repo.findAll());
		return "products";
	}
}
