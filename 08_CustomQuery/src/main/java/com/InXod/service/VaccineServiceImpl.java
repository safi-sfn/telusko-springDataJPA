package com.InXod.service;


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
	public List<Vaccine> fetchByVaccineCompany(String c) {
		
		return vaccRepo.searchByVaccineCompany(c);
	}

	@Override
	public List<Vaccine> fetchByVaccineCompanies(String comp1, String comp2) {
		
		return vaccRepo.searchByVaccineCompanies(comp1, comp2);
	}

	@Override
	public List<String> fetchByVaccineCost(Double minCost, Double maxCost) {
		
		return vaccRepo.searchByVaccineCost(minCost, maxCost);
	}

	@Override
	public int updateVaccineCostByVaccineName(Double newCost, String vaccineName) {
		
		return vaccRepo.updateCostByVaccineName(newCost, vaccineName);
	}

	@Override
	public int deleteTheVaccineByVaccineName(String vaccName) {
		
		return vaccRepo.deleteVaccineByVaccineName(vaccName);
	}

	@Override
	public int insertVaccineDetails(Integer Id, String vaccineName, String vaccineCompany, Double vaccineCost) {
		
		return vaccRepo.insertVaccineInfo(Id, vaccineName, vaccineCompany, vaccineCost);
	}

		
}
