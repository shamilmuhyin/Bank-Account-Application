package com.newbank.onlinebanking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.newbank.onlinebanking.customException.UserExistsException;
import com.newbank.onlinebanking.entity.Address;
import com.newbank.onlinebanking.entity.Customer;
import com.newbank.onlinebanking.repository.CustomerRepository;
import com.newbank.onlinebanking.requestEntity.AddressRequest;
import com.newbank.onlinebanking.requestEntity.CustomerRequest;
import com.newbank.onlinebanking.responseEntity.AddressResponse;
import com.newbank.onlinebanking.responseEntity.CustomerResponse;

@Component
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepo;

	@Override
	public CustomerResponse registerCustomer(CustomerRequest cReqEntity) {
		CustomerResponse cResEntity = new CustomerResponse();
		Customer customer = customerRepo.findByEmailId(cReqEntity.getEmailId());
		if(customer == null) {
			customer = setEntityProperties(cReqEntity);
			customer = customerRepo.save(customer);
			cResEntity = setResponseProperties(customer);	
		} 
		else {
			throw new UserExistsException("Email exist, please login");
		}
		return cResEntity;
	}

	private CustomerResponse setResponseProperties(Customer customer) {
		CustomerResponse cResEntity = new CustomerResponse();
		BeanUtils.copyProperties(customer, cResEntity);
		List<AddressResponse> addressesRes = new ArrayList<AddressResponse>();
		List<Address> addresses = customer.getAddresses();
		for(Address address:addresses) {
			AddressResponse addressRes = new AddressResponse();
			BeanUtils.copyProperties(address, addressRes);
			addressesRes.add(addressRes);
		}
		cResEntity.setAddresses(addressesRes);
		return cResEntity;
	}

	private Customer setEntityProperties(CustomerRequest cReqEntity) {
		Customer customer = new Customer();
		BeanUtils.copyProperties(cReqEntity, customer);
		List<Address> addresses = new ArrayList<Address>();
		List<AddressRequest> addressRequests = cReqEntity.getAddresses();
		for(AddressRequest addressVar:addressRequests) {
			Address address = new Address();
			BeanUtils.copyProperties(addressVar,address);
			addresses.add(address);
		}
		customer.setAddresses(addresses);
		return customer;
	}
}
