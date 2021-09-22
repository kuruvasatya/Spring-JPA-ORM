package com.single_table;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FourWheeler1")
public class FourWheeler extends vehicle {
	String steringWheel;

	public String getSteringWheel() {
		return steringWheel;
	}

	public void setSteringWheel(String steringWheel) {
		this.steringWheel = steringWheel;
	}

}
