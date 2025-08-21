package com.InXod.service;

import java.util.Collection;
import java.util.List;

import com.InXod.model.Vaccine;

public interface IVaccineService {

	public List<Vaccine> searchByvaccineCost(Double vaccineCost);

	public List<Vaccine> searchByvaccineCostIs(Double vaccineCost);

	public List<Vaccine> searchByvaccineCostEquals(Double vaccineCost);
	
    public List<Vaccine> searchByvaccineCostLessThanEqual(Double vaccineCost);
	
	public List<Vaccine> searchByvaccineCostBetween(Double minVaccineCost, Double maxVaccineCost);
	
	public List<Vaccine> searchTop7ByOrderByVaccineCostDesc();
	
	  List<Vaccine> searchByVaccineNameInAndCostBetween(Collection<String> names ,Double minVaccineCost, Double maxVaccineCost);
}
