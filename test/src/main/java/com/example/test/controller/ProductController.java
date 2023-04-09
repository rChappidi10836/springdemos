package com.example.test.controller;

import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test.entity.Product;
import com.example.test.repository.ProductRepository;

@Controller
public class ProductController {
    
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/product")
    public String getProduct(Model model) {
        Product product = productRepository.findById(1).get();
        model.addAttribute("product", product);
        return "product";
    }
}

