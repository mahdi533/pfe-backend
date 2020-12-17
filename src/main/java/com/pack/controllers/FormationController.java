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

import com.pack.models.Formation;
import com.pack.service.FormationService;

@CrossOrigin(origins = "*")
@RequestMapping("/api")
@RestController
public class FormationController {

	@Autowired
	FormationService formationService;

	@RequestMapping("/formations")
	@PreAuthorize("hasRole('ADMIN')")
	public List<Formation> getFormation() {
		System.out.println(formationService.getAllFormation());
		return (List<Formation>) formationService.getAllFormation();

	}

	@RequestMapping(method = RequestMethod.POST, value = "/formations")
	public void addFormation(@RequestBody Formation formation) {
		System.out.println(formation.toString());
		formationService.addFormation(formation);
	}

	@RequestMapping("/formations/{id}")
	public Optional<Formation> getSingleFormation(@PathVariable Long id) {
		return formationService.getSingleFormation(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/formations/{id}")
	public void updateFormation(@RequestBody Formation formation, @PathVariable Long id) {
		System.out.println(formation.toString());
		System.out.println("id:= "+id);
		formationService.updateFormation(id, formation);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/formations/{id}")
	public void deleteFormation(@PathVariable Long id) {
		formationService.deleteFormation(id);
	}

}
