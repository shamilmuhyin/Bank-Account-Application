package com.newbank.onlinebanking.requestEntity;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class AddressRequest {

	public int addressId;
	public String addressLine;
	public String city;
	public String state;
	public int pincode;
	public CustomerRequest customerId;
}
