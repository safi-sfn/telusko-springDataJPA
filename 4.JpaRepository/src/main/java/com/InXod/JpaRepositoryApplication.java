package com.InXod;



import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.InXod.model.Vaccine;
import com.InXod.service.VaccineServiceImpl;

@SpringBootApplication
public class JpaRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(JpaRepositoryApplication.class, args);

		VaccineServiceImpl vaccService = container.getBean(VaccineServiceImpl.class);
		
//		Vaccine vc =vaccService.fetchVaccineById(53);
//		System.out.println(vc);
		

//		vaccService.fetchByGivenVaccineInfo(new Vaccine("Rotavac","Bharat Biotech",2500.0))
//		.forEach(v->System.out.println(v));
		
		List<Integer> ids = new ArrayList<>();
		ids.add(104);
		ids.add(53);
		
		String status = vaccService.removeVaccineByGivenId(ids);
		System.out.println(status);
	}
}
