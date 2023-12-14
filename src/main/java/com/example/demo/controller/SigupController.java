package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.User;

@Controller
@RequestMapping("user")
public class SigupController {

	@GetMapping("/signup")
	public String getSignup(Model model) {
		return "/signup";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user,
			Model model) {
		StringBuilder sb = new StringBuilder();
		sb.append(user.getName());
		sb.append(user.getEmail());
		sb.append(user.getPassword());

		model.addAttribute("userData", sb.toString());
		return "redirect:/login";
	}
}
