package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.FlightModel;
import com.cg.repository.EmpProfileRepository;

@Service
public class FlightServiceImp implements FlightService {

	private EmpProfileRepository repository;
	
	@Autowired 
	public FlightServiceImp(EmpProfileRepository emprepo) {
		super();
		this.repository = emprepo;
	}
	
	
	@Override
	public FlightModel addFlightDetails(FlightModel empd) {
		FlightModel empsave=repository.save(empd);
		return empsave;
	}

	@Override
	public List<FlightModel> getallFlightDetails() {
		return (List<FlightModel>)repository.findAll();
	}

	@Override
	public void deleteFlightDetails(int empd) {
			repository.deleteById(empd);
	
		
	}


	@Override
	public FlightModel updateFlightDetails(FlightModel uempd) {
		FlightModel record;
		Optional<FlightModel> opt=repository.findById(uempd.getFlightNo());
		if(opt.isPresent()) {
	    record=opt.get();
		record.setFlightName(uempd.getFlightName());
		record.setFlightOriging(uempd.getFlightOriging());
		record.setFlightDestination(uempd.getFlightDestination());
		repository.save(record);
		}else {
			return new FlightModel();
		}
		return record;
	}

}
