package com.InXod.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	public Iterable<Vaccine> fetchVaccineInfoBySorting(boolean status, String... properties) {
		
		// Create Sort object based on status and properties
	    // If status is true -> ASC (Ascending) order
	    // If status is false -> DESC (Descending) order
		// using ternary operator  / (condition ? valueIfTrue : valueIfFalse)
		Sort sort = Sort.by(status?Direction.ASC : Direction.DESC, properties);
		
		// Fetch all vaccine records from repository with the specified sorting
		return vaccRepo.findAll(sort);
	}

	@Override
	public Iterable<Vaccine> fetchVaccineInfoByPagination(int pgNo, int pgSize, boolean status, String... properties) {

/*
		// Pagination and sorting both | create sort object and use it in pageable
		Sort sort = Sort.by(status?Direction.ASC : Direction.DESC, properties);
		PageRequest pageable = PageRequest.of(pgNo, pgSize, sort);
*/		
		// pagination and use shorting technology
		PageRequest pageable =PageRequest.of(pgNo, pgSize, status?Direction.ASC : Direction.DESC, properties);
		Page<Vaccine> page = vaccRepo.findAll(pageable);
		
		return page.getContent();
	}

	@Override
	public void fetchVaccineInfoByPagination(int pgSize) {
		
		// Get total count of vaccine records in database
		long count = 16; // Hardcoded value
		
		
		// Calculate initial page count (total records / page size)
		long pageCount = count / pgSize; // Example: 16/4 = 4 pages

		// Example: 18 records with page size 4 -> 18/4 = 4.5 -> need 5 pages
		// Using ternary operator: if remainder is 0, keep pageCount, else increment by 1
		pageCount = count % pgSize == 0 ? pageCount : ++pageCount;

		// Loop through each page
		for (int i = 0; i < pageCount; i++) {
			 // Create PageRequest for current page
			 // i = page number (0-indexed), pgSize = number of records per page
			PageRequest pageable = PageRequest.of(i, pgSize);
			
			 // Fetch page data from repository
			Page<Vaccine> page = vaccRepo.findAll(pageable);
			System.out.println("=== Page " + (i + 1) + " of " + pageCount + " ===");
			page.getContent().forEach(v -> System.out.println(v));
			System.out.println("***************");
		}
		
	}


	
}
