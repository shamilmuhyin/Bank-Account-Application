package com.newbank.onlinebanking.responseEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class CustomerResponse {

	public int customerId;
	public String firstName;
	public String lastName;
	public long mobileNumber;
	public Date dob;
	public String emailId;
	public String password;
	
	List<AddressResponse> addresses = new ArrayList<AddressResponse>();
}
