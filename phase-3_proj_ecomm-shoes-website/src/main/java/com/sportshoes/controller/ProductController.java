package com.sportshoes.controller;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sportshoes.entity.Product;
import com.sportshoes.entity.Users;
import com.sportshoes.repository.ProductRepository;
import com.sportshoes.repository.UserRepository;

@Controller
public class ProductController {
    
    @Autowired
    private ProductRepository repo;
    
    @Autowired
    private UserRepository urepo;
    
    @RequestMapping("/sportyshoes.com")
    public String getProduct(Model model,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(session.getAttribute("username")!=null) {
    	model.addAttribute("products",repo.findAll());
        return "product";
        }else {
        	return "userlogin";
        }
    }
    
    @GetMapping("/products/{category}")
    public String getProductsByCategory(@PathVariable String category, Model model, HttpSession session) {
    	if(session.getAttribute("username")!=null) {
        	 List<Product> products = repo.getProductsByCategory(category);
        model.addAttribute("products", products);
//        model.addAttribute("category", category);
        return "product";
            }else {
            	return "userlogin";
            }
       
    }
    
    @GetMapping("/payment/{id}")
    public String getPayment(@PathVariable int id, Model model,Users user, HttpSession s) {
    	if(s.getAttribute("username")!=null) {
			model.addAttribute("user", urepo.findByuid((int) s.getAttribute("uid")));
			model.addAttribute("product", repo.findByid(id));
			return "payment";
            }else {
            	return "userlogin";
            }
    	
    	
    }
}

