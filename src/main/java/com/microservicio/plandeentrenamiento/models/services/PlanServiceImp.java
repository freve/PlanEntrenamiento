package com.microservicio.plandeentrenamiento.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.plandeentrenamiento.models.entity.PlanEntrenamiento;
import com.microservicio.plandeentrenamiento.models.repository.PlanRepository;

@Service
public class PlanServiceImp implements IPlanServices {
	
	@Autowired /* declaracion de dependencia */
 	private PlanRepository planRepository;

	@Override
	public List<PlanEntrenamiento> ListarTodos() {
		
		return (List<PlanEntrenamiento>) planRepository.findAll();
	}

	@Override
	public void guardar(PlanEntrenamiento PlanEntrenamiento) {
		planRepository.save(PlanEntrenamiento);

	}

	@Override
	public PlanEntrenamiento buscarporId(Long id_planentrenamiento) {
		return planRepository.findById(id_planentrenamiento).orElse(null);
	}

	@Override
	public void eliminar(Long id_planentrenamiento) {
		planRepository.deleteById(id_planentrenamiento);

	}

}
