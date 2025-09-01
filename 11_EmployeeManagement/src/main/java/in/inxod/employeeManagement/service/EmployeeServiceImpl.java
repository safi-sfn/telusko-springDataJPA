package in.inxod.employeeManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.inxod.employeeManagement.model.Employee;
import in.inxod.employeeManagement.repo.EmployeeRepo;

@Service

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepo repo;
	
	@Autowired
	public void setRepo(EmployeeRepo repo) {
		this.repo = repo;
	}


	@Override
	public Employee addEmployee(Employee employee) {
	 return repo.save(employee);
		
	}


	@Override
	public List<Employee> addMultipleEmployee(List<Employee> employee) {
		return (List<Employee>) repo.saveAll(employee);
	}


	@Override
	public List<Employee> getEmpByDepartment(String department) {
		return repo.findByDepartment(department);
		
	}


	@Override
	public String updateSalary(Integer id, Double newSalary){
		Optional<Employee> optional = repo.findById(id);
		if(optional.isPresent()) {
			Employee employee = optional.get();
			employee.setSalary(newSalary);
			repo.save(employee);
			return "Employee salary updated";
		}
		return "Employee Not found";
	}


	@Override
	public Iterable<Employee> getEmpBySalaryGreaterThan(Double salary) {
		return repo.findBySalaryGreaterThan(salary);

	}


	@Override
	public String deleteEmployee(Integer id) {
		Optional<Employee> optional = repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return "Employee deleted";
		}
		return "Employee not found";
	}

}















