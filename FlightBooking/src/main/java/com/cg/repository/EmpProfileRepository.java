package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.FlightModel;


public interface EmpProfileRepository extends MongoRepository<FlightModel, Integer> {

}
