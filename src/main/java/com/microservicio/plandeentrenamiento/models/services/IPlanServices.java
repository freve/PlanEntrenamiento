package com.microservicio.plandeentrenamiento.models.services;

import java.util.List;

import com.microservicio.plandeentrenamiento.models.entity.PlanEntrenamiento;

public interface IPlanServices {

	public List<PlanEntrenamiento> ListarTodos();
	public void guardar (PlanEntrenamiento PlanEntrenamiento);
	public PlanEntrenamiento buscarporId(Long id_planentrenamiento);
	public void eliminar(Long id_planentrenamiento);
	
}
