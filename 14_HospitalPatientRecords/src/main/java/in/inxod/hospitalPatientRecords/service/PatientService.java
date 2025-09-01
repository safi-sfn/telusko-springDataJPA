package in.inxod.hospitalPatientRecords.service;

import java.time.LocalDate;
import java.util.List;



import in.inxod.hospitalPatientRecords.model.Patient;

public interface PatientService {

	//Add patient
	List<Patient> addMultiplePatient(List<Patient> patients);
	
	//Get patient by disease
    List<Patient> getPatientByDisease(String disease);
    List<Patient> fetchPatientsByDoctor(String doctor);
    
    //Update doctor name
    int updateDoctorNameByPatientId(String newDoctor, Integer id);
    
    
    // Delete patient  
    int deletePatientsById(Integer id);
    
    // After
    List<Patient> getByAdmittedDateAfter(LocalDate date);
    
    //Before
    List<Patient> getByAdmittedDateBefore(LocalDate date);
    
    // between
    List<Patient> getByAdmittedDateBetween(LocalDate start, LocalDate end);
    
    
    
    
}









