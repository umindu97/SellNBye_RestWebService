package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Seller;
import com.example.demo.services.SellerService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private SellerService sellerService;
	
	@GetMapping("/")
	public String home() {
		return "This is homepage";
	}
	
	//seller saving method
	@GetMapping("/saveseller")
	public String saveSeller(@RequestParam String fname, @RequestParam String lname) {
		Seller seller = new Seller(fname, lname);
		sellerService.saveMySeller(seller);
		return "Seller Saved";
	}
}
