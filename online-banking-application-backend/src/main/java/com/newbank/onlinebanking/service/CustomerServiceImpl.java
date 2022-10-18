package com.newbank.onlinebanking.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.newbank.onlinebanking.entity.Customer;
import com.newbank.onlinebanking.repository.CustomerRepository;
import com.newbank.onlinebanking.requestEntity.CustomerRequestEntity;
import com.newbank.onlinebanking.responseEntity.CustomerResponseEntity;

@Component
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepo;

	@Override
	public CustomerResponseEntity registerCustomer(CustomerRequestEntity cReqEntity) {
		Customer customer = new Customer();
		BeanUtils.copyProperties(cReqEntity, customer);
		customerRepo.save(customer);
		CustomerResponseEntity cResEntity = new CustomerResponseEntity();
		BeanUtils.copyProperties(customer, cResEntity);
		return cResEntity;
	}
}
