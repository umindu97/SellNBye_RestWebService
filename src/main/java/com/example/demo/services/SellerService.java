package com.example.demo.services;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.example.demo.model.Seller;
import com.example.demo.repository.SellerRepository;

@Service
@Transactional
public class SellerService {

	//create object of SellerRepository to get crud to the saveMySeller method
	private final SellerRepository sellerRepository;
	
	public SellerService(SellerRepository sellerRepository) {
		
		this.sellerRepository = sellerRepository;
		
	}
	
	//save data to the table
	public void saveMySeller(Seller seller) {
		
		sellerRepository.save(seller);
	}
	
}
