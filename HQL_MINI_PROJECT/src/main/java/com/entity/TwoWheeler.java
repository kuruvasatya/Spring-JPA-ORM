package com.entity;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {
	int gears;

	public TwoWheeler() {
		// TODO Auto-generated constructor stub
	}

	public TwoWheeler(int id, String brand, int gears, Human human) {
		super(id, brand, human);
		this.gears = gears;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	@Override
	public String toString() {
		return "TwoWheeler [gears=" + gears + ", id=" + id + ", brand=" + brand + "]";
	}

}
