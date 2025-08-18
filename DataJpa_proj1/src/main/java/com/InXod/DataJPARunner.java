package com.InXod;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.InXod.model.Customer;
import com.InXod.repository.ICustomerRepository;


@Component
public class DataJPARunner implements CommandLineRunner {

	@Autowired
	ICustomerRepository customerRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Customer customer1 = new Customer();
		customer1.setCustomerId(101);
		customer1.setCustomerName("speed");
		customer1.setCustomerCity("Banglore");
		
		Customer customer2 = new Customer();
		customer2.setCustomerId(102);
		customer2.setCustomerName("Rafi");
		customer2.setCustomerCity("Indore");
		
		Customer customer3 = new Customer();
		customer3.setCustomerId(103);
		customer3.setCustomerName("Verma");
		customer3.setCustomerCity("Haryana");
		
		Customer customer4 = new Customer();
		customer4.setCustomerId(104);
		customer4.setCustomerName("Jubair");
		customer4.setCustomerCity("Ahmadabad");
		
		Customer customer5 = new Customer();
		customer5.setCustomerId(105);
		customer5.setCustomerName("Neha");
		customer5.setCustomerCity("Jharkhand");
		
		List<Customer> customerList = new ArrayList<>();
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		customerRepo.saveAll(customerList);

	}

}
