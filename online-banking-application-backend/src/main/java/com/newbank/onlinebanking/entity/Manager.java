package com.newbank.onlinebanking.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="MANAGER")
public class Manager {

	@Id
	@GeneratedValue
	int managerId;
	String firstName;
	String lastName;
	String branchName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="managerId", referencedColumnName="managerId")
	List<Customer> customers = new ArrayList<Customer>();
}
