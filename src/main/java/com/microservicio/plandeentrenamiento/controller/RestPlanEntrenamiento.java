package com.microservicio.plandeentrenamiento.controller;

import com.microservicio.plandeentrenamiento.models.entity.*;
import com.microservicio.plandeentrenamiento.models.repository.PlanRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planesentrenamiento")
public class RestPlanEntrenamiento {
	
	
	@Autowired
	private PlanRepository planRepository;

	
	@GetMapping
	public List<PlanEntrenamiento> getPlanEntrenamiento() {
		return (List<PlanEntrenamiento>) planRepository.findAll();

	}
	
	@RequestMapping(value="{id_planentrenamiento}")
	public PlanEntrenamiento getPlanEntrenamientoById(@PathVariable("id_planentrenamiento") Long id_planentrenamiento) {
    Optional <PlanEntrenamiento> optionalPlan = planRepository.findById(id_planentrenamiento);
	if(optionalPlan.isPresent()) {
	 return optionalPlan.get();	
	}else {
		return null;	
	}

	}
	
	@PostMapping
	public PlanEntrenamiento createPlanEntrenamiento(@RequestBody PlanEntrenamiento planEntrenamiento) {
		return planRepository.save(planEntrenamiento);
	}

}
