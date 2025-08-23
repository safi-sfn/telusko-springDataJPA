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
		
		vaccService.fetchByVaccineCompany("Bharat Biotech").forEach(v->System.out.println(v));
		
		System.out.println("*******************************");
		
		vaccService.fetchByVaccineCompanies("AstraZenica", "Moderna").forEach(v->System.out.println(v));

	}
}
