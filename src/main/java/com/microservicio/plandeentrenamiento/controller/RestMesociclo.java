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

import com.microservicio.plandeentrenamiento.models.entity.Mesociclo;
import com.microservicio.plandeentrenamiento.models.repository.MesocicloRepository;

@RestController
@RequestMapping("/mesociclos")
public class RestMesociclo {

	@Autowired
	private MesocicloRepository mesocicloRepository;

	
	@GetMapping
	public List<Mesociclo> getMesociclo() {
		return (List<Mesociclo>) mesocicloRepository.findAll();

	}
	
	@RequestMapping(value="{id_mesociclo}")
	public Mesociclo getPlanEntrenamientoById(@PathVariable("id_mesociclo") Long id_mesociclo) {
    Optional <Mesociclo> optionalMesociclo = mesocicloRepository.findById(id_mesociclo);
	if(optionalMesociclo.isPresent()) {
	 return optionalMesociclo.get();	
	}else {
		return null;	
	}
	
}
	
	@PostMapping
	public Mesociclo createMesociclo(@RequestBody Mesociclo mesociclo) {
		return mesocicloRepository.save(mesociclo);
	}
	
}
