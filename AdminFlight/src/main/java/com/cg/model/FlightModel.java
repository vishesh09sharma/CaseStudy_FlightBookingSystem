package com.cg.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Admin")
public class FlightModel {

	//Attributes
	@Id
	private int flightId;
	private String flightName,flightOriging,flightDestination;
	Date flightDate;
	public FlightModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightModel(int flightId, String flightName, String flightOriging, String flightDestination,Date flightDate) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.flightOriging = flightOriging;
		this.flightDestination = flightDestination;
	}

	public Date getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightNo(int flightId) {
		this.flightId = flightId;
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
		return "FlightModel [flightId=" + flightId + ", flightName=" + flightName + ", flightOriging=" + flightOriging
				+ ", flightDestination=" + flightDestination + ", flightDate=" + flightDate + "]";
	}
	
	
}
