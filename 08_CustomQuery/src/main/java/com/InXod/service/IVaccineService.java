package com.InXod.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.InXod.model.Vaccine;



public interface IVaccineService {

	public List<Vaccine> fetchByVaccineCompany(@Param("company") String c);
	
	public List<Vaccine> fetchByVaccineCompanies(String comp1, String comp2);
	
	public List<String> fetchByVaccineCost(Double minCost, Double maxCost);
	
	public int updateVaccineCostByVaccineName(Double newCost, String vaccineName);
	
	public int deleteTheVaccineByVaccineName(String vaccName);
	
	public int insertVaccineDetails(Integer Id, String vaccineName, String vaccineCompany, Double vaccineCost);
	
}
