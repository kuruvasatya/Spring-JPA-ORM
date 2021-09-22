package com.pojo;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import java.util.*;

@Entity
@Table(name="EmployeeCol")
public class Employee {
	@Id
	int empId;
	String empName;
	
	@ElementCollection
	@JoinTable(name="Addressess",joinColumns = @JoinColumn(name="id"))
	Set<Address> listOfAddress = new HashSet<Address>();

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Set<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Set<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
	
	
}
