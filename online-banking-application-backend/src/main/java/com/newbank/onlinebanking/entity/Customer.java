package com.newbank.onlinebanking.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter 
@Entity(name = "CUSTOMER")
public class Customer {

	@Id
	@GeneratedValue
	public int customerId;
	public String firstName;
	public String lastName;
	public long mobileNumber;
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date dob;
	public String emailId;
	public String password;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	List<Address> addresses;
	
}
