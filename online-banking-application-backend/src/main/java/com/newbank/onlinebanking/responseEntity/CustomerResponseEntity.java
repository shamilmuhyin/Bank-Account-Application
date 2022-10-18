package com.newbank.onlinebanking.responseEntity;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class CustomerResponseEntity {

	public int customerId;
	public String emailId;
	public String name;
	public long mobileNumber;
}
