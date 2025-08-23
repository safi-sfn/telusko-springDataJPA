package com.InXod.service;

import java.util.List;

import com.InXod.view.View;

public interface IVaccineService {

	public <T extends View> List<T> searchByVaccineCostLessThan(Double vaccCost, Class<T> clss);
}
