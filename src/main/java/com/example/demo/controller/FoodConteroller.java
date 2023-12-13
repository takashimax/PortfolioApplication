//package com.example.demo.controller;
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class FoodConteroller {
//	private static final String ITEMS = "test";
//	@GetMapping("/food")
//	public String category(@RequestParam(ITEMS) String items, Model model) {
//		model.addAttribute(ITEMS, items);
//		return items;
//	}
//}
