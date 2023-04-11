package com.sportshoes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sportshoes.entity.Users;
import com.sportshoes.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository urepo;
	
	@GetMapping("/userauthn")
	public String userauthen(@RequestParam String username, @RequestParam String password,Users user,Model model,HttpServletRequest request,HttpServletResponse response) {
		HttpSession usession = request.getSession();
		if(urepo.findBynameAndPwd(username, password) != null) {
			usession.setAttribute("username", username);
			usession.setAttribute("password", password);
			usession.setAttribute("uid", urepo.findBynameAndPwd(username, password).getUid());
			return "redirect:/sportyshoes.com";
		}else {
			model.addAttribute("msg", "enter correct login credientials");
			return "userlogin";
		}
	
	}
	
	@GetMapping("/useregform")
	public String useregistrationform() {
		return "useregform";
		
	}
	
	@GetMapping("/usereg")
	public String userregister(Model model,@RequestParam String username, @RequestParam String password,@RequestParam String phno,@RequestParam String address) {
		Users u = new Users(username,password,Long.parseLong(phno),address);
		urepo.save(u);
		model.addAttribute("msg", "REGISTRATION COMPLETED");
		return "userlogin";
	}
	
	@GetMapping("/userlogout")
	public String userlogout(Model model,HttpSession s) {
		s.removeAttribute("username");
		s.removeAttribute("password");
		if(s != null) {
			s.invalidate();
		}
		model.addAttribute("msg", "Logged out =>To use website login again");
		return "userlogin";
	}
}
