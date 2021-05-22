package com.microservicio.plandeentrenamiento.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservicio.plandeentrenamiento.models.entity.SesionEntrenamiento;
import com.microservicio.plandeentrenamiento.models.repository.SesionRepository;

public class SesionServicesImp implements ISesionServices {

	@Autowired /* declaracion de dependencia */
 	private SesionRepository sesionRepository;
	
	@Override
	public List<SesionEntrenamiento> ListarTodos() {
		return (List<SesionEntrenamiento>) sesionRepository.findAll();
	}

	@Override
	public void guardar(SesionEntrenamiento SesionEntrenamiento) {
		 sesionRepository.save(SesionEntrenamiento);

	}

	@Override
	public SesionEntrenamiento buscarporId(Long id_sesionentrenamiento) {
		return sesionRepository.findById(id_sesionentrenamiento).orElse(null);
	}

	@Override
	public void eliminar(Long id_sesionentrenamiento) {
		sesionRepository.deleteById(id_sesionentrenamiento);

	}

}
