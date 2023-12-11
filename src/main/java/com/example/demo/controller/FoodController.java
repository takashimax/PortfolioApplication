package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {
	public FoodController(){
	}
	
    @GetMapping("/")
    public String helloWorld(Model model) {
        return "index";
    }
}