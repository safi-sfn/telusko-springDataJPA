package com.InXod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InXod.model.Vaccine;
import com.InXod.repository.IVaccineRepository;

@Service
public class VaccineServiceImpl implements IVaccineService {

	@Autowired
	IVaccineRepository vaccRepo;
	
	@Override
	public String registerVaccineDetails(Vaccine vaccine) {
		
		Vaccine vacc = vaccRepo.save(vaccine);
		
		return "Vaccine Info is Stored with Id :"+vacc.getVaccineId();
	}

	@Override
	public Iterable<Vaccine> registerMultipleVaccine(Iterable<Vaccine> vaccine) {
		
		return vaccRepo.saveAll(vaccine);
	}

	
}
