package com.InXod.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.InXod.model.Vaccine;

public interface IVaccineRepository extends PagingAndSortingRepository<Vaccine, Integer> {

}
