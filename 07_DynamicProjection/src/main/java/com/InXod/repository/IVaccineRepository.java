package com.InXod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InXod.model.Vaccine;
import com.InXod.view.View;


public interface IVaccineRepository extends JpaRepository<Vaccine, Integer> {
	
	// Dynamic projection concept
	
	public <T extends View> List<T> findByVaccineCostLessThan(Double vaccCost, Class<T> clss);
}
