package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/")
	public String home() {
		return "This is homepage";
	}
	
	
	public String saveSeller() {
		return "Seller Saved";
	}
}
