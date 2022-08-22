package com.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		
		String str="Minhaz";
		
		
		return "home";
	}
	
	@RequestMapping("/student-registration")
	public String studentreg() {
		
		
		
		
		return "student-registration";
	}

}
