package com.newbank.onlinebanking.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="MANAGER")
public class Manager {

	@Id
	public int managerId;
	public String firstName;
	public String lastName;
	public String branchName;
	public String emailId;
	public String password;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="managerId", referencedColumnName="managerId")
	List<Customer> customers = new ArrayList<Customer>();
}
