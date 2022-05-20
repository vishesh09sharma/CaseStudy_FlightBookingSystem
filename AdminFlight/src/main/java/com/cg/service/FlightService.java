package com.cg.service;

import java.util.List;

import com.cg.model.FlightModel;

public interface FlightService {

	public FlightModel addFlightDetails(FlightModel empd);
	public List<FlightModel> getallFlightDetails();
	public void deleteFlightDetails(int empd);
	public FlightModel updateFlightDetails(FlightModel uempd);
	
	
}
