package com.newbank.onlinebanking.requestEntity;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class CustomerRequestEntity {

	public int customerId;
	public String emailId;
	public String name;
	public long mobileNumber;	
}
