package com.microservicio.plandeentrenamiento.models.services;

import java.util.List;

import com.microservicio.plandeentrenamiento.models.entity.Equipo;


public interface IEquipoServices {
	public List<Equipo> ListarTodos();
	public void guardar (Equipo Equipo);
	public Equipo buscarporId(Long Equipo);
	public void eliminar(Long id_equipo);
}
