package com.InXod.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.InXod.repository.IVaccineRepository;


@Service
public class VaccineServiceImpl implements IVaccineService {
	
	IVaccineRepository vaccRepo ;

	@Autowired
	public void setVaccRepo(IVaccineRepository vaccRepo) {
		this.vaccRepo = vaccRepo;
	}
		
}
