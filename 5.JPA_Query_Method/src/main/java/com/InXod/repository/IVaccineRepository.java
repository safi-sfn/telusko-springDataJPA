package com.InXod.repository;


import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.InXod.model.Vaccine;

public interface IVaccineRepository extends JpaRepository<Vaccine, Integer> {

	public List<Vaccine> findByvaccineCost(Double vaccineCost);

	public List<Vaccine> findByvaccineCostIs(Double vaccineCost);

	public List<Vaccine> findByvaccineCostEquals(Double vaccineCost);
	
	public List<Vaccine> findByvaccineCostLessThanEqual(Double vaccineCost);
	
	public List<Vaccine> findByvaccineCostBetween(Double minVaccineCost, Double maxVaccineCost);
	
	  List<Vaccine> findByVaccineNameInAndVaccineCostBetween(Collection<String> names ,Double minVaccineCost, Double maxVaccineCost);
	
	
	  
	// syntax -> findBy-PropertyName-Keyword   eg-> findByVaccineNameEquals
	
	   // =========================
    // 🔹 Queries on vaccineName
    // =========================
    List<Vaccine> findByVaccineName(String name);
    List<Vaccine> findByVaccineNameIs(String name);
    List<Vaccine> findByVaccineNameEquals(String name);
    List<Vaccine> findByVaccineNameNot(String name);
    List<Vaccine> findByVaccineNameIsNull();
    List<Vaccine> findByVaccineNameIsNotNull();
    List<Vaccine> findByVaccineNameLike(String pattern);
    List<Vaccine> findByVaccineNameNotLike(String pattern);
    List<Vaccine> findByVaccineNameStartingWith(String prefix);
    List<Vaccine> findByVaccineNameEndingWith(String suffix);
    List<Vaccine> findByVaccineNameContaining(String infix);
    List<Vaccine> findByVaccineNameNotContaining(String infix);
    List<Vaccine> findByVaccineNameIn(Collection<String> names);
    List<Vaccine> findByVaccineNameNotIn(Collection<String> names);

    // ============================
    // 🔹 Queries on vaccineCompany
    // ============================
    List<Vaccine> findByVaccineCompany(String company);
    List<Vaccine> findByVaccineCompanyIs(String company);
    List<Vaccine> findByVaccineCompanyEquals(String company);
    List<Vaccine> findByVaccineCompanyNot(String company);
    List<Vaccine> findByVaccineCompanyIsNull();
    List<Vaccine> findByVaccineCompanyIsNotNull();
    List<Vaccine> findByVaccineCompanyLike(String pattern);
    List<Vaccine> findByVaccineCompanyNotLike(String pattern);
    List<Vaccine> findByVaccineCompanyStartingWith(String prefix);
    List<Vaccine> findByVaccineCompanyEndingWith(String suffix);
    List<Vaccine> findByVaccineCompanyContaining(String infix);
    List<Vaccine> findByVaccineCompanyNotContaining(String infix);
    List<Vaccine> findByVaccineCompanyIn(Collection<String> companies);
    List<Vaccine> findByVaccineCompanyNotIn(Collection<String> companies);

    // =========================
    // 🔹 Queries on vaccineCost
    // =========================
    List<Vaccine> findByVaccineCost(Double cost);
    List<Vaccine> findByVaccineCostIs(Double cost);
    List<Vaccine> findByVaccineCostEquals(Double cost);
    List<Vaccine> findByVaccineCostNot(Double cost);
    List<Vaccine> findByVaccineCostLessThan(Double cost);
    List<Vaccine> findByVaccineCostLessThanEqual(Double cost);
    List<Vaccine> findByVaccineCostGreaterThan(Double cost);
    List<Vaccine> findByVaccineCostGreaterThanEqual(Double cost);
    List<Vaccine> findByVaccineCostBetween(Double min, Double max);
    List<Vaccine> findByVaccineCostIn(Collection<Double> costs);
    List<Vaccine> findByVaccineCostNotIn(Collection<Double> costs);

    // =========================
    // 🔹 Logical Combinations
    // =========================
    List<Vaccine> findByVaccineNameAndVaccineCompany(String name, String company);
    List<Vaccine> findByVaccineNameOrVaccineCompany(String name, String company);
    List<Vaccine> findByVaccineCompanyAndVaccineCostLessThan(String company, Double cost);
    List<Vaccine> findByVaccineNameOrVaccineCostGreaterThan(String name, Double cost);

    // =========================
    // 🔹 Sorting & Limiting
    // =========================
    List<Vaccine> findTop7ByOrderByVaccineCostDesc();
    List<Vaccine> findFirst5ByVaccineCompanyOrderByVaccineNameAsc(String company);
	
	
}
