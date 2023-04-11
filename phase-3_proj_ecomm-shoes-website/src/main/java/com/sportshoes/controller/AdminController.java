package com.sportshoes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sportshoes.entity.Admin;
import com.sportshoes.repository.AdminRepository;
import com.sportshoes.repository.UserRepository;

@Controller
public class AdminController {

	@Autowired
	private AdminRepository adrepo;

	@Autowired
	private UserRepository urepo;

	@GetMapping("/admin")
	public String gotologin() {
		return "adminlogin";
	}

	@GetMapping("/adminauth")
	public String adminauthenticate(@RequestParam String username, @RequestParam String password, Admin admin,
			Model model, HttpServletRequest request) {
			HttpSession session = request.getSession();
		if (adrepo.findByUsernameAndPassword(username, password) != null) {
			session.setAttribute("aname", username);
			session.setAttribute("apwd", password);
			return "adminhome";
		} else {
			model.addAttribute("msg", "enter correct login credientials");
			return "adminlogin";
		}

	}
	
	@GetMapping("/adminhome")
	public String adminauthenticate(HttpSession session) {
		if (adrepo.findByUsernameAndPassword((String)session.getAttribute("aname"),(String)session.getAttribute("apwd")) != null) {
			
			return "adminhome";
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
	
	@GetMapping("/adminlogout")
	public String userlogout(Model model,HttpSession session) {
		session.removeAttribute("aname");
		session.removeAttribute("pwd");
		if(session != null) {
			session.invalidate();
		}
		model.addAttribute("msg", "Logged out =>To use website login again");
		return "adminlogin";
	}

}
