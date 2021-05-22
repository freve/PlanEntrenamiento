package com.microservicio.plandeentrenamiento.models.services;

import java.util.List;

import com.microservicio.plandeentrenamiento.models.entity.SesionEntrenamiento;

public interface ISesionServices {

	public List<SesionEntrenamiento> ListarTodos();
	public void guardar (SesionEntrenamiento SesionEntrenamiento);
	public SesionEntrenamiento buscarporId(Long id_sesionentrenamiento);
	public void eliminar(Long id_sesionentrenamiento);
}
