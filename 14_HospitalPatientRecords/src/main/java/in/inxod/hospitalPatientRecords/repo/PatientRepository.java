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

    // Patients admitted after, before and between two dates 
	//  after specific date
    List<Patient> findByAdmittedDateAfter(LocalDate date);
    //  before specific date
    List<Patient> findByAdmittedDateBefore(LocalDate date);
    //  between two dates
    List<Patient> findByAdmittedDateBetween(LocalDate start, LocalDate end);

    
    // JPQL @Query

    // 2. Specific doctor ke under admitted patients
    @Query("FROM Patient WHERE doctorName = :doctor")
    List<Patient> getPatientsByDoctor(@Param("doctor") String doctor);


    // 4. Update doctor name for a patient
    @Transactional
    @Modifying
    @Query("UPDATE Patient SET doctorName = :newDoctor WHERE patientId = :id")
    int updateDoctorByPatientId(@Param("newDoctor") String newDoctor, @Param("id") Integer id);

    // 5. Delete all patients by disease
    @Transactional
    @Modifying
    @Query("DELETE FROM Patient WHERE disease = :disease")
    int deletePatientsByDisease(@Param("disease") String disease);
    
    
}



















