package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.FlightModel;
import com.cg.service.FlightService;

@Component
@RestController
@RequestMapping("/api/admin")
public class FlightController {
	
	private FlightService service;
	
	@Autowired
	public FlightController(FlightService emps) {
		super();
		this.service = emps;
	}
	
	@PostMapping("/add")
	public ResponseEntity<FlightModel> addEmployee(@RequestBody  FlightModel empadd){
		FlightModel empsave=service.addFlightDetails(empadd);
		return new ResponseEntity<>(empsave,HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<FlightModel>> Employee(){
	return new ResponseEntity<List<FlightModel>>((List<FlightModel>)service.getallFlightDetails(),HttpStatus.OK);
	}
	
	@DeleteMapping("/cancel/{empID}")
	public ResponseEntity<Void> deleteEmployeeById(@PathVariable int empID){
		service.deleteFlightDetails(empID);
		return ResponseEntity.noContent().build();
	}
	@PutMapping("/update")
	public FlightModel updateEmployee(@RequestBody FlightModel empu) {
		return service.updateFlightDetails(empu);
		
	}
	

}
