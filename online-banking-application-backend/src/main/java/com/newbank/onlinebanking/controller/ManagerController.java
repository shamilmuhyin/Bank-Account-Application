package com.newbank.onlinebanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newbank.onlinebanking.requestEntity.CustomerRequest;
import com.newbank.onlinebanking.responseEntity.CustomerResponse;
import com.newbank.onlinebanking.service.ManagerService;

@RestController 
@RequestMapping("/manager")
@CrossOrigin(origins = "http://localhost:4200")
public class ManagerController {
	
	@Autowired
	private ManagerService customerService;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@PostMapping(path = "/registerCustomer")
	public CustomerResponse registerCustomer(@RequestBody CustomerRequest cReqEntity) {
		CustomerResponse cResEntity = new CustomerResponse();
		String encodedPassword = passwordEncoder.encode(cReqEntity.getPassword());
		cReqEntity.setPassword(encodedPassword);
		cResEntity = customerService.registerCustomer(cReqEntity);
		return cResEntity;
	}
}
