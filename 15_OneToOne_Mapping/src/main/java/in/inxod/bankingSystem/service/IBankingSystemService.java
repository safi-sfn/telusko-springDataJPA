package in.inxod.bankingSystem.service;

import java.util.List;

import in.inxod.bankingSystem.entity.Customer;

public interface IBankingSystemService {

	// Single Customer save
	public Customer saveCustomer(Customer customer);
	
	// Multiple Customers add
	public List<Customer> saveAllCustomer(List<Customer> customer);
	
	// Get All Customer
	public List<Customer> getAllCustomer();
	
	// Get By Id
	public Customer getCustomerById(Long id);
	
	// Delete Customer
	public void deleteCustomer(Long id);
	
	// Update Customer
	public Customer updateCustomer(Customer customer);
	
	// get Customer by AccountNumber
	public Customer getByAccNumber(String accountNumber);
	
}
