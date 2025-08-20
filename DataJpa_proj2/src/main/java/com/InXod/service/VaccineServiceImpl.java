package com.InXod.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InXod.model.Vaccine;
import com.InXod.repository.IVaccineRepository;

@Service
public class VaccineServiceImpl implements IVaccineService {

	@Autowired
	IVaccineRepository vaccRepo;
	
	@Override
	public String registerVaccineDetails(Vaccine vaccine) {
		
		Vaccine vacc = vaccRepo.save(vaccine);
		
		return "Vaccine Info is Stored with Id :"+vacc.getVaccineId();
	}

	@Override
	public Iterable<Vaccine> registerMultipleVaccine(Iterable<Vaccine> vaccine) {
		
		return vaccRepo.saveAll(vaccine);
	}

	@Override
	public Long getCount() {
	
		return vaccRepo.count();
	}

	@Override
	public Boolean checkAvailibility(Integer id) {

		return vaccRepo.existsById(id);
	}

	@Override
	public Iterable<Vaccine> fetchAllVaccine() {
		
		return vaccRepo.findAll();
	}

	@Override
	public Iterable<Vaccine> fetchAllVaccineByIds(Iterable<Integer> ids) {
		
		return vaccRepo.findAllById(ids);
	}

	@Override
	public Optional<Vaccine> fetchVaccineById(Integer id) {
		
		return vaccRepo.findById(id);
	}

	@Override
	public String removeVaccineById(Integer id) {
		
		Optional<Vaccine> optional = vaccRepo.findById(id);
		if(optional.isPresent()) {
			vaccRepo.deleteById(id);
			return "Vaccine record with id "+id+" is deleted";
		}
		return "There is no Vaccine with id "+id+" to delete";
	}

	@Override
	public String removeVaccineByObj(Vaccine obj) {
		Integer id = obj.getVaccineId();
		Optional<Vaccine> optional = vaccRepo.findById(id);
		if(optional.isPresent()) {
			vaccRepo.deleteById(id);
			return "Vaccine record with id "+id+" is deleted";
		}
		return "There is no Vaccine with id "+id+" to delete";
	}

	@Override
	public String removeVaccineByIds(List<Integer> ids) {
		
		List<Vaccine> vaccine = (List<Vaccine>)vaccRepo.findAllById(ids);
		int count1 = ids.size();
		int count2 = vaccine.size();
		
//		if(count1 == count2) {
//			vaccRepo.deleteAllById(ids);
//			return "Vaccine are deleted from records";
//		}
		
		if(count2>0) {
			vaccRepo.deleteAllById(ids);
			return "Vaccine are deleted from records";
		}
		
		return "Failed to delete vaccine info";
	}

	
}
