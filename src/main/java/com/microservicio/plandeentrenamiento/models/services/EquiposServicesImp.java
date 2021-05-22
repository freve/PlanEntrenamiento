package com.microservicio.plandeentrenamiento.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservicio.plandeentrenamiento.models.entity.Equipo;
import com.microservicio.plandeentrenamiento.models.repository.EquipoRepository;

public class EquiposServicesImp implements IEquipoServices {
	
	@Autowired /* declaracion de dependencia */
 	private EquipoRepository equipoRepository;
	
	
	@Override
	public List<Equipo> ListarTodos() {
		return (List<Equipo>) equipoRepository.findAll();
	
	}

	@Override
	public void guardar(Equipo Equipo) {
		equipoRepository.save(Equipo);

	}

	@Override
	public Equipo buscarporId(Long Equipo) {
		return equipoRepository.findById(Equipo).orElse(null);
	}

	@Override
	public void eliminar(Long id_equipo) {
		equipoRepository.deleteById(id_equipo);

	}

}
