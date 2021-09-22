package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	String company;
	double salary;
	
	public Alien() {
		// TODO Auto-generated constructor stub
	}

	public Alien(String name, String company, double salary) {
		super();
		this.name = name;
		this.company = company;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", company=" + company + ", salary=" + salary + "]";
	}

	
}
