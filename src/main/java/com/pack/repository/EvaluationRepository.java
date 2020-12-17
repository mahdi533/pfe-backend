package com.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.pack.models.Evaluation;


@RestController
public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {

}
