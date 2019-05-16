package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Seller;
import com.example.demo.services.SellerService;

@Controller
public class indexController {

	@Autowired
	private SellerService sellerService;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/Login")
	public String Login() {
		return "Login";
	}
	
	@RequestMapping("/regform")
	public String regform() {
		return "regform";
	}
	
	@RequestMapping("/addproduct")
	public String addproduct() {
		return "addproduct";
	}
	
	@RequestMapping("/seller")
	public String seller() {
		return "seller";
	}
	
	@RequestMapping("/updateproduct")
	public String updateproduct() {
		return "updateproduct";
	}
	
	@PostMapping("/save-seller")
	public String sellerRegistration(@ModelAttribute Seller seller, BindingResult bindingResult, HttpServletRequest request) {
		sellerService.saveMySeller(seller);
		return "regform";
	}
	
}
