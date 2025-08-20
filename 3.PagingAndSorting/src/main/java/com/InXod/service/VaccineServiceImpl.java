package com.InXod.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.InXod.model.Vaccine;
import com.InXod.repository.IVaccineRepository;

@Service
public class VaccineServiceImpl implements IVaccineService {
	
	IVaccineRepository vaccRepo ;

	@Autowired
	public void setVaccRepo(IVaccineRepository vaccRepo) {
		this.vaccRepo = vaccRepo;
	}

	@Override
	public Iterable<Vaccine> fetchVaccineInfoBySorting(boolean status, String... properties) {
		
		// Create Sort object based on status and properties
	    // If status is true -> ASC (Ascending) order
	    // If status is false -> DESC (Descending) order
		// using ternary operator  / (condition ? valueIfTrue : valueIfFalse)
		Sort sort = Sort.by(status?Direction.ASC : Direction.DESC, properties);
		
		// Fetch all vaccine records from repository with the specified sorting
		return vaccRepo.findAll(sort);
	}
	
	
}
