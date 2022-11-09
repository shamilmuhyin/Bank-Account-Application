package com.newbank.onlinebanking.service;

import com.newbank.onlinebanking.requestEntity.CustomerRequest;
import com.newbank.onlinebanking.responseEntity.CustomerResponse;

public interface ManagerService {
	public CustomerResponse registerCustomer(CustomerRequest cReqEntity);
}
