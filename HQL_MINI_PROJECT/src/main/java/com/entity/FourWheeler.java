package com.entity;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle {

	int seats;

	public FourWheeler() {
		// TODO Auto-generated constructor stub
	}

	public FourWheeler(int id, String brand, int seats, Human human) {
		super(id, brand, human);
		this.seats = seats;

	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "FourWheeler [seats=" + seats + ", id=" + id +  ", brand=" + brand + "]";
	}

}
