package com.examples.S07SpringMVCDemo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S07SpringMVCDemo.model.Employee;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelView = new ModelAndView();
		
		modelView.addObject("id",123);
		modelView.addObject("name","Ken");
		modelView.addObject("salary",1000);
		
		modelView.setViewName("hello");
		return modelView;
	}
	
	@RequestMapping("/readobject")
	public ModelAndView read() {
		ModelAndView modelView = new ModelAndView();
		
		Employee emp = new Employee();
		emp.setId(159);
		emp.setName("Zolo");
		emp.setSalary(50000000);
		modelView.addObject("employee", emp);
		
		modelView.setViewName("hello");
		return modelView;
	}
	
	@RequestMapping("/employees")
	public ModelAndView read2() {
		ModelAndView modelView = new ModelAndView();
		
		List<Employee> employees = new ArrayList<>();
		
		Employee emp = new Employee();
		emp.setId(159);
		emp.setName("Zolo");
		emp.setSalary(500000);
		employees.add(emp);
		
		emp = new Employee();
		emp.setId(156);
		emp.setName("sunji");
		emp.setSalary(45000);
		employees.add(emp);
		
		emp = new Employee();
		emp.setId(007);
		emp.setName("Nami");
		emp.setSalary(30000);
		employees.add(emp);
		
		modelView.addObject("employees", employees);
		
		modelView.setViewName("employees");
		return modelView;
	}
	
	
	@RequestMapping("/showdata")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name) {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", id);
		mv.addObject("name", name);
		mv.setViewName("showdata");
		return mv;
		
	}
}
