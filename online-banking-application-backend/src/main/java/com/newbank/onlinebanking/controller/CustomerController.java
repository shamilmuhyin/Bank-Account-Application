package com.newbank.onlinebanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newbank.onlinebanking.requestEntity.CustomerRequest;
import com.newbank.onlinebanking.responseEntity.CustomerResponse;
import com.newbank.onlinebanking.service.CustomerService;

@RestController 
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping(path = "/registerCustomer")
	public CustomerResponse registerCustomer(@RequestBody CustomerRequest cReqEntity) {
		//if customer already exist throw exception
		CustomerResponse cResEntity = new CustomerResponse();
		cResEntity = customerService.registerCustomer(cReqEntity);
		return cResEntity;
	}
}
