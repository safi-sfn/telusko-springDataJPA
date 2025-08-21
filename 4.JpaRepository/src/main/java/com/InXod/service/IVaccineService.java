package com.InXod.service;

import java.util.List;

import com.InXod.model.Vaccine;

public interface IVaccineService {
	
	Vaccine fetchVaccineById(Integer id);
	
	List<Vaccine> fetchByGivenVaccineInfo(Vaccine vacc);
	
	String removeVaccineByGivenId(Iterable<Integer> id);
}
