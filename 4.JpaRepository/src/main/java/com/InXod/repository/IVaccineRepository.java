package com.InXod.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.InXod.model.Vaccine;

public interface IVaccineRepository extends JpaRepository<Vaccine, Integer> {

}
