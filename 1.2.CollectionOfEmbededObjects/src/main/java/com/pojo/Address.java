package com.pojo;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	String city;
	String pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
