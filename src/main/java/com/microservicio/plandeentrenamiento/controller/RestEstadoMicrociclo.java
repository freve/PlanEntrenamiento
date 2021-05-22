package com.microservicio.plandeentrenamiento.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.plandeentrenamiento.models.entity.EstadoMicrociclo;
import com.microservicio.plandeentrenamiento.models.repository.EstadoMicrocicloRepository;

@RestController
@RequestMapping("/estadosMicrociclo")
public class RestEstadoMicrociclo {


	@Autowired
	private EstadoMicrocicloRepository estadoMicrocicloRepository;

	
	@GetMapping
	public List<EstadoMicrociclo> getEstadoMicrociclo() {
		return (List<EstadoMicrociclo>) estadoMicrocicloRepository.findAll();

	}
	
	@RequestMapping(value="{id_estadoMicrociclo}")
	public EstadoMicrociclo getPlanEntrenamientoById(@PathVariable("id_estadoMicrociclo") Long id_estadoMicrociclo) {
    Optional <EstadoMicrociclo> optionalEstadoMicrociclo = estadoMicrocicloRepository.findById(id_estadoMicrociclo);
	if(optionalEstadoMicrociclo.isPresent()) {
	 return optionalEstadoMicrociclo.get();	
	}else {
		return null;	
	}
	
}
	
}
