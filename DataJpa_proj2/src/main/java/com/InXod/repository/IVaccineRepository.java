package com.InXod.repository;

import org.springframework.data.repository.CrudRepository;

import com.InXod.model.Vaccine;

public interface IVaccineRepository extends CrudRepository<Vaccine, Integer> {

}
