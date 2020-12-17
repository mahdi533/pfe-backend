package com.pack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pack.models.Evaluation;
import com.pack.repository.EvaluationRepository;


@Component
public class EvaluationService {

	@Autowired
	private EvaluationRepository formateurRepo;
	
	
	public List<Evaluation> getAllEvaluation() {
		return formateurRepo.findAll();
	}
	
	public void addEvaluation(Evaluation formateur) {
		formateurRepo.save(formateur);
	}
	
	public Optional<Evaluation> getSingleEvaluation(Long id) {
		return formateurRepo.findById(id);
	}
	
	public void updateEvaluation(Long id, Evaluation formateur) {
		formateurRepo.save(formateur);
	}
	
	public void deleteEvaluation(Long id) {
		formateurRepo.deleteById(id);
	}
	
	
}
