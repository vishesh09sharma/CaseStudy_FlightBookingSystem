package com.cg.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Booking")
public class FlightModel {

	//Attributes
	@Id
	private int flightNo;
	private String flightName,flightOriging,flightDestination;
	public FlightModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightModel(int flightNo, String flightName, String flightOriging, String flightDestination) {
		super();
		this.flightNo = flightNo;
		this.flightName = flightName;
		this.flightOriging = flightOriging;
		this.flightDestination = flightDestination;
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightOriging() {
		return flightOriging;
	}
	public void setFlightOriging(String flightOriging) {
		this.flightOriging = flightOriging;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	@Override
	public String toString() {
		return "EmployeeModel [flightNo=" + flightNo + ", flightName=" + flightName + ", flightOriging=" + flightOriging
				+ ", flightDestination=" + flightDestination + "]";
	}
	
}
