package com.InXod.service;


import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Vaccine> searchByvaccineCost(Double vaccineCost) {
		
		return vaccRepo.findByvaccineCost(vaccineCost);
	}

	@Override
	public List<Vaccine> searchByvaccineCostIs(Double vaccineCost) {
		
		return vaccRepo.findByvaccineCostIs(vaccineCost);
	}

	@Override
	public List<Vaccine> searchByvaccineCostEquals(Double vaccineCost) {
		
		return vaccRepo.findByvaccineCostEquals(vaccineCost);
	}

	@Override
	public List<Vaccine> searchByvaccineCostLessThanEqual(Double vaccineCost) {
	
		return vaccRepo.findByvaccineCostLessThanEqual(vaccineCost);
	}

	@Override
	public List<Vaccine> searchByvaccineCostBetween(Double minVaccineCost, Double maxVaccineCost) {
		// TODO Auto-generated method stub
		return vaccRepo.findByvaccineCostBetween(minVaccineCost,maxVaccineCost);
	}

	@Override
	public List<Vaccine> searchTop7ByOrderByVaccineCostDesc() {
		
		return vaccRepo.findTop7ByOrderByVaccineCostDesc();
	}

	@Override
	public List<Vaccine> searchByVaccineNameInAndCostBetween(Collection<String> names, Double minVaccineCost,
			Double maxVaccineCost) {
		
		return vaccRepo.findByVaccineNameInAndVaccineCostBetween(names, minVaccineCost, maxVaccineCost);
	}

		
}
