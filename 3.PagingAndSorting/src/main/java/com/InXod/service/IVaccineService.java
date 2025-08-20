package com.InXod.service;

import com.InXod.model.Vaccine;

public interface IVaccineService {
	
	Iterable<Vaccine>  fetchVaccineInfoBySorting(boolean status, String... properties);
	Iterable<Vaccine>  fetchVaccineInfoByPagination(int pgNo, int pgSize, boolean status, String... properties);
    void fetchVaccineInfoByPagination(int pgSize);
}
