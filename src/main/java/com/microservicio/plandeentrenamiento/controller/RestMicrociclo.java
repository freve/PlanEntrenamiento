package com.microservicio.plandeentrenamiento.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.plandeentrenamiento.models.entity.Microciclo;
import com.microservicio.plandeentrenamiento.models.repository.MicrocicloRepository;

@RestController
@RequestMapping("/microciclos")
public class RestMicrociclo {

	@Autowired
	private MicrocicloRepository MicrocicloRepository;

	
	@GetMapping
	public List<Microciclo> getMicrociclo() {
		return (List<Microciclo>) MicrocicloRepository.findAll();

	}
	
	@RequestMapping(value="{id_microciclo}")
	public Microciclo getPlanEntrenamientoById(@PathVariable("id_microciclo") Long id_microciclo) {
    Optional <Microciclo> optionalMicrociclo = MicrocicloRepository.findById(id_microciclo);
	if(optionalMicrociclo.isPresent()) {
	 return optionalMicrociclo.get();	
	}else {
		return null;	
	}
	
}
	@PostMapping
	public Microciclo createMicrociclo(@RequestBody Microciclo microciclo) {
		return MicrocicloRepository.save(microciclo);
	}
	
	
}
