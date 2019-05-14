package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Seller;

public interface SellerRepository extends CrudRepository<Seller, Integer> {

}
