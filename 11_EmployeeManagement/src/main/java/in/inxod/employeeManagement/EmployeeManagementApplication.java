package in.inxod.employeeManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.inxod.employeeManagement.model.Employee;
import in.inxod.employeeManagement.service.EmployeeServiceImpl;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
	   ConfigurableApplicationContext container = SpringApplication.run(EmployeeManagementApplication.class, args);
	   
	   EmployeeServiceImpl service = container.getBean(EmployeeServiceImpl.class);

/*
	   // Add Single Employee
	   Employee emp = new Employee();
	   emp.setName("Amit Sharma");
	   emp.setDepartment("IT");
	   emp.setSalary(45000.0);
	   emp.setJoiningDate(LocalDate.of(2021, 5, 10));
	   
	   // LocalDate.now() -> for present date
	   Employee emp2 = new Employee("Safiruddin", 35000.0, "IT", LocalDate.now());
	   String st = service.addEmployee(emp2).toString();
	   System.out.println("Employee Added"+st);
*/	   
	
/*	   
	   List<Employee> employees = List.of(			   
			    new Employee("Vikram Chauhan", 58000.0, "Sales", LocalDate.now()),
			    new Employee("Tanvi Deshmukh", 47000.0, "HR", LocalDate.of(2022, 4, 18)),
			    new Employee("Suresh Reddy", 65000.0, "Finance", LocalDate.of(2019, 2, 10)),
			    new Employee("Ananya Kapoor", 72000.0, "Operations", LocalDate.of(2018, 7, 23)),
			    new Employee("Manoj Kumar", 39000.0, "Support", LocalDate.of(2021, 9, 30)),
			    new Employee("Ritika Malhotra", 80000.0, "IT", LocalDate.of(2016, 11, 11)),
			    new Employee("Farhan Ali", 56000.0, "Sales", LocalDate.of(2020, 5, 7)),
			    new Employee("Divya Patel", 43000.0, "HR", LocalDate.of(2022, 2, 16)),
			    new Employee("Rajeev Pillai", 83000.0, "Finance", LocalDate.of(2016, 12, 19)),
			    new Employee("Ayesha Sheikh", 60000.0, "Operations", LocalDate.of(2019, 9, 28)),
			    new Employee("Deepak Choudhary", 42000.0, "Support", LocalDate.of(2022, 8, 3))
			);
	   
	   service.addMultipleEmployee(employees);
*/
	   
	   // Get Employee By Department
/*
	   String department = "HR";
	   List<Employee> emp = service.getEmpByDepartment(department);
	   emp.forEach(e->System.out.println(e.getName()+" | "+e.getSalary()));
	   
*/	   
	   
	   // Employee salary update
/*	   
	   int id = 2;
	   double newSal = 40000.0;
	   String status = service.updateSalary(id, newSal);
	   System.out.println(status);
 */   
	   
	   // Find Employee Whose salary grater than given value
/*	   
	   Double sal = 50000.0;
	   Iterable<Employee> emp = service.getEmpBySalaryGreaterThan(sal);
	   emp.forEach(e->System.out.println(e.getName()+" | "+e.getSalary()+" | "+e.getDepartment()));
*/   
	   
	   // Delete Employee
	  String st =  service.deleteEmployee(2);
	  System.out.println(st);
	   
	   
	   
	   
	   
	   
	}

}

















