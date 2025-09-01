package in.inxod.employeeManagement.service;

import java.util.List;

import in.inxod.employeeManagement.model.Employee;

public interface EmployeeService {
	
	
	Employee addEmployee(Employee employee);
	List<Employee> addMultipleEmployee(List<Employee> employee);
	
	List<Employee> getEmpByDepartment(String department);
	
	String updateSalary(Integer id, Double salary);
	
	Iterable<Employee> getEmpBySalaryGreaterThan(Double salary);
	
	String deleteEmployee(Integer id);

}
