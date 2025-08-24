package com.InXod;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.InXod.service.VaccineServiceImpl;

@SpringBootApplication
public class DataJpaCustomQuery {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DataJpaCustomQuery.class, args);

		VaccineServiceImpl vaccService = container.getBean(VaccineServiceImpl.class);
		
//		vaccService.fetchByVaccineCompany("Bharat Biotech").forEach(v->System.out.println(v));
//		
//		System.out.println("*******************************");
//		
//		vaccService.fetchByVaccineCompanies("AstraZenica", "Moderna").forEach(v->System.out.println(v));
		
//		vaccService.fetchByVaccineCost(2478.9, 2890.7).forEach(v->System.out.println(v));
		
//		int rowAffected = vaccService.updateVaccineCostByVaccineName(2245.6, "Moderna");
//		System.out.println(rowAffected);
		
//		int rowAffected = vaccService.deleteTheVaccineByVaccineName("Polio (IPV/OPV)");
//		System.out.println("Deleted success : "+rowAffected);
		
		int status = vaccService.insertVaccineDetails(5, "Ebula", "Crex", 2350.9);
		
		if(status==1) {
			System.out.println("Insertion Success!");
		}else {
			System.out.println("Insertion Failure!");
		}

	}
}
