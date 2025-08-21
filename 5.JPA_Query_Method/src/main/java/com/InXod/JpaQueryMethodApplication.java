package com.InXod;


import java.util.Collection;
import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.InXod.service.VaccineServiceImpl;

@SpringBootApplication
public class JpaQueryMethodApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(JpaQueryMethodApplication.class, args);

		VaccineServiceImpl vaccService = container.getBean(VaccineServiceImpl.class);
		
//		vaccService.searchByvaccineCost(2500.0).forEach(v->System.out.println(v));
//		vaccService.searchByvaccineCostIs(2689.5).forEach(v->System.out.println(v));
//		vaccService.searchByvaccineCostEquals(3599.0).forEach(v->System.out.println(v));
		
//		vaccService.searchByvaccineCostLessThanEqual(2500.0).forEach(v->System.out.println(v));
//		vaccService.searchByvaccineCostBetween(2670.0,3600.0).forEach(v->System.out.println(v));
		
//		vaccService.searchTop7ByOrderByVaccineCostDesc().forEach(v->System.out.println(v));
		
		Collection<String> names = new HashSet<>();
		names.add("Polio (IPV/OPV)");
//		names.add("Moderna");
		names.add("Co-vaccine");
		vaccService.searchByVaccineNameInAndCostBetween(names, 2400.0, 2700.0).forEach(v->System.out.println(v));
	}
}
