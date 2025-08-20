package com.InXod;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.InXod.service.VaccineServiceImpl;

@SpringBootApplication
public class DataJpaProj2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DataJpaProj2Application.class, args);

		VaccineServiceImpl vaccService = container.getBean(VaccineServiceImpl.class);

		// Sort by price in ascending order
		vaccService.fetchVaccineInfoBySorting(true, "vaccineCost").forEach(v->System.out.println(v));

	}
}
