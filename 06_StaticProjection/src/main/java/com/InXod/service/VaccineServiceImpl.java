package com.InXod.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.InXod.repository.IVaccineRepository;
import com.InXod.view.ResultView;
import com.InXod.view.ResultView2;

@Service
public class VaccineServiceImpl implements IVaccineService {
	
	IVaccineRepository vaccRepo ;

	@Autowired
	public void setVaccRepo(IVaccineRepository vaccRepo) {
		this.vaccRepo = vaccRepo;
	}

	@Override
	public List<ResultView> searchByVaccineCostLessThan(Double vaccineCost) {
		  return vaccRepo.findByVaccineCostLessThan(vaccineCost);
		
	}

	@Override
	public List<ResultView2> searchFirst5ByVaccineCompanyOrderByVaccineNameAsc(String company) {
		
		return vaccRepo.findFirst5ByVaccineCompanyOrderByVaccineNameAsc(company);
	}

	


		
}
