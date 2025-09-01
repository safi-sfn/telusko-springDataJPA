package in.inxod.hospitalPatientRecords.model;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_record")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;

    private String name;
    private Integer age;
    private String disease;
    private LocalDate admittedDate;
    private String doctorName;
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public LocalDate getAdmittedDate() {
		return admittedDate;
	}
	public void setAdmittedDate(LocalDate admittedDate) {
		this.admittedDate = admittedDate;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Patient( String name, Integer age, String disease, LocalDate admittedDate,
			String doctorName) {
		super();
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.admittedDate = admittedDate;
		this.doctorName = doctorName;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	
    
    

}

