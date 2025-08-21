package com.InXod.service;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.InXod.model.Vaccine;
import com.InXod.repository.IVaccineRepository;

@Service
public class VaccineServiceImpl implements IVaccineService {
	
	IVaccineRepository vaccRepo ;

	@Autowired
	public void setVaccRepo(IVaccineRepository vaccRepo) {
		this.vaccRepo = vaccRepo;
	}

	@Override
	public Vaccine fetchVaccineById(Integer id) {
		
		Vaccine vcc = vaccRepo.getReferenceById(id);
		return vcc;
	}

	@Override
	public List<Vaccine> fetchByGivenVaccineInfo(Vaccine vacc) {
		
		Example<Vaccine> example = Example.of(vacc);
		return vaccRepo.findAll(example);
		
	}

	@Override
	public String removeVaccineByGivenId(Iterable<Integer> id) {
		List<Vaccine> vaccines = vaccRepo.findAllById(id);
		if(vaccines.size() != 0) {	
			vaccRepo.deleteAllByIdInBatch(id);
			return "Vaccine record is deleted for given ids";
		}
		return "unable to delete record";
	}

		
}
