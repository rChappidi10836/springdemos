package com.examples.S07SpringMVCDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.examples.S07SpringMVCDemo.model.User;

@Controller
public class UserController {
	
	@RequestMapping("/register")
	public String showRegistrationPage() {
		return "Registeruser";
	}
//	public ModelAndView showRegistrationPage() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("Registeruser");
//		return mv;
//	}
	
	@RequestMapping(value="/signupuser",method=RequestMethod.POST)
	public String SignupUser(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println("From UI. Retrieved object from spring container: "+user);
		model.addAttribute("user",user);
		//mv.setViewName("Registeruserresult");
		//mv.setViewName("Registeruser"); //ui to contoller controller to ui like a loop
		return "Registeruserresult";
	}
//	public ModelAndView SignupUser(@ModelAttribute("user") User user) {
//		System.out.println("From UI. Retrieved object from spring container: "+user);
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("user",user);
//		mv.setViewName("Registeruserresult");
//		//mv.setViewName("Registeruser"); ui to contoller controller to ui
//		return mv;
//	}
}
