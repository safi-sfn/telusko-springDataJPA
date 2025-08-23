package com.InXod.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.InXod.repository.IVaccineRepository;
import com.InXod.view.View;


@Service
public class VaccineServiceImpl implements IVaccineService {
	
	IVaccineRepository vaccRepo ;

	@Autowired
	public void setVaccRepo(IVaccineRepository vaccRepo) {
		this.vaccRepo = vaccRepo;
	}

	@Override
	public <T extends View> List<T> searchByVaccineCostLessThan(Double vaccCost,  Class<T> clss) {
		return vaccRepo.findByVaccineCostLessThan(vaccCost, clss);
	}
		
}
