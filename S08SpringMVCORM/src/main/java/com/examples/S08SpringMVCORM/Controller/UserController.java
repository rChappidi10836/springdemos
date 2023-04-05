package com.examples.S08SpringMVCORM.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examples.S08SpringMVCORM.entity.User;
import com.examples.S08SpringMVCORM.exception.UserAlreadyExistsException;
import com.examples.S08SpringMVCORM.service.UserService;

@Controller
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public String showRegistrationPage(ModelMap model) {
		model.addAttribute("users",userService.getUsers());
		return "userreg";
		
	}
	
	@RequestMapping("/registeruser")
	public String registerUser(@ModelAttribute("user") User user,ModelMap modelmap) {
		int result;
		try {
			result = userService.save(user);
			modelmap.addAttribute("message","User created with id "+result);
			modelmap.addAttribute("users",userService.getUsers());
		} catch (UserAlreadyExistsException uaxe) {
			modelmap.addAttribute("message",uaxe.getMessage());
		}
		
//		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/userreg"); 
//		try {
//			rd.forward(request, response);
//		} catch (ServletException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		return "userreg";
		
	}
	
	@RequestMapping("/users")
	public String getUsers(ModelMap model) {
		model.addAttribute("users",userService.getUsers());
		return "displayusers";
	}
	
}
