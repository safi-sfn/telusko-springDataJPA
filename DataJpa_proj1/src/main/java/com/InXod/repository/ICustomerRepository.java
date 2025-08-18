package com.InXod.repository;

import org.springframework.data.repository.CrudRepository;

import com.InXod.model.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Integer> {

}
