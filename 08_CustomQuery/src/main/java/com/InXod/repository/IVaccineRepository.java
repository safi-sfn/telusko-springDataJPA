package com.InXod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

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
	
	@Query("SELECT vaccineName FROM Vaccine WHERE vaccineCost BETWEEN :minCost AND :maxCost")
	public List<String> searchByVaccineCost(Double minCost, Double maxCost);
	
	
	// Non-Select query
	
	
	// when ever we use non select query in a custom query method then we MUST use @Transactional annotation
	@Transactional
	@Modifying 		 //there is some modification in backend
	@Query("UPDATE Vaccine SET vaccineCost=:newCost WHERE vaccineName=:vaccineName")
	public int updateCostByVaccineName(Double newCost, String vaccineName);
	
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Vaccine WHERE vaccineName = :vaccineName")
	public int deleteVaccineByVaccineName(@Param("vaccineName")String vaccName);
	
	
	// if we are going with native SQL then we have to go with Table and Column
	// are we going with Entity class? || are we going with tables or column?  
	
	@Transactional
	@Modifying
	@Query(value="INSERT INTO vaccine(`id`,`name`,`company`,`cost`) Values(?,?,?,?)",nativeQuery = true)
	public int insertVaccineInfo(Integer Id, String vaccineName, String vaccineCompany, Double vaccineCost);
	
}






