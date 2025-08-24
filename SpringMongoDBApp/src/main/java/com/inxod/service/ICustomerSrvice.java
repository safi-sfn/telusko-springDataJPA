package com.inxod.service;

import java.util.List;

import com.inxod.dto.CustomerDto;
import com.inxod.model.Customer;

public interface ICustomerSrvice {

	String registerCustomer(CustomerDto dto);
	
	List<Customer> findAllCustomer();
}
