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
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public CustomerRequest getCustomerId() {
		return customerId;
	}
	public void setCustomerId(CustomerRequest customerId) {
		this.customerId = customerId;
	}
	
	
}
