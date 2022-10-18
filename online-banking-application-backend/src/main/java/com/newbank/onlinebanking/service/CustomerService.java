package com.newbank.onlinebanking.service;

import com.newbank.onlinebanking.requestEntity.CustomerRequestEntity;
import com.newbank.onlinebanking.responseEntity.CustomerResponseEntity;

public interface CustomerService {
	public CustomerResponseEntity registerCustomer(CustomerRequestEntity cReqEntity);
}
