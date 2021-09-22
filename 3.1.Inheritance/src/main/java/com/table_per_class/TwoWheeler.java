package com.table_per_class;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TwoWheeler2")
public class TwoWheeler extends vehicle {
	String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}

}
