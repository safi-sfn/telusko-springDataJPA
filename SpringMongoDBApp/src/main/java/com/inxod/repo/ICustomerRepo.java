package com.inxod.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.inxod.model.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, String> {

}
