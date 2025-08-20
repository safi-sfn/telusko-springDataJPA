package com.InXod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

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

		
/*		
		// Register a single vaccine

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
		System.out.println(status + " , " + status2);
*/
		
		
/*		
		// Register multiple vaccines in bulk

		List<Vaccine> vaccine = new ArrayList<>();

		vaccine.add(new Vaccine("Moderna", "Moderna", 2500.0));
		vaccine.add(new Vaccine("Rotavac", "Bharat Biotech", 2500.0));
		vaccine.add(new Vaccine("Polio (IPV/OPV)", "Sanofi, SII", 2500.0));

		Iterable<Vaccine> vac = vaccService.registerMultipleVaccine(vaccine);
		for (Vaccine v : vac) {
			System.out.println(v);
		}
*/
		
		
/*		
		// Get the total count of vaccines in the database

		Long count = vaccService.getCount();
		System.out.println("Number of vaccine : " + count);

		// Check if a vaccine with a specific ID exists
		int id = 7;
		Boolean status = vaccService.checkAvailibility(id);
		if (status) {
			System.out.println("Vaccine is Available");
		} else {
			System.out.println("Vaccine is not Available");
		}
*/
		
		
/*		
		// Fetch all vaccines and print them using a lambda expression
//		vaccService.fetchAllVaccine().forEach(v -> System.out.println(v));
		Iterable<Vaccine> vacc = vaccService.fetchAllVaccine();
		Iterator itr = vacc.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
*/
		
		
/*		
		// Fetch vaccines by a list of specific IDs
		List<Integer> ids = new ArrayList<>();
		ids.add(2);
		ids.add(52);
		ids.add(54);
		vaccService.fetchAllVaccineByIds(ids).forEach(v -> System.out.println(v));
*/
		
		
/*		
		// Fetch a vaccine by its ID and handle the Optional result
		int id = 2;
		Optional<Vaccine> optional = vaccService.fetchVaccineById(id);

		if (optional.isPresent()) {
			System.out.println(optional.get());
		} else {
			System.out.println("No vaccine with ID : " + id);
		}
*/
		
		
/*		
		// Delete a vaccine by its ID
		int id = 4;
		String status = vaccService.removeVaccineById(id);
		System.out.println(status);
*/
		
		
		
		// Delete multiple vaccines by a list of IDs
		List<Integer> ids = new ArrayList<>();
		ids.add(2);
		ids.add(52);
		ids.add(54);
		String status = vaccService.removeVaccineByIds(ids);
		System.out.println(status);

	}
}
