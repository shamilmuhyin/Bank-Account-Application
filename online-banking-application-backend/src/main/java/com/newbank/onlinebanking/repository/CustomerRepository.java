package com.newbank.onlinebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newbank.onlinebanking.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	Customer findByEmailId(String email);
}
