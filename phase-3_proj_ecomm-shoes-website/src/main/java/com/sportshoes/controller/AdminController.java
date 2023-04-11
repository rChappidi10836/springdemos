package com.sportshoes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sportshoes.entity.Admin;
import com.sportshoes.entity.Bills;
import com.sportshoes.entity.Product;
import com.sportshoes.repository.AdminRepository;
import com.sportshoes.repository.BillsRepository;
import com.sportshoes.repository.ProductRepository;
import com.sportshoes.repository.UserRepository;

@Controller
public class AdminController {

	@Autowired
	private AdminRepository adrepo;

	@Autowired
	private UserRepository urepo;

	@Autowired
	private BillsRepository brepo;
	
	@Autowired
	private ProductRepository prepo;
	

	@GetMapping("/admin")
	public String gotologin() {
		return "adminlogin";
	}

	@GetMapping("/adminauth")
	public String adminauthenticate(@RequestParam String username, @RequestParam String password, 
			Model model, HttpServletRequest request) {
		HttpSession asession = request.getSession();
		if (adrepo.findByUsernameAndPassword(username, password) != null) {
			asession.setAttribute("id", adrepo.findByUsernameAndPassword(username, password).getId());
			asession.setAttribute("aname", username);
			asession.setAttribute("apwd", password);
			return "adminhome";
		} else {
			model.addAttribute("msg", "enter correct login credientials");
			return "adminlogin";
		}

	}

	@GetMapping("/adminhome")
	public String adminauthenticate(HttpSession session) {
		if (adrepo.findByUsernameAndPassword((String) session.getAttribute("aname"),
				(String) session.getAttribute("apwd")) != null) {
			return "adminhome";
		} else {

			return "adminlogin";
		}

	}
	
	@GetMapping("/apwdupdate")
	public String adminpasswordupdate(HttpSession session) {
		if (session.getAttribute("aname") != null) {
			return "adminpasswordupdate";
		} else {

			return "adminlogin";
		}

	}
	
	@GetMapping("/adminupdate")
	public String adminupdate(@RequestParam String newpwd,HttpSession session,Model model) {
		if (session.getAttribute("aname") != null && (newpwd.equals(session.getAttribute("apwd")))) {	
			model.addAttribute("msg", "old and new password should not be same");
			return "adminpasswordupdate";
		} else if(session.getAttribute("aname") != null){
			Admin a = new Admin((int)session.getAttribute("id"),(String)session.getAttribute("aname"),newpwd);
			adrepo.save(a);
			return "redirect:/adminlogout";
		}
		else {
			return "adminlogin";
		}

	}
	
	@GetMapping("/aproducts")
	public String productslist(Model model, HttpSession session) {
		if (session.getAttribute("aname") != null) {
			model.addAttribute("products", prepo.findAll());
			return "adminproducts";
		} else {
			return "adminlogin";
		}
		
	}
	
	
	
	@GetMapping("/addproductform")
	public String addproductform(HttpSession session) {
		if (session.getAttribute("aname") != null) {
			return "addproduct";
		} else {
			return "adminlogin";
		}
	}
	
	@GetMapping("/addproduct")
	public String addproduct(HttpSession session, @RequestParam String name, @RequestParam String image, @RequestParam String category, @RequestParam int price, @RequestParam String status, Model model) {
	    if (session.getAttribute("aname") != null) {
	        Product product = new Product(name, image, category, price, status);
	        prepo.save(product);
	        model.addAttribute("msg", "table updated with new product");
	        model.addAttribute("products", prepo.findAll());
	        return "adminproducts";
	    } else {
	        return "adminlogin";
	    }    
	}

	
	@GetMapping("/editproductform/{id}")
	public String editproductform(Model model, HttpSession session,@PathVariable String id) {
		if (session.getAttribute("aname") != null) {
			model.addAttribute("product", prepo.findById(Integer.parseInt(id)).get());
			return "editproduct";
		} else {
			return "adminlogin";
		}
	}
	
	@GetMapping("/editproduct")
	public String addproduct(HttpSession session,@RequestParam int id, @RequestParam String name, @RequestParam String image, @RequestParam String category, @RequestParam int price, @RequestParam String status, Model model) {
	    if (session.getAttribute("aname") != null) {
	        Product product = new Product(id,name, image, category, price, status);
	        prepo.save(product);
	        model.addAttribute("msg", "row with id="+id+" updated");
	        model.addAttribute("products", prepo.findAll());
	        return "adminproducts";
	    } else {
	        return "adminlogin";
	    }    
	}
	
	@GetMapping("/ausers")
	public String userslist(Model model, HttpSession session) {
		if (session.getAttribute("aname") != null) {
			model.addAttribute("users", urepo.findAll());
			return "adminusers";
		} else {
			return "adminlogin";
		}
	}

	@GetMapping("/abills")
	public String adminbills(Bills bills, HttpSession s, Model model) {
		try {
			if (s.getAttribute("aname") != null) {
				model.addAttribute("abills", brepo.getBillDetails());
				return "adminbills";
			} else {
				return "adminlogin";
			}
		} catch (Exception e) {
			return "failure";
		}
	}

	@GetMapping("/adminlogout")
	public String userlogout(Model model, HttpSession session) {
		session.removeAttribute("aname");
		session.removeAttribute("pwd");
		if (session != null) {
			session.invalidate();
		}
		model.addAttribute("msg", "Logged out/Password Updated =>To use website login again");
		return "adminlogin";
	}

}
