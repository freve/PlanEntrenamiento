package com.microservicio.plandeentrenamiento.controller;

import com.microservicio.plandeentrenamiento.models.entity.*;
import com.microservicio.plandeentrenamiento.models.repository.SesionRepository;

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
@RequestMapping("/sesionesentrenamiento")
public class RestSesionEntrenamiento {
	
	
	@Autowired
	private SesionRepository sesionRepository;

	
	@GetMapping
	public List<SesionEntrenamiento> getSesionEntrenamiento() {
		return (List<SesionEntrenamiento>) sesionRepository.findAll();

	}
	
	@RequestMapping(value="{id_sesionentrenamiento}")
	public SesionEntrenamiento getSesionEntrenamientoById(@PathVariable("id_sesionentrenamiento") Long id_sesionentrenamiento) {
    Optional <SesionEntrenamiento> optionalSesion = sesionRepository.findById(id_sesionentrenamiento);
	if(optionalSesion.isPresent()) {
	 return optionalSesion.get();	
	}else {
		return null;	
	}

	}
	
	@PostMapping
	public SesionEntrenamiento createSesionEntrenamiento(@RequestBody SesionEntrenamiento sesionEntrenamiento) {
		return sesionRepository.save(sesionEntrenamiento);
	}
	

}