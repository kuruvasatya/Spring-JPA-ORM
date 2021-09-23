package com.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Vehicle {
	@Id
	int id;
	String brand;
	
	@ManyToOne(fetch=FetchType.EAGER)
	Human owner;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int id, String brand, Human owner) {
		super();
		this.id = id;
		this.brand = brand;
		this.owner = owner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Human getOwner() {
		return owner;
	}

	public void setOwner(Human owner) {
		this.owner = owner;
	}

}
