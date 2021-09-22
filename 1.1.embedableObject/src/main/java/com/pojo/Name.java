package com.pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Name {
	@Column(name="First_Name")
	private String fname;
	
	@Column(name="Last_Name")
	private String lname;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Name [fname=" + fname + ", lname=" + lname + "]";
	}
}
