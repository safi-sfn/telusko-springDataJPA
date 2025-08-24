package com.InXod.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vaccine")
public class Vaccine {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer vaccineId;
	
	@Column(name="NAME")
	private String vaccineName;
	
	@Column(name="COMPANY")
	private String vaccineCompany;
	


	@Column(name="COST")
	private Double vaccineCost;

	public Vaccine() {
		
	}
	
	
	public Vaccine( String vaccineName, String vaccineCompany, Double vaccineCost) {
		super();
		this.vaccineName = vaccineName;
		this.vaccineCompany = vaccineCompany;
		this.vaccineCost = vaccineCost;
	}
	
	public Integer getVaccineId() {
		return vaccineId;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getVaccineCompany() {
		return vaccineCompany;
	}

	public void setVaccineCompany(String vaccineCompany) {
		this.vaccineCompany = vaccineCompany;
	}

	public Double getVaccineCost() {
		return vaccineCost;
	}

	public void setVaccineCost(Double vaccineCost) {
		this.vaccineCost = vaccineCost;
	}


	@Override
	public String toString() {
		return "Vaccine [vaccineId=" + vaccineId + ", "
				+ "vaccineName=" + vaccineName + ","
				+ " vaccineCompany=" + vaccineCompany
				+ ", vaccineCost=" + vaccineCost + "]";
	}
	
	
	
	
	
}
