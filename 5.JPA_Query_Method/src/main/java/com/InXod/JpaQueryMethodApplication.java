package com.InXod;



import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.InXod.model.Vaccine;
import com.InXod.service.VaccineServiceImpl;

@SpringBootApplication
public class JpaQueryMethodApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(JpaQueryMethodApplication.class, args);

		VaccineServiceImpl vaccService = container.getBean(VaccineServiceImpl.class);

	}
}
