package com.InXod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.InXod.model.Vaccine;

public interface IVaccineRepository extends JpaRepository<Vaccine, Integer> {

	//SQL syntax (SELECT * FROM TableName WHERE Column_Name)
	//==SQL==// SELECT * FROM vaccine WHERE company=?
	//==SQL==// SELECT * FROM vaccine WHERE company IN(?,?)
	
	// HQL syntax (FROM className WHERE propertyName)
	//==HQL==// FROM Vaccine WHERE vaccineCompany=:comp1
	//==HQL==// FROM Vaccine WHERE vaccineCompany IN (:comp1, :comp2)
	
	// for specific column
	// SQL  -> SELECT name FROM vaccine WHERE company IN(?,?)
	// HQL  -> SELECT vaccineName FROM Vaccine WHERE vaccineCompany IN (:comp1, :comp2)
//============================================	
	
	
//	@Query("FROM Vaccine WHERE vaccineCompany = :company")
//	public List<Vaccine> searchByVaccineCompany(String company);  
	
//  when to use @Param() -> jab query ke propertyName ki value or Method ke Parameter ki Value same nahi hai tab. 
//						 or us @Param("") ki value or propertyName ki value same linkna hai. eg- @Param("propertyValue")
	@Query("FROM Vaccine WHERE vaccineCompany=:company")
	public List<Vaccine> searchByVaccineCompany(@Param("company") String c);
	
	@Query("FROM Vaccine WHERE vaccineCompany IN (:comp1, :comp2)")
	public List<Vaccine> searchByVaccineCompanies(String comp1, String comp2);
}
