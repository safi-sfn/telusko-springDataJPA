package com.InXod;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.InXod.model.Vaccine;
import com.InXod.service.VaccineServiceImpl;

@SpringBootApplication
public class DataJpaProj1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DataJpaProj1Application.class, args);
		
		VaccineServiceImpl vaccService = container.getBean(VaccineServiceImpl.class);
		
		Vaccine vaccine = new Vaccine();
		vaccine.setVaccineName("Covishield");
		vaccine.setVaccineCompany("AstraZeneca");
		vaccine.setVaccineCost(1250.9);
		
		Vaccine vaccine2 = new Vaccine();
		vaccine.setVaccineName("ZyCoV-D	");
		vaccine.setVaccineCompany("Zydus Cadila");
		vaccine.setVaccineCost(3400.8);
		
		
		
		String status = vaccService.registerVaccineDetails(vaccine);
		String status2 = vaccService.registerVaccineDetails(vaccine2);
		System.out.println(status + " , " +status2);
	}

}
