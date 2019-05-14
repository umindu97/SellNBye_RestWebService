package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Seller;
import com.example.demo.repository.SellerRepository;

@Service
@Transactional
public class SellerService {

	private final SellerRepository sellerRepository;
	
	public SellerService(SellerRepository sellerRepository) {
		this.sellerRepository = sellerRepository;
		
	}
	public void saveMySeller(Seller seller) {
		
		sellerRepository.save(seller);
	}
	
}
