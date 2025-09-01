package in.inxod.hospitalPatientRecords;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.inxod.hospitalPatientRecords.model.Patient;
import in.inxod.hospitalPatientRecords.service.PatientServiceImpl;

@SpringBootApplication
public class HospitalPatientRecordsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(HospitalPatientRecordsApplication.class, args);
		
		PatientServiceImpl service = container.getBean(PatientServiceImpl.class);

/*
		List<Patient> patients = List.of(
				 new Patient("Alok Sharma", 39, "Asthma", LocalDate.of(2017, 3, 15), "Dr. Mehta"),
				 new Patient("Bhavna Patel", 27, "Typhoid", LocalDate.of(2018, 7, 22), "Dr. Das"),
				 new Patient("Chetan Kumar", 46, "Heart Disease", LocalDate.of(2019, 11, 10), "Dr. Sharma"),
				 new Patient("Deepa Rani", 31, "Flu", LocalDate.of(2020, 1, 5), "Dr. Gupta"),
				 new Patient("Eshan Yadav", 24, "Covid-19", LocalDate.of(2021, 5, 9), "Dr. Mehta"),
				 new Patient("Farhan Khan", 52, "Diabetes", LocalDate.of(2018, 6, 28), "Dr. Sinha"),
				 new Patient("Geeta Joshi", 45, "Arthritis", LocalDate.of(2019, 9, 13), "Dr. Gupta")
				    
			);
		service.addMultiplePatient(patients);
*/	
	
	
	
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	}

}
