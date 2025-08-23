package com.InXod.service;

import java.util.List;


import com.InXod.view.ResultView;
import com.InXod.view.ResultView2;

public interface IVaccineService {

	public List<ResultView> searchByVaccineCostLessThan(Double vaccineCost);
	
	List<ResultView2> searchFirst5ByVaccineCompanyOrderByVaccineNameAsc(String company);
}
