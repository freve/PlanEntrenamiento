package com.microservicio.plandeentrenamiento.models.services;

import java.util.List;

import com.microservicio.plandeentrenamiento.models.entity.Microciclo;

public interface IMicrocicloServices {

	public List<Microciclo> ListarTodos();
	public void guardar (Microciclo Microciclo);
	public Microciclo buscarporId(Long Microciclo);
	public void eliminar(Long id_microciclo);
}
