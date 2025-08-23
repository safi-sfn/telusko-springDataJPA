package com.InXod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.InXod.service.VaccineServiceImpl;
import com.InXod.view.ResultView1;
import com.InXod.view.ResultView2;
import com.InXod.view.ResultView3;

@SpringBootApplication
public class DataJpaDynamicProjection {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DataJpaDynamicProjection.class, args);

		VaccineServiceImpl vaccService = container.getBean(VaccineServiceImpl.class);

		vaccService.searchByVaccineCostLessThan(2600.0, ResultView1.class)
		.forEach(v->System.out.println("Vaccine Name : "+v.getVaccineName()));
		
		vaccService.searchByVaccineCostLessThan(2600.0, ResultView2.class)
		.forEach( v -> {
			System.out.println("Vaccine Company : "+v.getVaccineCompany());
			System.out.println("Vaccine Cost    : "+v.getVaccineCost());
		});
		vaccService.searchByVaccineCostLessThan(2400.0, ResultView3.class)
		.forEach(v->System.out.println(v));

	}
}
