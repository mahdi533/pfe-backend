package com.pack.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pack.models.Evaluation;
import com.pack.service.EvaluationService;

@CrossOrigin(origins = "*")
@RequestMapping("/api")
@RestController
public class EvaluationController {

	@Autowired
	EvaluationService evaluationService;

	@RequestMapping("/evaluations")
	@PreAuthorize("hasRole('ADMIN')")
	public List<Evaluation> getEvaluation() {
		return (List<Evaluation>) evaluationService.getAllEvaluation();

	}

	@RequestMapping(method = RequestMethod.POST, value = "/evaluations")
	public void addEvaluation(@RequestBody Evaluation evaluation) {
		System.out.println(evaluation.toString());
		evaluationService.addEvaluation(evaluation);
	}

	@RequestMapping("/evaluations/{id}")
	public Optional<Evaluation> getSingleEvaluation(@PathVariable Long id) {
		return evaluationService.getSingleEvaluation(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/evaluations/{id}")
	public void updateEvaluation(@RequestBody Evaluation evaluation, @PathVariable Long id) {
		System.out.println(evaluation.toString());
		System.out.println("id:= "+id);
		evaluationService.updateEvaluation(id, evaluation);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/evaluations/{id}")
	public void deleteEvaluation(@PathVariable Long id) {
		evaluationService.deleteEvaluation(id);
	}

}
