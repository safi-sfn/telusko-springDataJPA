package com.inxod.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inxod.dto.CustomerDto;
import com.inxod.model.Customer;
import com.inxod.repo.ICustomerRepo;

@Service
public class CustomerServiceImpl implements ICustomerSrvice {

	@Autowired
	ICustomerRepo customerRepo;

	@Override
	public String registerCustomer(CustomerDto dto) {
		Customer cstmr = new Customer();
		 
		BeanUtils.copyProperties(dto, cstmr);
		Customer cstmrDoc = customerRepo.save(cstmr);
		return "Customer Data is stored in MongoDB with Object id : "+cstmrDoc.getCustomerId();
	}

	@Override
	public List<Customer> findAllCustomer() {
		
		return customerRepo.findAll();
	}
}
