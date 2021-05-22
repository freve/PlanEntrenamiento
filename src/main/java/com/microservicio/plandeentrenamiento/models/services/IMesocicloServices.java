package com.microservicio.plandeentrenamiento.models.services;

import java.util.List;

import com.microservicio.plandeentrenamiento.models.entity.Mesociclo;

public interface IMesocicloServices {

	public List<Mesociclo> ListarTodos();
	public void guardar (Mesociclo Mesociclo);
	public Mesociclo buscarporId(Long Mesociclo);
	public void eliminar(Long id_mesociclo);
}
