package com.newbank.onlinebanking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter 
@Entity(name = "CUSTOMER")
public class Customer {

	@Id
	public int customerId;
	public String emailId;
	public String name;
	public long mobileNumber;
	
}
