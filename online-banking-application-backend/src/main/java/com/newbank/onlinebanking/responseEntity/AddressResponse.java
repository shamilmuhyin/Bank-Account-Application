package com.newbank.onlinebanking.responseEntity;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class AddressResponse {

	public int addressId;
	public String addressLine;
	public String city;
	public String state;
	public int pincode;
	public CustomerResponse customer;
}
