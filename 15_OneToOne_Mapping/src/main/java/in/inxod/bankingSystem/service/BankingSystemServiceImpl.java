package in.inxod.bankingSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.inxod.bankingSystem.entity.Customer;
import in.inxod.bankingSystem.repository.IAccountDetailRepository;
import in.inxod.bankingSystem.repository.ICustomerRepository;

@Service
public class BankingSystemServiceImpl implements IBankingSystemService {

	@Autowired
	ICustomerRepository cxRepo;
	
	@Autowired
	IAccountDetailRepository accRepo;
	
	
	@Override
	public Customer saveCustomer(Customer customer) {
		
		return cxRepo.save(customer);
	}


	@Override
	public List<Customer> saveAllCustomer(List<Customer> customer) {
		
		return cxRepo.saveAll(customer);
	}


	@Override
	public List<Customer> getAllCustomer() {
		
		return cxRepo.findAll();
	}


	@Override
	public void deleteCustomer(Long id) {
		
		 cxRepo.deleteById(id);;
	}


	@Override
	public Customer getCustomerById(Long id) {
		Optional<Customer> optional = cxRepo.findById(id);
			Customer customer = optional.get();
			return customer;
	}


	@Override
	public Customer updateCustomer(Customer customer) {
		Optional<Customer> optional = cxRepo.findById(customer.getCustomerId());
		Customer existedCustomer = optional.get();
		existedCustomer.setName(customer.getName());
		cxRepo.save(existedCustomer);
		return existedCustomer;
	}


	@Override
	public Customer getByAccNumber(String accountNumber) {
		
		return accRepo.findByAccountNumber(accountNumber);
	}
}
