package com.pack.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pack.models.Formation;
import com.pack.repository.FormationRepository;



@Component
public class FormationService {

	@Autowired
	private FormationRepository formationRepo;
	
	
	public List<Formation> getAllFormation() {
		return formationRepo.findAll();
	}
	
	public void addFormation(Formation formation) {
		formationRepo.save(formation);
	}
	
	public Optional<Formation> getSingleFormation(Long id) {
		return formationRepo.findById(id);
	}
	
	public void updateFormation(Long id, Formation formation) {
		formationRepo.save(formation);
	}
	
	public void deleteFormation(Long id) {
		formationRepo.deleteById(id);
	}
	
	
}
