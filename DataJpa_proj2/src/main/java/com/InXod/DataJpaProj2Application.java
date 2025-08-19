package com.InXod;



import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.InXod.model.Vaccine;
import com.InXod.service.VaccineServiceImpl;

@SpringBootApplication
public class DataJpaProj2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DataJpaProj2Application.class, args);
		
		VaccineServiceImpl vaccService = container.getBean(VaccineServiceImpl.class);
//		
//		Vaccine vaccine = new Vaccine();
//		vaccine.setVaccineName("Covishield");
//		vaccine.setVaccineCompany("AstraZeneca");
//		vaccine.setVaccineCost(1250.9);
//		
//		Vaccine vaccine2 = new Vaccine();
//		vaccine.setVaccineName("ZyCoV-D	");
//		vaccine.setVaccineCompany("Zydus Cadila");
//		vaccine.setVaccineCost(3400.8);
//		
//		
//		
//		String status = vaccService.registerVaccineDetails(vaccine);
//		String status2 = vaccService.registerVaccineDetails(vaccine2);
//		System.out.println(status + " , " +status2);
		
		List<Vaccine> vaccine = new ArrayList<>();
		
		vaccine.add(new Vaccine("Moderna","Moderna",2500.0));
		vaccine.add(new Vaccine("Rotavac","Bharat Biotech",2500.0));
		vaccine.add(new Vaccine("Polio (IPV/OPV)","Sanofi, SII",2500.0));
		
		Iterable<Vaccine> vac =vaccService.registerMultipleVaccine(vaccine);
		for(Vaccine v:vac) {
			System.out.println(v);
		}
	}

}
