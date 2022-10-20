package com.newbank.onlinebanking.requestEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class CustomerRequest {

	public int customerId;
	public String firstName;
	public String lastName;
	public long mobileNumber;
	public Date dob;
	public String emailId;
	public String password;	
	
	List<AddressRequest> addresses = new ArrayList<AddressRequest>();
}
