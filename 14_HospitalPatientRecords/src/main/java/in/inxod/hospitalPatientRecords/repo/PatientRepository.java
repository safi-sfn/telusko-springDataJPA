package in.inxod.hospitalPatientRecords.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.inxod.hospitalPatientRecords.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	
	// custom finder method

	
	List<Patient> findByDisease(String disease);
	
    // Patients admitted after, before and between two dates 
    List<Patient> findByAdmittedDateAfter(LocalDate date);
    List<Patient> findByAdmittedDateBefore(LocalDate date);
    List<Patient> findByAdmittedDateBetween(LocalDate start, LocalDate end);

    
    // JPQL @Query

    // Specific doctor ke under admitted patients
    @Query("FROM Patient WHERE doctorName = :doctor")
    List<Patient> getPatientsByDoctorName(@Param("doctor") String doctor);


    //  Update doctor name for a patient
    @Transactional
    @Modifying
    @Query("UPDATE Patient SET doctorName = :newDoctor WHERE patientId = :id")
    int updateDoctorByPatientId(@Param("newDoctor") String newDoctor, @Param("id") Integer id);

    // Delete  patient by id
    @Transactional
    @Modifying
    @Query("DELETE FROM Patient WHERE patientId = :id")
    int deletePatientsByPatientId(@Param("id") Integer id);
    
    
}



















