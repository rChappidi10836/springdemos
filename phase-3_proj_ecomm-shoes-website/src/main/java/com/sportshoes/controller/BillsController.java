package com.sportshoes.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.sportshoes.entity.Bills;
import com.sportshoes.repository.BillsRepository;
import com.sportshoes.repository.ProductRepository;
import com.sportshoes.repository.UserRepository;

@Controller
public class BillsController {
	
	
	@Autowired
	private BillsRepository brepo;
	
	@Autowired
	private UserRepository urepo;
	
	@Autowired
	private ProductRepository prepo;
	
	@GetMapping("/savebill/{id}/{price}")
	public String dsave(@PathVariable("id") String id, @PathVariable("price") String price,Bills bills,HttpSession s) {
		try {
		if(s.getAttribute("username")!=null) {
		bills.setUser(urepo.findByuid((int)s.getAttribute("uid")));
		bills.setProduct(prepo.findByid(Integer.parseInt(id)));
		bills.setDate((String) s.getAttribute("OrderDate"));
		bills.setAmount(Long.parseLong(price));
//		System.out.println("THe recieved uid "+pid);
		brepo.save(bills);
		return "success";
		 }else {
         	return "userlogin";
         }
		} catch (Exception e) {
            return "failure";
        }
	}
	
	

}
