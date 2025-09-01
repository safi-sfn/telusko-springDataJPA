package in.inxod.hospitalPatientRecords.service;

import java.util.List;

import in.inxod.hospitalPatientRecords.model.Patient;

public interface PatientService {

	
	List<Patient> addMultiplePatient(List<Patient> patients);
	
    List<Patient> findByDisease(String disease);
}
