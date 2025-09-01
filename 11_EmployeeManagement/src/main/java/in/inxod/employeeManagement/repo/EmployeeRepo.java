package in.inxod.employeeManagement.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.inxod.employeeManagement.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

	//Custom finder method
	
	List<Employee> findByDepartment(String department);
	
	Iterable<Employee> findBySalaryGreaterThan(Double salary);
	
}
