package in.inxod.bankingSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.inxod.bankingSystem.entity.Customer;
import in.inxod.bankingSystem.service.BankingSystemServiceImpl;

@RestController
@RequestMapping("/customers/api")
public class BankingSystemController {
	
	@Autowired
	BankingSystemServiceImpl service;
	
	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
	
	@PostMapping("/saveAll")
	public List<Customer> saveCustomer(@RequestBody List<Customer> customer) {
		return service.saveAllCustomer(customer);
	}
	
	@GetMapping
	public List<Customer> getAllCustomers(){
		return service.getAllCustomer();
	}
	
	@GetMapping("/by-id")	
	public Customer getCustomersById(@RequestParam("customer_id")Long id){
		return service.getCustomerById(id);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		service.deleteCustomer(id);
		return "Customer deleted with ID " + id;
	}
	
	@PutMapping("/update")
	public String updateCustomer(@RequestBody Customer customer) {
		service.updateCustomer(customer);
		return "updated successfully!";
	}
	
	@GetMapping("/by-accNum")
	public Customer getByAccountNumber(@RequestParam("accNum")String accountNumber) {
		return service.getByAccNumber(accountNumber);
	}
	
	
}
