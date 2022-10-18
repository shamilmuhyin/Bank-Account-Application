package com.newbank.onlinebanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newbank.onlinebanking.requestEntity.CustomerRequestEntity;
import com.newbank.onlinebanking.responseEntity.CustomerResponseEntity;
import com.newbank.onlinebanking.service.CustomerService;

@RestController 
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping(path = "/registerCustomer")
	public CustomerResponseEntity registerCustomer(@RequestBody CustomerRequestEntity cReqEntity) {
		CustomerResponseEntity cResEntity = new CustomerResponseEntity();
		cResEntity = customerService.registerCustomer(cReqEntity);
		return cResEntity;
	}
}
