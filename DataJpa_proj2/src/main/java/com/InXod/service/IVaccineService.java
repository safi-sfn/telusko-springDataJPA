package com.InXod.service;


import java.util.List;
import java.util.Optional;

import com.InXod.model.Vaccine;

public interface IVaccineService {
	
	public String registerVaccineDetails(Vaccine vaccine);
	
	Iterable<Vaccine> registerMultipleVaccine(Iterable<Vaccine> vaccine);
	
	public Long getCount();
	
	Boolean checkAvailibility(Integer id);
	
	Iterable<Vaccine> fetchAllVaccine();
	
	Iterable<Vaccine> fetchAllVaccineByIds(Iterable<Integer> ids);
	
	Optional<Vaccine> fetchVaccineById(Integer id);
	
	String removeVaccineById(Integer id);
	String removeVaccineByObj(Vaccine obj);
	String removeVaccineByIds(List<Integer> ids);

}
