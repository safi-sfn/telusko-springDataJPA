package in.inxod.hospitalPatientRecords.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.inxod.hospitalPatientRecords.model.Patient;
import in.inxod.hospitalPatientRecords.repo.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository repo;
	
	// ============Create Patients==========
	@Override
	public List<Patient> addMultiplePatient(List<Patient> patients) {
		
		List<Patient> allPatient = repo.saveAll(patients);
		allPatient.forEach(p->
				System.out.println(p.getName()+" | "+p.getDisease()+" | "+p.getAge())
			);
		
		return allPatient;
	}
	
	
	// ============Retrieve Patients==========
	@Override
	public List<Patient> getPatientByDisease(String disease) {
		// TODO Auto-generated method stub
		List<Patient> patient = repo.findByDisease(disease);
		patient.forEach(p->
					System.out.println(p.getName()+" | "+p.getDoctorName()+" | "+p.getAdmittedDate())
				);
		return patient;
	}

	
	// ============Update Patients==========
	@Override
	public int updateDoctorNameByPatientId(String newDoctor, Integer id) {
		
		return repo.updateDoctorByPatientId(newDoctor, id);
	}

	
	// ============Delete Patients==========
	@Override
	public int deletePatientsById(Integer id) {
		int rowAffected = repo.deletePatientsByPatientId(id);
		if(rowAffected == 1) {
			System.out.println("Patient deleted");
		}else {
			System.out.println("patient Not Found");
		}
		return rowAffected;
	}

	// ============Retrieve Patients==========
	@Override
	public List<Patient> fetchPatientsByDoctor(String doctor) {
		List<Patient> patient = repo.getPatientsByDoctorName(doctor);
		patient.forEach(p->
					System.out.println(p.getName()+" | "+p.getDisease())
				);
		
		return patient;
	}

	// ============Retrieve Patients==========
	@Override
	public List<Patient> getByAdmittedDateAfter(LocalDate date) {
			
		List<Patient> patient = repo.findByAdmittedDateAfter(date);
		patient.forEach(p->
		System.out.println(p.getName()+" | "+p.getDisease()+" | "+p.getDoctorName())
	);
		return patient;
	}

	// ============Retrieve Patients==========
	@Override
	public List<Patient> getByAdmittedDateBefore(LocalDate date) {
		
		List<Patient> patient = repo.findByAdmittedDateBefore(date);
		patient.forEach(p->
		System.out.println(p.getName()+" | "+p.getDisease()+" | "+p.getDoctorName())
	);
		return patient;
	}

	// ============Retrieve Patients==========
	@Override
	public List<Patient> getByAdmittedDateBetween(LocalDate start, LocalDate end) {
		
		List<Patient> patient = repo.findByAdmittedDateBetween(start, end);
		patient.forEach(p->
		System.out.println(p.getName()+" | "+p.getDisease()+" | "+p.getDoctorName())
	);
		return patient;
	}

}
