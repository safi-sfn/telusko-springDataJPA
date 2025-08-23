package com.InXod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InXod.model.Vaccine;
import com.InXod.view.ResultView;
import com.InXod.view.ResultView2;

public interface IVaccineRepository extends JpaRepository<Vaccine, Integer> {

	List<ResultView> findByVaccineCostLessThan(Double vaccineCost);
	
	List<ResultView2> findFirst5ByVaccineCompanyOrderByVaccineNameAsc(String company);
}
