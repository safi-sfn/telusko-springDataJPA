package com.InXod;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.InXod.service.VaccineServiceImpl;

@SpringBootApplication
public class DataJpaStaticProjection {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DataJpaStaticProjection.class, args);

		VaccineServiceImpl vaccService = container.getBean(VaccineServiceImpl.class);

	}
}
