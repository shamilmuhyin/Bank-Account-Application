package com.newbank.onlinebanking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity(name = "ADDRESS")
public class Address {

	@Id
	@GeneratedValue
	public int addressId;
	public String addressLine;
	public String city;
	public String state;
	public int pincode;
	
	@ManyToOne
	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	public Customer customerId;
}
