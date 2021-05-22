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

import com.microservicio.plandeentrenamiento.models.entity.Equipo;
import com.microservicio.plandeentrenamiento.models.repository.EquipoRepository;

@RestController
@RequestMapping("/equipos")
public class RestEquipos {

	@Autowired
	private EquipoRepository equipoRepository;

	@GetMapping
	public List<Equipo> getEquipos() {
		return (List<Equipo>) equipoRepository.findAll();
	}
	
	@RequestMapping(value="{id_equipo}")
	public Equipo getPlanEntrenamientoById(@PathVariable("id_equipo") Long id_equipo) {
    Optional <Equipo> optionalEquipo = equipoRepository.findById(id_equipo);
	if(optionalEquipo.isPresent()) {
	 return optionalEquipo.get();	
	}else {
		return null;	
	}

	
	
	}
	@PostMapping
	public Equipo createEquipo(@RequestBody Equipo equipo) {
		return equipoRepository.save(equipo);
	}
	
	
	
	
	

}
