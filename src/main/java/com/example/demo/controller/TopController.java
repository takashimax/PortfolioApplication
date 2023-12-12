package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class TopController {
	public TopController() {
	}

	@GetMapping("/")
	public String Index(Model model) {
		String name = "name";
		model.addAttribute("name",name);
		return "index";
	}

	@GetMapping("/login")
	public String Login() {
		return "login";
	}

	@GetMapping("/signup")
	public String Signup() {
		return "signup";
	}
	
	@GetMapping("/post")
	public String Post() {
		return "post";
	}
	

}