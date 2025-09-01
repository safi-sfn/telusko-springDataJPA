package in.inxod.hospitalPatientRecords.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.inxod.hospitalPatientRecords.model.Patient;
import in.inxod.hospitalPatientRecords.repo.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository repo;
	
	
	@Override
	public List<Patient> addMultiplePatient(List<Patient> patients) {
		
		List<Patient> allPatient = repo.saveAll(patients);
		allPatient.forEach(p->
				System.out.println(p.getName()+" | "+p.getDisease()+" | "+p.getAge())
			);
		
		return allPatient;
	}

	@Override
	public List<Patient> findByDisease(String disease) {
		// TODO Auto-generated method stub
		return null;
	}

}
